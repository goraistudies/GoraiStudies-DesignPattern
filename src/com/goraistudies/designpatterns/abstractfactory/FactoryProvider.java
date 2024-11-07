package com.goraistudies.designpatterns.abstractfactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(boolean factoryType3D) {

        if (factoryType3D == true) {

            return new ThreeDimensionalFactory();
        } else {

            return new TwoDimensionalFactory();
        }
    }
}
