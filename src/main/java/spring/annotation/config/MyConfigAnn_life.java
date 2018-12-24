package spring.annotation.config;

import org.springframework.context.annotation.*;
import spring.annotation.filter.MyFilter;
import spring.annotation.model.Cat;
import spring.annotation.model.Customer;
import spring.annotation.model.Person;

//测试声明周期
@ComponentScan(value = "spring.annotation")
@Configuration
public class MyConfigAnn_life {

    @Bean(initMethod = "init",destroyMethod = "destory")
    public Cat cat01(){
        return new Cat();
    }

    @Bean
    public Customer Customer(){
        return new Customer();
    }


}
