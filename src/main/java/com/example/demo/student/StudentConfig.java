package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args ->{
            Student jahul =new Student(
                    "Jahul",
                    "jahul.jamar@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student jabur = new Student(
                    "jabur",
                    "jabur.jamar@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)
            );
            repository.saveAll(List.of(jahul,jabur));
        };
    }

}
