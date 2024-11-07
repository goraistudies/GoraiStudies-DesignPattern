package com.goraistudies.designpatterns.abstractfactory;

public class Client {

    public static void main(String[] args) {

             Shape shape = FactoryProvider.getFactory(true).getShape("block");
             shape.draw();
    }
}
