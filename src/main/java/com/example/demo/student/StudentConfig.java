package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.MARCH;
import static java.time.Month.SEPTEMBER;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner( StudentRepository repository){
        return args -> {
             Student yoyo = new Student(
                    "Yoann",
                    "yoyo.mail@gmail.com",
                    LocalDate.of(1986, SEPTEMBER, 19)

            );

            Student sof = new Student(
                    "Sofi",
                    "sofi.mail@gmail.com",
                    LocalDate.of(1989,MARCH, 5)

            );

            repository.saveAll(
                    List.of(yoyo, sof)
            );
        };
    }
}
