package W5l5test.W5l5test;

import W5l5test.W5l5test.Configurazione.Appconfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

import java.time.LocalTime;
import java.util.List;

@Order
class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Appconfiguration.class);

    }
}
