package com.goraistudies.designpatterns;

public class Main {

    public static void main(String[] args) {

        LazyInitialization obj1 = LazyInitialization.getInstance();
        System.out.println(obj1.hashCode());

        LazyInitialization obj2 = LazyInitialization.getInstance();
        System.out.println(obj2.hashCode());

    }
}
