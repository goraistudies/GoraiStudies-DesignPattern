package com.goraistudies.designpatterns.factory;

public class ClientCode {

    public static void main(String[] args) {

        Computer linuxComputer = ComputerFactory.getComputerObject("windows");
        linuxComputer.operatingSystem();

    }
}
