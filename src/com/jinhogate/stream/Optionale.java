package com.jinhogate.stream;

import java.util.Optional;

public class Optionale {
    public static void main(String[] args) {
        Optional<String> op = Optional.ofNullable("ana");
        System.out.println(op.isEmpty());
        op.filter(s->s.length()>0).ifPresent(System.out::println);
    }
}
