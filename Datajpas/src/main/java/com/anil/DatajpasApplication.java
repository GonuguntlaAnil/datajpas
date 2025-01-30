package com.anil;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.entity.Student;
import com.anil.repo.Studentrepo;

@SpringBootApplication
public class DatajpasApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctc=SpringApplication.run(DatajpasApplication.class, args);
		Studentrepo bean = ctc.getBean(Studentrepo.class);
		List<Student> getcourses = bean.getcourses();
		for(Student ans:getcourses) {
			System.out.println(ans);
		}
		 

	
		
	}

}
