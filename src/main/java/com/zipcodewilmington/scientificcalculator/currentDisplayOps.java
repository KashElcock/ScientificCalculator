package com.zipcodewilmington.scientificcalculator;

import java.util.Objects;

public class currentDisplayOps {

    public static double opsDisplayValue (double currentDisplay){
        double num1 = currentDisplay;
        double num2;

        Console.println("\n-- Operating on Current Value -- \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Function(Main) Menu \n6. Exit App \nCurrent Display: %.2f", currentDisplay);
        int operationInput = Console.getIntegerInput("\nEnter the corresponding number: ");
        if (Objects.equals(operationInput, 1)) { //addition
            num2 = Console.getDoubleInput("\n- A D D I T I O N - \nEnter the second number: ");
            currentDisplay = mathOps.addition(num1, num2);
            Console.println("%,.0f + %,.0f = %,.0f", num1, num2, currentDisplay);
        } else if (Objects.equals(operationInput, 2)) { //subtraction
            num2 = Console.getDoubleInput("\n- S U B T R A C T I O N - \nEnter the second number: ");
            currentDisplay = mathOps.subtraction(num1, num2);
            Console.println("%,.0f - %,.0f = %,.0f", num1, num2, currentDisplay);
        } else if (Objects.equals(operationInput, 3)) { //multiplication
            num2 = Console.getDoubleInput("\n- M U L T I P L I C A T I O N - \nEnter the second number: ");
            currentDisplay = mathOps.multiplication(num1, num2);
            Console.println("%,.0f * %,.0f = %,.0f", num1, num2, currentDisplay);
        } else if (Objects.equals(operationInput, 4)) { //division
            num2 = Console.getDoubleInput("\n- D I V I S I O N - \nEnter the second number: ");
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
            currentDisplayOps.opsDisplayValue(currentDisplay);
        }   //return to previous menus = the last else statement

        return currentDisplay;
    }
}
