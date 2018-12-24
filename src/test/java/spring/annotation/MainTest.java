package spring.annotation;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.annotation.config.MyConfigAnn;
import spring.annotation.config.MyConfigAnn2;
import spring.annotation.model.Person;

import java.util.Map;

// java bean扫描的数据
public class MainTest {

//    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigAnn.class);
    private AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigAnn2.class);

    //根据beanFactory
    @Test
    public void test03(){
//        printBeans(applicationContext);

        Object object = applicationContext.getBean("getFactory");
        Object object1 = applicationContext.getBean("getFactory");
        System.out.println(object);
        System.out.println(object1);

        applicationContext.close();
    }

    //根据条件加载bean
    @Test
    public void test02(){
        printBeans(applicationContext);

        Map<String , Person> map = applicationContext.getBeansOfType(Person.class);

        System.out.println(map);
    }

    @Test
    public void test01(){
        printBeans(applicationContext);
    }

    private void printBeans(ApplicationContext applicationContext) {

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String bean :beanDefinitionNames){
            System.out.println(bean);
        }

    }

}
