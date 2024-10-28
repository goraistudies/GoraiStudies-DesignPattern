package com.goraistudies.designpatterns.builder;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer.ComputerBuilder()
                .setHDD("1TB")
                .setSSD("500GB")
                .setMotherBoard("Gigabyte B650E")
                .setRAM("32GB")
                .setGraphicsCard("Intel Arc A580")
                .build();

        System.out.println(computer);
    }
}
