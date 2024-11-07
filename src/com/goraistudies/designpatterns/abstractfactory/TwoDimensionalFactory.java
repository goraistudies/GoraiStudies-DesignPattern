package com.goraistudies.designpatterns.abstractfactory;

public class TwoDimensionalFactory extends  AbstractFactory{
    @Override
    Shape getShape(String shapeType) {

        if(shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            return null;
        }

    }
}
