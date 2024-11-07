package com.goraistudies.designpatterns.abstractfactory;

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("This is Square");
    }
}
