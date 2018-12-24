package spring.annotation.config;

import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;
import spring.annotation.condition.LinusCondition;
import spring.annotation.condition.WinCondition;
import spring.annotation.factory.ColorBeanFactory;
import spring.annotation.model.Color;
import spring.annotation.model.Person;
import spring.annotation.model.Red;

import java.util.Set;

//@Conditional(value = WinCondition.class)
@Configuration
@Import({Red.class, Color.class,MyImporeSelector.class})
public class MyConfigAnn2 {

    @Bean("person01")
    public Person person01(){
        return new Person("jeet",10);
    }

    @Bean("person02")
    public Person person02(){
        return new Person("user",31);
    }


    @Conditional(LinusCondition.class)
    @Bean("linus")
    public Person linus(){
        return new Person("linus",33);
    }

    @Conditional(WinCondition.class)
    @Bean("bill")
    public Person bill(){
        return new Person("bill",44);
    }

    /**
     * 给容器中注册组件方式
     *  1：通过扫描基础包+注解
     *  2：@Bean
     *  3：import
     *      import
     *      importselector
     *      importRegister
     *  4：BeanFactory
     *
     *
     */
    @Bean
    public ColorBeanFactory getFactory(){
        return new ColorBeanFactory();
    }

}

class MyImporeSelector implements ImportSelector{


    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        Set<MethodMetadata> methodMetadata = annotationMetadata.getAnnotatedMethods("controller");
        for (MethodMetadata ss: methodMetadata){
            System.out.println("======》" + ss.getMethodName());
        }

        return new String[]{"spring.annotation.model.ImportSelector"};
    }
}