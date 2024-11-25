package io.github.nathanjrussell.lambdas;

import java.util.function.Function;

/**
 * Demonstrates a lambda expression with multiple statements.
 */
public class LambdaWithMultipleStatements {
    public static void main(String[] args) {
        Function<Integer, String> checkEvenOdd = number -> {
            if (number % 2 == 0) {
                return number + " is even";
            } else {
                return number + " is odd";
            }
        };
        System.out.println(checkEvenOdd.apply(10));
        System.out.println(checkEvenOdd.apply(7));
    }
}
