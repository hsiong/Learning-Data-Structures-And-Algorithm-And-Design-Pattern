package creational_patterns.builder.build.impl;

import creational_patterns.builder.build.CarBuilder;
import creational_patterns.builder.product.GasCarProduct;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/22
 */
public class GasCarBuilder implements CarBuilder {

    private Float type;
    
    private Integer wheel;
    
    private String color;
    
    
    @Override
    public CarBuilder addEngine(Float type) {
        this.type = type;
        return this;
    }

    @Override
    public CarBuilder addWheel(Integer wheel) {
        this.wheel = wheel;
        return this;
    }

    @Override
    public CarBuilder paint(String color) {
        this.color = color;
        return this;
    }
    
    // consistent with Open/Close principle & Single Responsibility principle
    public GasCarProduct build() {
        return new GasCarProduct(type, wheel, color);
    }
}
