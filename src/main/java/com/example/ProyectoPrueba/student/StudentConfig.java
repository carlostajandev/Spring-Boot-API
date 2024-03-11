package com.example.ProyectoPrueba.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
             Student carlos = new Student(
                    "Carlos",
                    "carlostajan@gmail.com",
                    LocalDate.of(2000, Month.MAY,15)

            );
             Student juan = new Student(
                    "Carlos",
                    "carlostajan@gmail.com",
                    LocalDate.of(2000, Month.MAY,15)

            );
             Student angela = new Student(
                    "Carlos",
                    "carlostajan@gmail.com",
                    LocalDate.of(2011, Month.MAY,15)

            );
            repository.saveAll(
                    List.of(carlos, juan, angela)
            );
        };
    }
}
