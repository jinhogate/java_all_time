package com.jinhogate;

import com.jinhogate.model.Product;

public class Main {
    public static void main(String[] args) {
        String greater = "Hello world!";
        System.out.println(greater);
        Product product = new Product("Screen");
        System.out.println(product.getName());
        changeAndViewNewProductName(product);
    }

    private static void changeAndViewNewProductName(Product product) {
        product.modifyName("keyBoard");
        System.out.println("new name : " + product.getName());
    }
}