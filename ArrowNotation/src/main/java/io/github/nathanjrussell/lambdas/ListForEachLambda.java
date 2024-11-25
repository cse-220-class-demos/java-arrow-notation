package io.github.nathanjrussell.lambdas;

/**
 * Demonstrates the use of a lambda expression with List's forEach method.
 */
import java.util.Arrays;
import java.util.List;

public class ListForEachLambda {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript");
        System.out.println("Languages:");
        languages.forEach(language -> System.out.println("- " + language));
    }
}
