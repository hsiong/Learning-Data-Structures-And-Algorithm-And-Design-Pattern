package creational_pattern.factory_method.creator.impl;

import creational_pattern.factory_method.creator.CarCreator;
import creational_pattern.factory_method.product.Car;
import creational_pattern.factory_method.product.impl.GasCar;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/24
 */
public class GasCarCreator implements CarCreator {
    
    @Override
    public Car createCar(Integer type) {
        GasCar car = new GasCar();
        if (type == 1) {
            car.setColor("1");
            car.setWheel(1);
        } else {
            car.setColor("0");
            car.setWheel(0);
        }
        car.setFeatureGas("GasCar");
        return car;
    }
}
