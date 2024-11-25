package io.github.nathanjrussell.lambdas;

/**
 * Demonstrates the use of a custom functional interface.
 */
public class CustomFunctionalInterfaceExample {

    /**
     * A custom functional interface to perform operations on two integers.
     */
    @FunctionalInterface
    interface MyFunctionalInterface {
        /**
         * Performs an operation on two integers.
         *
         * @param a The first integer.
         * @param b The second integer.
         * @return The result of the operation.
         */
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        MyFunctionalInterface addition = (a, b) -> a + b;
        System.out.println("Sum of 5 and 3: " + addition.operate(5, 3));
    }
}
