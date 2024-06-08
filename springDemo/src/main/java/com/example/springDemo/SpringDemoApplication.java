package com.example.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@Autowired ->Dependency Injection
//@Component -> this let the application to scan all the classes that have this annocation and return the object [ bean ]


/**
 * @SpringBootApplication -> @ComponentScan + @EnableAutoConfiguration + @Configuration
 *
 * @GetMapping -> ?
 *
 */



@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
