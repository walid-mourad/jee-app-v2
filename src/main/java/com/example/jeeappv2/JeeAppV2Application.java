package com.example.jeeappv2;

import com.example.jeeappv2.entities.Patient;
import com.example.jeeappv2.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JeeAppV2Application {

    public static void main(String[] args) {
        SpringApplication.run(JeeAppV2Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"walid",new Date(),false,12));
            patientRepository.save(new Patient(null,"taha",new Date(),true,132));
            patientRepository.save(new Patient(null,"mehdi",new Date(),false,100));
            patientRepository.save(new Patient(null,"omar",new Date(),true,102));
            patientRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());
            });
        };
    }
}
