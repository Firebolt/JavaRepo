package com.medi.StudentDataRestApi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class InputFindTest {
    @Autowired
    private MainController mainController;

    @Autowired
    private StudentRepo studentRepo;
    @Test
    void InputSearchTest() {
        Student input = new Student(132123, "Example", "Anon", "CST", 7f);
        mainController. addNewStud(input);
        Iterable<Student> response = mainController.getStud(130267);
        assertEquals(input, response);
    }
}
