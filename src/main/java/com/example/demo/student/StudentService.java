package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Yoann",
                        "yoyo.mail@gmail.com",
                        LocalDate.of(2022, Month.SEPTEMBER, 19),
                        36
                )
        );
    }


}
