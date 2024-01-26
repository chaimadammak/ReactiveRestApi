package com.ChaimaDAMMAK.ReactiveRestApi;

import com.ChaimaDAMMAK.ReactiveRestApi.Students.Student;
import com.ChaimaDAMMAK.ReactiveRestApi.Students.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveRestApiApplication.class, args);
	}



	//Voir des données pretes à l'emploi dans la base dés le démarrage de l'application
	@Bean
	public CommandLineRunner CommandLineRunner(StudentService studentService){
		return args -> {
			for (int i=0; i<100; i++){
				studentService.save(Student.builder().
						Firstname("Chaima"+ i).
						Lastname("DAMMAK"+i).
						age(i).
						build()).subscribe();
			}
		};
	}
}
