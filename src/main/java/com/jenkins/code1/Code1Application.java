package com.jenkins.code1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Code1Application {

private static final Logger logger = LoggerFactory.getLogger(Code1Application.class);

	public static void main(String[] args) {
		logger.info("Applicatiuon started Pipeline again");
		SpringApplication.run(Code1Application.class, args);
	}

}
