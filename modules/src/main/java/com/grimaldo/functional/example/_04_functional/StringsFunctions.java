package com.grimaldo.functional.example._04_functional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringsFunctions {

    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";

        System.out.println(quote.apply("Solo sé que no se nada"));
        System.out.println(addMark.apply("Hello"));

        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        System.out.println("multiply 5*4: " + multiply.apply(5, 4));

        BiFunction<String, Integer, String> lefPad = (text, number) -> String.format("%" + number + "s", text);
        System.out.println("Adding Spaces: " + lefPad.apply("Adding spaces", 25));
    }
}
