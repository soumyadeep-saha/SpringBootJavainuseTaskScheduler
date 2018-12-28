package com.soumyadeep.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootJavainuseTaskSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJavainuseTaskSchedulerApplication.class, args);
	}

}

