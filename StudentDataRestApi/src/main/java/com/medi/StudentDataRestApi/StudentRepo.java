package com.medi.StudentDataRestApi;


import com.medi.StudentDataRestApi.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    Iterable<Student> findStudentByStdId(Integer stdid);
    Iterable<Student>  findStudentByFaculty(String faculty);
    @Transactional
    void deleteStudentByStdId(Integer stdid);
}
