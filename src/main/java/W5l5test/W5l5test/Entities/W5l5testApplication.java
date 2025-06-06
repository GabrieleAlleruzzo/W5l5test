package W5l5test.W5l5test.Entities;

import W5l5test.W5l5test.Configurazione.Appconfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class W5l5testApplication {

	public static void main(String[] args) {
		SpringApplication.run(W5l5testApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfiguration.class);
	}

}
