package dev.danvega.Contentcalender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ContentCalender {

	public static void main(String[] args) {

		//SpringApplication.run(ContentCalender.class, args);
		//To get active Beans when running the app;
		 ConfigurableApplicationContext var = SpringApplication.run(ContentCalender.class, args);
	Arrays.stream(var.getBeanDefinitionNames()).forEach(System.out::println);
	}

	//Write more some code

}
