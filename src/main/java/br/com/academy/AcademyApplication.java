package br.com.academy;

import org.springframework.boot.SpringApplication;
import javax.persistence.Entity;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Entity
@SpringBootApplication
public class AcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademyApplication.class, args);
		
	}

}
