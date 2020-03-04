package nest.hana.EagerDeveloper.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
//@EnableScheduling //스케쥴링은 쿼츠 구현 예정
public class EagerDeveloperConfigration {

    @Value("${selenium.use}")
    private boolean seleniumUse;

    @PostConstruct
    public void init() throws Exception {
    }

    public void advice(){

    }

}
