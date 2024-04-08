package com.jinhogate.objetstring;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        User paul1 = new User(3000d, "paul");
        User paul2 = new User(3000d, "paul");

        System.out.println("Comparaison par référence : ");
        boolean paul1IsPaul2Ref = paul2 == paul1;
        System.out.println(paul1IsPaul2Ref);

        System.out.println("Comparaison par équals : ");
        boolean paul1IsPaul2Val = paul1.equals(paul2);
        System.out.println(paul1IsPaul2Val);

        System.out.println("ref: " + paul1IsPaul2Ref + " !!! val:" + paul1IsPaul2Val);

        //Comparaison des strings
        String mot1 = "hello";
        String mot2 = "hello";
//        boolean mot1IsEqualsMot2 = mot1.equals(mot2);
        boolean mot1IsEqualsMot2 = Objects.equals(mot1, mot2);
//        boolean mot1IsEqualsMot2 = mot1 == mot2;
        System.out.println("Comparaison string = " + mot1IsEqualsMot2);

    }
}
