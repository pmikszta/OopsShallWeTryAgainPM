package org.example;

public class App {
    public static void main(String[] args) {
        //Test1
        Prompt Prompt1 = new Prompt("Enter temperature (-50.0 – 50.0): ", -50.0, 50.0);

        // Use all getters
        System.out.println("Prompt message: " + Prompt1.getPromptMessage());
        System.out.println("Lower bound: " + Prompt1.getLowerBound());
        System.out.println("Upper bound: " + Prompt1.getUpperBound());

        // Prompt and Test 
        double Var1 = Prompt1.getValidatedDouble();
        System.out.println("\nYou entered temperature = " + Var1);

        //Test2
        Prompt Prompt2 = new Prompt("Enter temperature (5.5 – -5.5): ", -5.5, 5.5);

        // Use all getters
        System.out.println("Prompt message: " + Prompt2.getPromptMessage());
        System.out.println("Lower bound: " + Prompt2.getLowerBound());
        System.out.println("Upper bound: " + Prompt2.getUpperBound());

        // Prompt and Test 
        double Var2 = Prompt2.getValidatedDouble();
        System.out.println("\nYou entered temperature = " + Var2);

        //Test3
        Prompt Prompt3 = new Prompt("Enter value between -200 – 5000): ", -200, 5000);

        // Use all getters
        System.out.println("Prompt message: " + Prompt3.getPromptMessage());
        System.out.println("Lower bound: " + Prompt3.getLowerBound());
        System.out.println("Upper bound: " + Prompt3.getUpperBound());

        // Prompt and Test 
        double Var3 = Prompt3.getValidatedDouble();
        System.out.println("\nYou entered temperature = " + Var3);

        
                
        
    }
}
