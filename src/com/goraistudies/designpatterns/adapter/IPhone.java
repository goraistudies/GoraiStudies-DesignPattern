package com.goraistudies.designpatterns.adapter;

public class IPhone {

    IPhoneCharger iPhoneCharger;
    public void charge () {
        iPhoneCharger.chargeIPhone();
    }
    public IPhone(IPhoneCharger iPhoneCharger) {
        this.iPhoneCharger = iPhoneCharger;
    }
}
