package com.goraistudies.designpatterns.abstractfactory;

public class Box implements Shape{

    @Override
    public void draw() {
        System.out.println("This is box");
    }
}
