package com.goraistudies.designpatterns.adapter;

public class Client {

    public static void main(String[] args) {

        System.out.println("Program started!!");

        //IPhoneCharger charger = new IPhoneChargerImpl();

        AndroidCharger androidCharger = new AndroidChargerImpl();

        IPhoneCharger charger = new AdaptorCharger(androidCharger);
        IPhone iPhone = new IPhone(charger);
        iPhone.charge();

    }
}
