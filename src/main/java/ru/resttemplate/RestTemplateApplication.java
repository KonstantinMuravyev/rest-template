package ru.resttemplate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.resttemplate.service.UserService;

@SpringBootApplication
public class RestTemplateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RestTemplateApplication.class, args);

		UserService userService = context.getBean("userService", UserService.class);
		System.out.println("Answer: " + userService.getAnswer());
	}
}
