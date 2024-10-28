package com.goraistudies.designpatterns.prototype;

public class UserMain {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

        System.out.println("Prototype design pattern......");

        User user = new User();
        user.getUserData();
        System.out.println(user);

        User user1 = (User)user.clone();
        System.out.println(user1);


    }
}
