package creational_pattern.factory_method.product.impl;

import creational_pattern.factory_method.product.Car;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/24
 */
public class ElectricCar extends Car {

    private String featureElectric;

    public String getFeatureElectric() {
        return featureElectric;
    }

    public void setFeatureElectric(String featureElectric) {
        this.featureElectric = featureElectric;
    }

    @Override
    public String toString() {
        return "ElectricCar{" + "featureElectric='" + featureElectric + '\'' + "} " + super.toString();
    }
}
