package creational_patterns.abstract_function.factory.standard.impl;

import creational_patterns.abstract_function.factory.standard.StandardAFactory;
import creational_patterns.abstract_function.bean.ColorBean;
import creational_patterns.abstract_function.bean.ShapeBean;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/18
 */
public class StandardAFactoryImpl implements StandardAFactory {
    
    @Override
    public ColorBean createColor() {
        return new ColorBean("standardA-color");
    }

    @Override
    public ShapeBean createShape() {
        return new ShapeBean(1);
    }
}
