package io.github.nathanjrussell.lambdas;

import java.util.function.Predicate;

/**
 * Demonstrates the use of a lambda expression with a Predicate.
 */
public class PredicateLambda {
    public static void main(String[] args) {
        Predicate<String> isNonEmpty = str -> str != null && !str.isEmpty();
        System.out.println("Is 'Java' non-empty? " + isNonEmpty.test("Java"));
        System.out.println("Is '' non-empty? " + isNonEmpty.test(""));
    }
}
