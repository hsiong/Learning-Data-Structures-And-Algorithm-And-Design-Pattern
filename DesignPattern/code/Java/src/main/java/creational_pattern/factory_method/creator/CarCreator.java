package creational_pattern.factory_method.creator;

import creational_pattern.factory_method.product.Car;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/24
 */
public interface CarCreator {

    Car createCar(Integer type);

}
