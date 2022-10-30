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
    public static double getSine(double num1) {
        String converter = (String) String.format("%.2f", (Math.sin(num1)));
        double convertedSine = Double.parseDouble(converter);
        return convertedSine; }
    public static double getCosine(double num1) {
        String converter = (String) String.format("%.2f", (Math.cos(num1)));
        double convertedCosine = Double.parseDouble(converter);
        return convertedCosine; }
    public static double getTangent(double num1) {
        String converter = (String) String.format("%.2f", (Math.tan(num1)));
        double convertedTangent = Double.parseDouble(converter);
        return convertedTangent; }
    public static double getInverseSine(double num1) {
        return num1; }
    public static double getInverseCosine(double num1) {
        return num1; }
    public static double getInverseFactorial(double num1) {
        return num1; }
    public static double toJPYEN(double usd) { return usd * 147.48; }
    public static double tipCalculator(double tipPercentage, double guests, double billTotal) {
        double tipTotal = (billTotal * (tipPercentage / 100));
        double tipTotalPerPerson = tipTotal/guests;
        double billTotalPerPerson = billTotal/guests;
        double totalOwedPerPerson = tipTotalPerPerson + billTotalPerPerson;
        return totalOwedPerPerson;
    }
    public static double toCelsius(double far) {
        double convert = (far - 32) * (5/9);
        return convert; }
}
