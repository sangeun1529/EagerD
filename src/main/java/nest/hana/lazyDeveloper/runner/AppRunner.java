package nest.hana.lazyDeveloper.runner;


import nest.hana.lazyDeveloper.config.LazyDeveloperConfigration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Runner start!!");



    }
}
