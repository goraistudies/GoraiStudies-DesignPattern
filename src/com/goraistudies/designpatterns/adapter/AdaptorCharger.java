package com.goraistudies.designpatterns.adapter;

public class AdaptorCharger implements IPhoneCharger {

    private AndroidCharger androidCharger;
    @Override
    public void chargeIPhone() {
        androidCharger.chargeAndroidPhone();
    }

    public AdaptorCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }
}
