package creational_pattern.factory_method;

import creational_pattern.factory_method.creator.CarCreator;
import creational_pattern.factory_method.creator.impl.EletricCarCreator;
import creational_pattern.factory_method.product.Car;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/24
 */
public class Output {

    public static void main(String[] args) {
        CarCreator creator = new EletricCarCreator();
        Car car = creator.createCar(1);
        System.out.println(car);
    }
    
}
