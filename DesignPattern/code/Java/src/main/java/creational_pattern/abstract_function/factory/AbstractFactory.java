package creational_pattern.abstract_function.factory;

import creational_pattern.abstract_function.bean.ColorBean;
import creational_pattern.abstract_function.bean.ShapeBean;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/10/18
 */
public interface AbstractFactory {

    ColorBean createColor();

    ShapeBean createShape();

}
