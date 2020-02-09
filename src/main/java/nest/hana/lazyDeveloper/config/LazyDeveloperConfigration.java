package nest.hana.lazyDeveloper.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;

@Configuration
@EnableScheduling
public class LazyDeveloperConfigration {

    @Value("${selenium.use}")
    private boolean seleniumUse;

    @PostConstruct
    public void initConfig() throws Exception {
        System.out.println("configStart!!");
        System.out.println(seleniumUse);
    }
}
