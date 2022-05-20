package com.springamigos.amigosbootcamp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

           Student mariam = new Student(

                    "Mariam",
                    "mariam.jamel@gmail.com",
                    LocalDate.of(2000, Month.APRIL,5),
                    22

            );
            Student alex =new Student(

                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1996, Month.APRIL,7),
                    22

            );
            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
