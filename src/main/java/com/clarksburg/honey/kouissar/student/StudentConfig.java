package com.clarksburg.honey.kouissar.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student rafik = new Student( "Rafik", "rafik@gmail.com", LocalDate.of(1990, Month.JANUARY, 5));
			Student joe = new Student( "Joe", "joe@gmail.com", LocalDate.of(2010, Month.APRIL, 10));

	repository.saveAll(List.of(rafik, joe));
	};
}
}
