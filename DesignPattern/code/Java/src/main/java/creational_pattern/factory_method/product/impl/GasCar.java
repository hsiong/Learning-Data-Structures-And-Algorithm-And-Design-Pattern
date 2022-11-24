package creational_pattern.factory_method.product.impl;

import creational_pattern.factory_method.product.Car;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/24
 */
public class GasCar extends Car {

    private String featureGas;

    public String getFeatureGas() {
        return featureGas;
    }

    public void setFeatureGas(String featureGas) {
        this.featureGas = featureGas;
    }

    @Override
    public String toString() {
        return "GasCar{" + "featureGas='" + featureGas + '\'' + '}' + super.toString();
    }
}
