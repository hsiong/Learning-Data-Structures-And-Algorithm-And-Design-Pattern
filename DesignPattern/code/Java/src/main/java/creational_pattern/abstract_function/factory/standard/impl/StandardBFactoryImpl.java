package creational_pattern.abstract_function.factory.standard.impl;

import creational_pattern.abstract_function.bean.ColorBean;
import creational_pattern.abstract_function.bean.ShapeBean;
import creational_pattern.abstract_function.factory.standard.StandardBFactory;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/18
 */
public class StandardBFactoryImpl implements StandardBFactory {

    @Override
    public ColorBean createColor() {
        return new ColorBean("standardB-color");
    }

    @Override
    public ShapeBean createShape() {
        return new ShapeBean(2);
    }
    
}
