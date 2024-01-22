package com.itvedant.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itvedant.sms.entity.Student;
import com.itvedant.sms.repository.StudentRepository;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("zarna", "mankar", "zarnamankar@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("nikita", "mankar", "nikitamankar@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("nidhi","mankar","nidhimankar@gmail.com");
		studentRepository.save(student3);
		
		Student student4 = new Student("divya", "Borekar","divyaborekar@gmail.com");
		studentRepository.save(student4);
		
		
	}

}
