package ComponentExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("ComponentExample");
		context.refresh();

		MathComponent ms = context.getBean(MathComponent.class);

		int result = ms.add(1, 2);
		System.out.println("Addition of 1 and 2 = " + result);

		context.close();
	}

}
