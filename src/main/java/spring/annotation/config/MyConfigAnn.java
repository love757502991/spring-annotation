package spring.annotation.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import spring.annotation.filter.MyFilter;
import spring.annotation.model.Person;

@Configuration
@ComponentScans(
    value = {
            @ComponentScan(value = "spring.annotation",includeFilters =
//            @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)
            @ComponentScan.Filter(type = FilterType.CUSTOM,value = MyFilter.class)
            ,useDefaultFilters = false)
    }
)
public class MyConfigAnn {

    @Bean("person01")
    public Person person01(){
        return new Person("jeet",10);
    }

    @Bean("person02")
    public Person person02(){
        return new Person("user",31);
    }
}
