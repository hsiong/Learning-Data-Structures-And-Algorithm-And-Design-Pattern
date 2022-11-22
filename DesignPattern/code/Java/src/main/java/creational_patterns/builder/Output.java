package creational_patterns.builder;

import creational_patterns.builder.build.CarBuilder;
import creational_patterns.builder.build.impl.ElectricCarBuilder;
import creational_patterns.builder.build.impl.GasCarBuilder;
import creational_patterns.builder.product.ElectricCarProduct;
import creational_patterns.builder.product.GasCarProduct;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/22
 */
public class Output {

    public static void main(String[] args) {
        CarBuilder gasCarBuilder = new GasCarBuilder();
        gasCarBuilder.addEngine(1F).paint("gas").addWheel(1);
        GasCarProduct gasCarProduct = ((GasCarBuilder) gasCarBuilder).getGasCarProduct();
        System.out.println(gasCarProduct);

        CarBuilder electricCarBuilder = new ElectricCarBuilder();
        electricCarBuilder.addEngine(2F).paint("electric").addWheel(2);
        ElectricCarProduct electricCarProduct = ((ElectricCarBuilder) electricCarBuilder).getElectricCarProduct();
        System.out.println(electricCarProduct);
    }
    
}
