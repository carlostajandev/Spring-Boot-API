package com.example.ProyectoPrueba;

import com.example.ProyectoPrueba.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.List;

@SpringBootApplication

public class ProyectoPruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPruebaApplication.class, args);
	}


}
