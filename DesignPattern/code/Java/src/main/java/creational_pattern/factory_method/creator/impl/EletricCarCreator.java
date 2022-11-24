package creational_pattern.factory_method.creator.impl;

import creational_pattern.factory_method.creator.CarCreator;
import creational_pattern.factory_method.product.Car;
import creational_pattern.factory_method.product.impl.ElectricCar;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/24
 */
public class EletricCarCreator implements CarCreator {


    @Override
    public Car createCar(Integer type) {
        ElectricCar car = new ElectricCar();
        if (type == 1) {
            car.setColor("3");
            car.setWheel(3);
        } else {
            car.setColor("4");
            car.setWheel(4);
        }
        car.setFeatureElectric("ElectricCar");
        return car;
    }
}
