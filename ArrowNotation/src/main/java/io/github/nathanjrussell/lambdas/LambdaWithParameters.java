package io.github.nathanjrussell.lambdas;

import java.util.function.Function;

/**
 * Demonstrates a lambda expression with parameters and type inference.
 */
public class LambdaWithParameters {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = number -> number * number;
        System.out.println("Square of 5: " + squareFunction.apply(5));
    }
}
