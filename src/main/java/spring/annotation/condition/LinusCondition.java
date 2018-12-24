package spring.annotation.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

//linux操作系统的判断条件
public class LinusCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String osName = conditionContext.getEnvironment().getProperty("os.name");
        if(osName.contains("linux")){
            return true;
        }
        
        return false;
    }
}
