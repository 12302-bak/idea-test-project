package _base.design_pattern.abstract_factory.shape;

import _base.design_pattern.abstract_factory.AbstractFactory;
import _base.design_pattern.abstract_factory.color.Color;
import _base.design_pattern.abstract_factory.shape.impl.Circle;
import _base.design_pattern.abstract_factory.shape.impl.Rectangle;
import _base.design_pattern.abstract_factory.shape.impl.Square;

/**
 *
 * Copyright https://wtfu.site Inc. All Rights Reserved.
 * 
 * @date 2024/1/25
 *                          @since  1.0
 *                          @author 12302
 * 
 */
public class ShapeFactory extends AbstractFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){ return null; }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
