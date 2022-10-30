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
                int calcFuncInput = Console.getIntegerInput("\n- F U N C T I O N - M E N U - " +
                        "                                           \n1. Simple Calculator " +
                        "                                           \n2. Scientific Calculator " +
                        "                                           \n3. Tip Calculator " +
                        "                                           \n4. Convert to JP Yen " +
                        "                                           \n5. Convert to Pesos " +
                        "                                           \n6. Exit App " +
                        "                                           \n\nEnter the corresponding number: ");

                switch (calcFuncInput) {
                    case 1: //simple
                        Console.println("\n- O P E R A T I O N - M E N U - " +
                                "                   \n1. Addition " +
                                "                   \n2. Subtraction " +
                                "                   \n3. Multiplication " +
                                "                   \n4. Division " +
                                "                   \n5. Squared " +
                                "                   \n6. Square Root " +
                                "                   \n7. Prev. Menu " +
                                "                   \n8. Exit App " +
                                "                   \nCurrent Display: %.2f", currentDisplay);
                        Console.println("9. Operate with current value");
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
                        } else if (Objects.equals(operationInput, 5)) { //squared
                            num1 = Console.getDoubleInput("\n- S Q U A R E D - \nEnter a number: ");
                            currentDisplay = mathOps.getSquare(num1);
                            Console.println("%,.0f^2 = %,.0f", num1, currentDisplay);
                        } else if (Objects.equals(operationInput, 6)) { //squared
                            num1 = Console.getDoubleInput("\n- S Q - R O O T - \nEnter a number: ");
                            currentDisplay = mathOps.getSquareRoot(num1);
                            Console.println("Square Root of %,.0f = %,.0f", num1, currentDisplay);
                        } else if (Objects.equals(operationInput, 8)) { //Exit
                            Console.println("-- Closing application --");
                            //exit = true;
                            System.exit(0);
                        } else if (Objects.equals(operationInput, 9)) { //Do operations to current display
                            currentDisplay = currentDisplayOps.opsDisplayValue(currentDisplay);
                        }   //return to previous menus = the last else statement
                        break;
                    case 2: //scientific
                        Console.println("\n- S C I E N T I F I C - M E N U - " +
                                "               \n1. Sine " +
                                "               \n2. Cosine " +
                                "               \n3. Tangent " +
                                "               \n4. Inverse Sine " +
                                "               \n5. Inverse Cosine " +
                                "               \n6. Inverse Factorial  " +
                                "               \n7. Prev. Menu " +
                                "               \n8. Exit App");
                        int scientificInput = Console.getIntegerInput("\nEnter the corresponding number: ");
                        if (Objects.equals(scientificInput, 1)) {
                            num1 = Console.getDoubleInput("\n- S I N E - \nEnter the a number: ");
                            Console.println("Sine is: %s", mathOps.getSine(num1));
                        } else if (Objects.equals(scientificInput, 2)) {
                            num1 = Console.getDoubleInput("\n- C O S I N E - \nEnter the a number: ");
                            Console.println("Cosine is: ", mathOps.getCosine(num1));
                        } else if (Objects.equals(scientificInput, 3)) {
                            num1 = Console.getDoubleInput("\n- T A N G E N T - \nEnter the a number: ");
                            Console.println("Tangent is: ", mathOps.getTangent(num1));
                        } else if (Objects.equals(scientificInput, 4)) {
                            num1 = Console.getDoubleInput("\n- I N V E R S E - S I N E - \nEnter the a number: ");
                            Console.println("Inverse Sine is: ", mathOps.getInverseSine(num1));
                        } else if (Objects.equals(scientificInput, 5)) {
                            num1 = Console.getDoubleInput("\n- I N V E R S E - C O S I N E - \nEnter the a number: ");
                            Console.println("Inverse Cosine: ", mathOps.getInverseCosine(num1));
                        } else if (Objects.equals(scientificInput, 6)) {
                            num1 = Console.getDoubleInput("\n- I N V E R S E - F A C T O R I A L - \nEnter the a number: ");
                            Console.println("Inverse Factorial: ", mathOps.getInverseFactorial(num1));
                        } else if (Objects.equals(scientificInput, 8)) { //Exit
                            Console.println("-- Closing application --");
                            //exit = true;
                            System.exit(0);
                        }   //return to previous menus = the last else statement
                        break;
                    case 3: //tipCalc
                        double tipPercentage = Console.getIntegerInput("Welcome to the tip calculator, please enter your tip percentage!");
                        double guests = Console.getIntegerInput("Please enter your number of guests!");
                        double billTotal = Console.getIntegerInput("Please enter your bill total!");
                        double answer = mathOps.tipCalculator( tipPercentage, guests, billTotal);
                        Console.println("Your amount owed per person is $%,.2f", answer);
                        break;
                    case 4: //currencyConvert
                        Console.println("-- TO JAPANESE YEN --");
                        num1 = Console.getDoubleInput("Enter dollar amount (USD): ");
                        num2 = mathOps.toJPYEN(num1);
                        Console.println("$%,.2f in USD is $%,.2f in JPY", num1, num2);
                        break;
                    case 5: //currencyConvert
                        Console.println("-- TO MEXICAN PESO --");
                        num1 = Console.getDoubleInput("Enter dollar amount (USD): ");
                        num2 = mathOps.toPESO(num1);
                        Console.println("$%,.2f in USD is $%,.2f in PESOS", num1, num2);
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
