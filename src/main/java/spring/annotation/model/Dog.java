package spring.annotation.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * 4）、BeanPostProcessor【interface】：bean的后置处理器；
 * 		在bean初始化前后进行一些处理工作；
 * 		postProcessBeforeInitialization:在初始化之前工作
 * 		postProcessAfterInitialization:在初始化之后工作
 */

@Component
public class Dog implements ApplicationContextAware {


    public Dog(){
        System.out.println("dog constructor...");
    }

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    private void postConstruct(){
        System.out.println("postConstruct...初始化");
    }

    @PreDestroy
    private void PreDestroy(){
        System.out.println("PreDestroy...初始化");
    }


}
