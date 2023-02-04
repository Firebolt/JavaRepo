package com.medi.StudentDataRestApi;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MainController {
	@Autowired
	private StudentRepo studentRepo;

	@GetMapping(path = "/")
	public  @ResponseBody String welcome(){
		return "Welcome to the student database api";
	}
	@PostMapping(path="/restapi/std")
	public @ResponseBody String addNewStud (@RequestBody Student student) {
		studentRepo.save(student);
		return "Saved";
	}
	@GetMapping(path="/restapi/std")
	public @ResponseBody Iterable<Student> getStud(@RequestParam Integer stdid) {
		return studentRepo.findStudentByStdId(stdid);
	}
	@DeleteMapping(path="/restapi/std")
	public @ResponseBody String deleteStud(@RequestParam Integer stdid) {
		studentRepo.deleteStudentByStdId(stdid);
		return "removed";
	}
	@GetMapping(path="/restapi/getstdall")
	public @ResponseBody Iterable<Student> getStuds() {
		return studentRepo.findAll();
	}
	@GetMapping(path="/restapi/stdfac")
	public @ResponseBody Iterable<Student> getStud(@RequestParam String fac) {
		return studentRepo.findStudentByFaculty(fac);
	}

}
