package nest.hana.EagerDeveloper.context;

import nest.hana.EagerDeveloper.config.EagerDeveloperConfigration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EagerDeveloperContext implements ApplicationContextAware {

    private static ApplicationContext CONTEXT;

    @Autowired
    EagerDeveloperConfigration lazyDeveloperConfigration;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CONTEXT = applicationContext;
    }
    @PostConstruct
    public void initContext(){
    }


}