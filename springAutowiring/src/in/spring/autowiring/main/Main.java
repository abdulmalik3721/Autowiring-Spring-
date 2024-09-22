package in.spring.autowiring.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.spring.autowiring.beans.Student;
import in.spring.autowiring.resources.SpringConfigFile;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
	Student std=context.getBean(Student.class);
	std.display();

	}

}
