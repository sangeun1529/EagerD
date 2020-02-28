package nest.hana.lazyDeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication app= new SpringApplication();
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(Application.class, args);
    }
}
