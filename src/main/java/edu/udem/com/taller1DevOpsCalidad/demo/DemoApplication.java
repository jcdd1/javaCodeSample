package edu.udem.com.taller1DevOpsCalidad.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(new OperationMath().sum(5, 8));
	}

}