package io.github.nathanjrussell.lambdas;

import java.util.function.Function;

/**
 * Demonstrates chaining of lambda expressions using Function.
 */
public class ChainingLambdas {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> addExclamation = str -> str + "!";
        Function<String, String> excitedUpperCase = toUpperCase.andThen(addExclamation);

        System.out.println(excitedUpperCase.apply("hello"));
    }
}
