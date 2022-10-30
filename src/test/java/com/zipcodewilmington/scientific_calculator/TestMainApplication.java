package com.zipcodewilmington.scientific_calculator;

import com.sun.xml.internal.ws.policy.AssertionSet;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import com.zipcodewilmington.scientificcalculator.mathOps;
import jdk.jfr.internal.tool.Main;
import org.junit.Assert;
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
}
