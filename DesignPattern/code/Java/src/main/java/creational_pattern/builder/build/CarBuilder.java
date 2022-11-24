package creational_pattern.builder.build;

/**
 * 〈Builder interface defines all possible ways to configure a product.〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/22
 */
public interface CarBuilder {

    CarBuilder addEngine(Float type);

    CarBuilder addWheel(Integer wheel);

    CarBuilder paint(String color);
}
