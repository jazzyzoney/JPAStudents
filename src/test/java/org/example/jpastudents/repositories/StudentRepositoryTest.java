package org.example.jpastudents.repositories;

import org.example.jpastudents.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void testFindAllByName() {
        List<Student> students = studentRepository.findAllByName("John Doe");
        int expected = 1;
        assertEquals(expected, students.size());
    }


}