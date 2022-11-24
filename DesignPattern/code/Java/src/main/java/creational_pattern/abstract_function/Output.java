package creational_pattern.abstract_function;

import creational_pattern.abstract_function.bean.ColorBean;
import creational_pattern.abstract_function.bean.ShapeBean;
import creational_pattern.abstract_function.factory.standard.StandardAFactory;
import creational_pattern.abstract_function.factory.standard.StandardBFactory;
import creational_pattern.abstract_function.factory.standard.impl.StandardAFactoryImpl;
import creational_pattern.abstract_function.factory.standard.impl.StandardBFactoryImpl;
import lombok.Data;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2022/11/18
 */
@Data
public class Output {

    private ColorBean colorBean;
    
    private ShapeBean shapeBean;
    
    // factory - demo, you can use Factory Pattern to enhance implementation
    private StandardAFactory standardAFactory = new StandardAFactoryImpl();
    
    // factory 
    private StandardBFactory standardBFactory = new StandardBFactoryImpl();
    
    // 2 x 2 arrangement
    public Output getWindow() {
        Output window = new Output();
        window.setColorBean(standardBFactory.createColor());
        window.setShapeBean(standardAFactory.createShape());
        return window;
    }
    
    public Output getScroll() {
        Output scroll = new Output();
        scroll.setColorBean(standardAFactory.createColor());
        scroll.setShapeBean(standardBFactory.createShape());
        return scroll;
    }

    public Output getButton() {
        Output button = new Output();
        button.setColorBean(standardBFactory.createColor());
        button.setShapeBean(standardBFactory.createShape());
        return button;
    }

}
