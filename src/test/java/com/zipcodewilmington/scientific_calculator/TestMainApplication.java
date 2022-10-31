package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.mathOps;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void additionTest() {
        double codeOutput = mathOps.addition(1.0, 2.0);
        double answer = 3;
        assertEquals(answer, codeOutput);
    }
    @Test
    public void subtractionTest() {
        double codeOutput = mathOps.subtraction(3.0,2.0);
        double answer = 1;
        assertEquals(answer, codeOutput);
    }
    @Test
    public void multiplicationTest() {
        double codeOutput = mathOps.multiplication(2.0, 3.0);
        double answer = 6;
        assertEquals(answer, codeOutput);
    }
    @Test
    public void divisionTest() { //doesn't work with divide by 0 or with 0.33333etc
        double codeOutput = mathOps.division(6.0, 3.0);
        double answer = 2.0;
        assertEquals(answer, codeOutput);
    }
    @Test
    public void tipCalculatorTest() {
        double codeOutput = mathOps.tipCalculator(20,2,200);
        double result = 120;
        assertEquals(result,codeOutput);
    }
    @Test
    public void getSquareTest() {
        double codeOutput = mathOps.getSquare(8);
        double result = 64;
        assertEquals(result,codeOutput);
    }
    @Test
    public void getSquareRootTest() {
        double codeOutput = mathOps.getSquareRoot(144);
        double result = 12;
        assertEquals(result,codeOutput);
    }
    @Test
    public void toPESOTest() {
        double codeOutput = mathOps.toPESO(1);
        double result = 19.82;
        assertEquals(result,codeOutput);
    }
    @Test
    public void toJPYENTest() {
        double codeOutput = mathOps.toJPYEN(1);
        double result = 147.48;
        assertEquals(result,codeOutput);
    }
}
