package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        boolean exit = false;
        double currentDisplay = 0;
        double num1, num2;

        while (exit == false) {
            String operationInput = Console.getStringInput("Enter addition, subtraction, multiplication, division, or exit: ");

            Console.println("Operation entered: %s", operationInput);
            //condition "operations menu"
            if (operationInput.equals("addition")) {
                num1 = Console.getDoubleInput("Enter the first number: ");
                num2 = Console.getDoubleInput("Enter the second number");
                currentDisplay = addition(num1, num2);
                Console.println("%s + %s = %s", num1, num2, currentDisplay);

            } else if (operationInput.equals("subtraction")) {

            } else if (operationInput.equals("multiplication")) {

            } else if (operationInput.equals("division")) {

            } else if (operationInput.equals("Exit")){
                //Exit program
            } else {
                Console.println("!!Input Error!!");
            }
        }


        /*
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
        */
    }

    public static double addition(double num1, double num2) { return num1 + num2; }
    public static double subtraction(double num1, double num2) { return num1 - num2; }
    public static double multiplication(int num1, int num2) { return num1 * num2; }
    public static double division(int num1, int num2) { return num1 / num2; }



}
