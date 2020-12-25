package com.billcom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//@ImportResource({ "classpath:applicationContext.xml" })

@SpringBootApplication
@ComponentScan(basePackages="com.billcom")
public class SpGcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpGcApplication.class, args);
	}

}
