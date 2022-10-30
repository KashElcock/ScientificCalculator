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

 //           try {
                int calcFuncInput = Console.getIntegerInput("\n- F U N C T I O N - M E N U - \n1. Simple Calculator \n2. Scientific Calculator \n3. Tip Calculator \n4. Convert to JP Yen \n5. Convert to Celsius \n6. Exit App \n\nEnter the corresponding number: ");

                switch (calcFuncInput) {
                    case 1: //simple
                        Console.println("\n- O P E R A T I O N - M E N U - \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Prev. Menu \n6. Exit App \nCurrent Display: %.2f", currentDisplay);
                        Console.println("7. Operate with current value");
                        int operationInput = Console.getIntegerInput("\nEnter the corresponding number: ");
                        if (Objects.equals(operationInput, 1)) { //addition
                            num1 = Console.getDoubleInput("\n- A D D I T I O N - \nEnter the first number: ");
                            num2 = Console.getDoubleInput("Enter the second number: ");
                            currentDisplay = mathOps.addition(num1, num2);
                            Console.println("%,.0f + %,.0f = %,.0f", num1, num2, currentDisplay);
                        } else if (Objects.equals(operationInput, 2)) { //subtraction
                            num1 = Console.getDoubleInput("\n- S U B T R A C T I O N - \nEnter the first number: ");
                            num2 = Console.getDoubleInput("Enter the second number: ");
                            currentDisplay = mathOps.subtraction(num1, num2);
                            Console.println("%,.0f - %,.0f = %,.0f", num1, num2, currentDisplay);
                        } else if (Objects.equals(operationInput, 3)) { //multiplication
                            num1 = Console.getDoubleInput("\n- M U L T I P L I C A T I O N - \nEnter the first number: ");
                            num2 = Console.getDoubleInput("Enter the second number: ");
                            currentDisplay = mathOps.multiplication(num1, num2);
                            Console.println("%,.0f * %,.0f = %,.0f", num1, num2, currentDisplay);
                        } else if (Objects.equals(operationInput, 4)) { //division
                            num1 = Console.getDoubleInput("\n- D I V I S I O N - \nEnter the first number: ");
                            num2 = Console.getDoubleInput("Enter the second number: ");
                            currentDisplay = mathOps.division(num1, num2);
                            Console.println("%,.0f / %,.0f = %,.2f", num1, num2, currentDisplay);
                            if (num2 == 0) {
                                Console.println("[ERROR] Cannot divide by 0.");
                            }
                        } else if (Objects.equals(operationInput, 6)) { //Exit
                            Console.println("-- Closing application --");
                            //exit = true;
                            System.exit(0);
                        } else if (Objects.equals(operationInput, 7)) {
                            currentDisplay = currentDisplayOps.opsDisplayValue(currentDisplay);
                        }   //return to previous menus = the last else statement
                        break;
                    case 2: //scientific
                        Console.println("This is the scientific calculator.");
                        break;
                    case 3: //tipCalc
                        Console.println("This is the tip calculator.");
                        break;
                    case 4: //currencyConvert
                        Console.println("-- TO JAPANESE YEN --");
                        num1 = Console.getDoubleInput("Enter dollar amount (USD): ");
                        num2 = mathOps.toJPYEN(num1);
                        Console.println("$%,.2f in USD is $%,.2f in JPY", num1, num2);
                        break;
                    case 5: //celsiusConvert
                        Console.println("-- TO CELSIUS --");
                        num1 = Console.getDoubleInput("Enter a number (fahrenheit): ");
                        num2 = mathOps.toCelsius(num1);
                        System.out.println(num2);
                        Console.println("%.0f in fahrenheit is %.0f in celsius!", num1, num2);
                        break;
                    case 6: //exitProgram
                        Console.println("-- Closing application --");
                        System.exit(0);
                        break;
                    default:
                        Console.println("[ERROR] Number is not listed.");
                } //end switch
/*            } catch (Exception e) {
                Console.println("[ERROR] Entry is not a number.");
            } */
        } //end while
    } //end main
} //end class
