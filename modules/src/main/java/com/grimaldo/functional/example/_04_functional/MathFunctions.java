package com.grimaldo.functional.example._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;


        System.out.println("Square of 2: " + square.apply(2));
        System.out.println("7 isOdd?: " + isOdd.apply(7));

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("6 isEven?: " + isEven.test(6));

        Predicate<Student> isApproved = student -> student.getScore() > 51;

        System.out.println("Student is approved?: " + isApproved.test(new Student(60)));
    }

    static class Student {
        private double score;

        public Student(double score) {
            this.score = score;
        }

        public double getScore() {
            return score;
        }
    }
}
