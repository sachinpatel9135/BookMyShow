package com.example.bookmyshowApp;


import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@SpringBootApplication
public class BookmyshowAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmyshowAppApplication.class, args);
	}
	
	/*
	 * @Bean public DataSource dataSource() { return new EmbeddedDatabaseBuilder()
	 * .setType(EmbeddedDatabaseType.H2)
	 * .addScript("classpath:exportscriptfile.sql") .build(); }
	 */

}
