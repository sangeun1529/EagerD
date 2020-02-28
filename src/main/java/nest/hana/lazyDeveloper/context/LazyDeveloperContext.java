package nest.hana.lazyDeveloper.context;

import nest.hana.lazyDeveloper.config.LazyDeveloperConfigration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LazyDeveloperContext implements ApplicationContextAware {

    private static ApplicationContext CONTEXT;

    @Autowired
    LazyDeveloperConfigration lazyDeveloperConfigration;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CONTEXT = applicationContext;
    }
    @PostConstruct
    public void postConstruct(){
        lazyDeveloperConfigration.advice();
    }


}