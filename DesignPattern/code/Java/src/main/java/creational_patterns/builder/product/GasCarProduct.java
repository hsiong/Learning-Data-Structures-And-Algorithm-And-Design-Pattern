package creational_patterns.builder.product;

import lombok.AllArgsConstructor;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/22
 */
@AllArgsConstructor
public class GasCarProduct {

    private Float type;

    private Integer wheel;

    private String color;

    @Override
    public String toString() {
        return "GasCarProduct{" + "type=" + type + ", wheel=" + wheel + ", color='" + color + '\'' + '}';
    }
}
