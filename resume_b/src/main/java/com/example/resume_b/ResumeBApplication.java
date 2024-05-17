package com.example.resume_b;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapper")
public class ResumeBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeBApplication.class, args);
	}

}
