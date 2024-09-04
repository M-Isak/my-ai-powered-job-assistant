package com.my_ai_powered_job_assistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class JobAssistantAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobAssistantAiApplication.class, args);
	}

}
