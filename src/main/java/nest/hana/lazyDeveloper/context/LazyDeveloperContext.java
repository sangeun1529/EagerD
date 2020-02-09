package nest.hana.lazyDeveloper.context;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LazyDeveloperContext implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("context start!!");
    }
}