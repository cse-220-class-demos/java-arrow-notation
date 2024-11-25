package io.github.nathanjrussell.lambdas;

import java.util.function.Consumer;

/**
 * Demonstrates the use of a lambda expression with a Consumer.
 */
public class ConsumerLambda {
    public static void main(String[] args) {
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Welcome to Lambda Expressions!");
    }
}
