package io.github.nathanjrussell.switchstatements;

import java.util.List;
import java.util.Random;
import java.util.function.Function;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class SwitchStatements {

    public static void main(String[] args) {
        int samples = 1_000_000_000;
        Random random = new Random();
       //create array of functions to test

        // Create a list of Function objects using method references
        List<Function<Integer, String>> functions = List.of(
                SwitchStatements::setVariableReturn,
                SwitchStatements::returnFromSwitch,
                SwitchStatements::returnSwitchStatement
        );

        // Iterate over the list of functions
        for (var function : functions) {
            long startTime = System.nanoTime();
            for (int i=0; i < samples; i++) {
                String result = function.apply(random.nextInt(7)+1);}
            long endTime = System.nanoTime();
            System.out.println("Time: " + (endTime - startTime)/1_000_000_000.0 + " seconds");
//            System.out.println("Result: " + result + ", Time: " + (endTime - startTime) + " ns");
        }
    }

    public static String setVariableReturn(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        return dayName;
    }

    public static String returnFromSwitch(int day) {
        switch (day) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid day";
        }
    }

    public static String returnSwitchStatement(int day) {
        return switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };
    }

}
