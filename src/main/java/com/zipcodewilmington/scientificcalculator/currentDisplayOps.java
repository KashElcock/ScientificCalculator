package com.zipcodewilmington.scientificcalculator;

import java.util.Objects;

public class currentDisplayOps {

    public static double opsDisplayValue (double currentDisplay){
        double num1 = currentDisplay;
        double num2;

        Console.println("\n-- Operating on Current Value -- " +
                "               \n1. Addition " +
                "               \n2. Subtraction " +
                "               \n3. Multiplication " +
                "               \n4. Division " +
                "               \n5. Squared " +
                "               \n6. Square Root " +
                "               \n7. Inverse " +
                "               \n8. Switch Sign" +
                "               \n9. Function(Main) Menu " +
                "               \n10. Exit App " +
                "               \nCurrent Display: %.2f" +
                "               \n11. Clear Display", currentDisplay);
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
            if (num2 == 0) {
                Console.println("[ERROR] Cannot divide by 0.");
            } else {
                currentDisplay = mathOps.division(num1, num2);
                Console.println("%,.0f / %,.0f = %,.2f", num1, num2, currentDisplay);
            }
        } else if (Objects.equals(operationInput, 5)) { //squared
            Console.println("\n- S Q U A R E D -");
            double holder = currentDisplay;
            currentDisplay = mathOps.getSquare(currentDisplay);
            Console.println("%,.0f^2 = %,.0f", holder, currentDisplay);
        } else if (Objects.equals(operationInput, 6)) { //square root
            Console.println("\n- S Q - R O O T -");
            double holder = currentDisplay;
            currentDisplay = mathOps.getSquareRoot(currentDisplay);
            Console.println("Square Root of %,.0f = %,.0f", holder, currentDisplay);
        } else if (Objects.equals(operationInput, 7)) { //7. Invserse
            Console.println("\n- I N V E R S E -");
            double holder = currentDisplay;
            currentDisplay = mathOps.getInverse(currentDisplay);
            Console.println("Inverse of %,.0f = %s", holder, currentDisplay);
        } else if (Objects.equals(operationInput, 8)) { //8. Switch Sign
            Console.println("\n- S W I T C H - S I G N -");
            double holder = currentDisplay;
            currentDisplay = mathOps.getSwitchSign(currentDisplay);
            Console.println("Switching the sign of %,.0f = %,.0f", holder, currentDisplay);
        } else if (Objects.equals(operationInput, 10)) { //Exit
            Console.println("-- Closing application --");
            //exit = true;
            System.exit(0);
        } else if (Objects.equals(operationInput, 11)) { //Clear Display
            currentDisplay = 0.00;
            currentDisplayOps.opsDisplayValue(currentDisplay);
            Console.println("[NOTICE] Current display value has been reset.");
        } else {
            //"Number is not listed" condition
        }

        return currentDisplay;
    }
}
