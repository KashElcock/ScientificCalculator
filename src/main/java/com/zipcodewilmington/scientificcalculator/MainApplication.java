package com.zipcodewilmington.scientificcalculator;

import java.util.Objects;

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

            try {
                int calcFuncInput = Console.getIntegerInput("\n[F U N C T I O N S] \n1. Simple Calculator \n2. Scientific Calculator \n3. Tip Calculator \n4. Convert to JP Yen \n5. Celsius Calculator \n6. Exit App \nEnter the corresponding number: ");

                //Console.println("Calculation function entered: %s", calcFuncInput);

                switch (calcFuncInput) {
                    case 1: //simple
                        int operationInput = Console.getIntegerInput("\n[O P E R A T I O N S] \n1. Addition \n2. Subtraction \n3. Multiplication, \n4. Division \n5. Prev. Menu \n6. Exit App \nCurrent Display: " + currentDisplay + "\nEnter the corresponding number: ");
                        if (Objects.equals(operationInput, 1)) { //addition
                            num1 = Console.getDoubleInput("Enter the first number: ");
                            num2 = Console.getDoubleInput("Enter the second number: ");
                            currentDisplay = addition(num1, num2);
                            //currentDisplay = Math.addExact(num1, num2);
                            Console.println("%s + %s = %s", num1, num2, currentDisplay); //%.0f %.2f
                        } else if (Objects.equals(operationInput, 2)) { //subtraction
                            num1 = Console.getDoubleInput("Enter the first number: ");
                            num2 = Console.getDoubleInput("Enter the second number: ");
                            currentDisplay = subtraction(num1, num2);
                            //currentDisplay = Math.addExact(num1, num2);
                            Console.println("%s - %s = %s", num1, num2, currentDisplay);
                        } else if (Objects.equals(operationInput, 3)) { //multiplication
                            num1 = Console.getDoubleInput("Enter the first number: ");
                            num2 = Console.getDoubleInput("Enter the second number: ");
                            currentDisplay = multiplication(num1, num2);
                            //currentDisplay = Math.addExact(num1, num2);
                            Console.println("%s * %s = %s", num1, num2, currentDisplay);
                        } else if (Objects.equals(operationInput, 4)) { //division
                            num1 = Console.getDoubleInput("Enter the first number: ");
                            num2 = Console.getDoubleInput("Enter the second number: ");
                            currentDisplay = division(num1, num2);
                            //currentDisplay = Math.addExact(num1, num2);
                            Console.println("%s / %s = %s", num1, num2, currentDisplay);
                        } else if (Objects.equals(operationInput, 6)) { //Exit
                            Console.println("-- Closing application --");
                            //exit = true;
                            System.exit(0);
                        } //return to previous menus = the last else statement
                        break;
                    case 2: //scientific
                        Console.println("This is the scientific calculator.");
                        break;
                    case 3: //tipCalc
                        Console.println("This is the tip calculator.");
                        break;
                    case 4: //currencyConvert
                        Console.println("[TO JAPANESE YEN]");
                        num1 = Console.getDoubleInput("Enter dollar amount (USD): ");
                        num2 = mathOps.toJPYEN(num1);
                        Console.println("$%s in USD is $%s in JPY", num1, num2);
                        break;
                    case 5: //celsiusConvert
                        Console.println("[GOING CELSIUS]");
                        num1 = Console.getDoubleInput("Enter a number (fahrenheit): ");
                        num2 = mathOps.toCelsius(num1);
                        System.out.println(num2);
                        Console.println("%s in fahrenheit is %s in celsius!", num1, num2);
                        break;
                    case 6: //exitProgram
                        Console.println("-- Closing application --");
                        System.exit(0);
                        break;
                    default:
                        Console.println("!! Error! Number is not listed !!");
                } //end switch
            } catch (Exception e) {
                Console.println("Error! Entry is not a number.");
            }
        } //end while
    } //end main
        public static double addition ( double num1, double num2){ return num1 + num2; }
        public static double subtraction ( double num1, double num2){ return num1 - num2; }
        public static double multiplication ( double num1, double num2){ return num1 * num2; }
        public static double division ( double num1, double num2){ return num1 / num2; }

} //end class
