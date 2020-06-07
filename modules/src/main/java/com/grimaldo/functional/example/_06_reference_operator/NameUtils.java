package com.grimaldo.functional.example._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NameUtils {

    public static void main(String[] args) {
        List<String> teachers = getList("Nicolas", "Juan", "Pedro");

        Consumer<String> printer = System.out::println;

        teachers.forEach(printer);
    }

    static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }
}
