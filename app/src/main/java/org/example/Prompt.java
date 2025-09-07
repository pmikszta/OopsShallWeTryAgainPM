package org.example;

import java.util.Scanner;


//Define class and varables
public class Prompt {
    private Scanner scanner;
    private String promptMessage;
    private double lowerBound;
    private double upperBound;

    // Constructor sets up the prompt and bounds then maps variables
    public Prompt(String promptMessage, double lowerBound, double upperBound) {
        this.scanner = new Scanner(System.in);
        this.promptMessage = promptMessage;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    // Simple Getters
    public String getPromptMessage() {
        return promptMessage;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public double getUpperBound() {
        return upperBound;
    }

    // Get a validated double using the stored fields
    public double getValidatedDouble() {
        double value;
        while (true) {
            System.out.print(promptMessage);

            if (!scanner.hasNextDouble()) {
                System.out.println("\nInvalid input. Please Enter a valid number within the bounds");
                scanner.next(); // discard invalid input
                continue;
            }

            value = scanner.nextDouble();

            if (value >= lowerBound && value <= upperBound) {
                return value;
            } else {
                System.out.println("\nError: value must be between " + lowerBound + " and " + upperBound);
            }
        }
    }
}
