package spring.annotation;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.annotation.config.MyConfigAnn2;
import spring.annotation.config.MyConfigAnn_life;
import spring.annotation.model.Person;

import java.util.Map;

// java bean扫描的数据
public class MainTest_life {

    private AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigAnn_life.class);

    //根据beanFactory
    @Test
    public void test04(){

        applicationContext.close();
    }

    //根据beanFactory
    @Test
    public void test03(){

        applicationContext.getBean("cat01");

        applicationContext.close();
    }

}
