package com.jinhogate;

import com.jinhogate.model.Product;

public class Main {
    public static void main(String[] args) {
        String greater = "Hello world!";
        System.out.println(greater);
        Product product = new Product("Screen");
        System.out.println(product.getName());
        changeAndViewNewProductName(product);
        System.out.println("Comparaison lexicographique de 2 chaines de caractères");
        String mot1 = "abcd";
        String mot2 = "abcde";
        System.out.println(mot1.compareTo(mot2));
    }

    private static void changeAndViewNewProductName(Product product) {
        product.modifyName("keyBoard");
        System.out.println("new name : " + product.getName());
    }
}