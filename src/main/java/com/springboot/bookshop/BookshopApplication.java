package com.springboot.bookshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookshopApplication {

	private static final Logger LOGGER = LogManager.getLogger(BookshopApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookshopApplication.class, args);
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("This is a warn message");
        LOGGER.error("This is an error message");
        LOGGER.fatal("This is a fatal message");
	}
}
