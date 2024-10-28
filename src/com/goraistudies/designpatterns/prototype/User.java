package com.goraistudies.designpatterns.prototype;

public class User implements Cloneable{

    private String userInformation;

    public String getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(String userInformation) {
        this.userInformation = userInformation;
    }

    public void getUserData () throws InterruptedException {
       // Establish the network connection and fetch data using REST call.
       // Establish a database connection and fetch the data from database.
       // 5 sec

        this.userInformation = "User data from database";

        Thread.sleep(5000);

    }

    @Override
    public String toString() {
        return "User{" +
                "userInformation='" + userInformation + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
