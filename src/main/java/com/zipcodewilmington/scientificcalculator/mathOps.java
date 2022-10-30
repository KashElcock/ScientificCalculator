package com.zipcodewilmington.scientificcalculator;

public class mathOps {
    public static double addition ( double num1, double num2){ return num1 + num2; }
    public static double subtraction ( double num1, double num2){ return num1 - num2; }
    public static double multiplication ( double num1, double num2){ return num1 * num2; }
    public static double division ( double num1, double num2){ return num1 / num2; }
    public static double getSquare(double num1) { return num1; }
    public static double getSquareRoot(double num1) { return num1; }
    public static double getInverse(double num1) { return num1; }
    public static double getSwitchSign(double num1) { return num1; }
    public static double getSin(double num1) { return num1; }
    public static double getCosine(double num1) { return num1; }
    public static double getTangent(double num1) { return num1; }
    public static double getInverseSine(double num1) { return num1; }
    public static double getInverseCosin(double num1) { return num1; }
    public static double getInverseFactorial(double num1) { return num1; }
    public static double toJPYEN(double usd) { return usd * 147.48; }

    public static double toCelsius(double far) {
        double convert = (far - 32) * (5/9);
        return convert; }
}
