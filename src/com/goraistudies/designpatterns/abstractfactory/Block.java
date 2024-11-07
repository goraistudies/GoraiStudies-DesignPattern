package com.goraistudies.designpatterns.abstractfactory;

public class Block implements Shape{
    @Override
    public void draw() {
        System.out.println("This is Block");
    }
}
