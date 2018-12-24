package spring.annotation.factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import spring.annotation.model.Color;

public class ColorBeanFactory implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        System.out.println("getObject...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
