package org.example.jpastudents.config;
import org.example.jpastudents.model.Student;
import org.example.jpastudents.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setName("John Doe");
        student.setBornDate(LocalDate.of(2000, 1, 1));
        student.setBornTime(LocalTime.of(12, 0));
        studentRepository.save(student);
        Student student2 = new Student();
        student2.setName("Tim Doe");
        student2.setBornDate(LocalDate.of(2001, 2, 2));
        student2.setBornTime(LocalTime.of(13, 0));
        studentRepository.save(student2);


    }
}
