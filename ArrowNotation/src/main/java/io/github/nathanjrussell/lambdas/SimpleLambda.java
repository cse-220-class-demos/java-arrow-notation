package io.github.nathanjrussell.lambdas;
/**
 * Demonstrates a simple lambda expression with no parameters.
 */
public class SimpleLambda {
    public static void main(String[] args) {
        Runnable simpleLambda = () -> System.out.println("Hello from a simple lambda!");
        simpleLambda.run();
    }
}
