package com.goraistudies.designpatterns.abstractfactory;

public class ThreeDimensionalFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("box")) {

            return new Box();
        } else if (shapeType.equalsIgnoreCase("block")) {

            return new Block();
        } else {
            return null;
        }

    }
}
