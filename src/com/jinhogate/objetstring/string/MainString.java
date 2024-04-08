package com.jinhogate.objetstring.string;

import com.jinhogate.objetstring.User;

public class MainString {

    public static void main(String[] args) {
        String mot1 = "hoello";
        String mot2 = new String("world");
        System.out.println(mot1 + mot2);
        User kossi = new User(1000d, "kossi");
        System.out.println("user = " + kossi);
        int positionL = mot1.indexOf("l", 3);
        System.out.println("index of postion " + positionL);
        int postionO = mot1.lastIndexOf("o",7);
        System.out.println("lastindex  of postion " + postionO);
    }
}
