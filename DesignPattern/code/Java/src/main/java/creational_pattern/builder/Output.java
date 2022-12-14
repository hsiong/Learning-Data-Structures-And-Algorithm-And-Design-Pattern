package creational_pattern.builder;

import creational_pattern.builder.build.CarBuilder;
import creational_pattern.builder.build.impl.ElectricCarBuilder;
import creational_pattern.builder.build.impl.GasCarBuilder;
import creational_pattern.builder.director.BuilderDirector;
import creational_pattern.builder.product.ElectricCarProduct;
import creational_pattern.builder.product.GasCarProduct;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/22
 */
public class Output {

    public static void main(String[] args) {
        
        // new Builder
        CarBuilder gasCarBuilder = new GasCarBuilder();
        CarBuilder electricCarBuilder = new ElectricCarBuilder();

        // new Director(builder)
        BuilderDirector builderDirector = new BuilderDirector();
        
        // Construct
        GasCarProduct gasCarProduct = builderDirector.buildGasCar(gasCarBuilder);
        ElectricCarProduct electricCarProduct = builderDirector.buildElectricCar(electricCarBuilder);
        
        // Out
        System.out.println(gasCarProduct);
        System.out.println(electricCarProduct);
    }
    
}
