package COM.CHASE.java.Example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import COM.CHASE.java.Example.controller.Controller;

@SpringBootApplication
@ComponentScan(basePackages = "COM.CHASE.java.Example", basePackageClasses = Controller.class)
public class application {

	public static void main(String[] args) {
		SpringApplication.run(application.class, args);
	}

}
