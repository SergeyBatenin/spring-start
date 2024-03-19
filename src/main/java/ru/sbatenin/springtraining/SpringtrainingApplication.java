package ru.sbatenin.springtraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.sbatenin.springtraining.homework1.StudentController;

@SpringBootApplication
public class SpringtrainingApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringtrainingApplication.class, args);

		StudentController controller = context.getBean(StudentController.class);

	}

}
