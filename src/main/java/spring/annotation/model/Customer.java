package spring.annotation.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {

        System.out.println("destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet...初始化");

    }
}
