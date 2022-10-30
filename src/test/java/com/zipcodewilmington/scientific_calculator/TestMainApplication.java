package com.zipcodewilmington.scientific_calculator;

import com.sun.xml.internal.ws.policy.AssertionSet;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import jdk.jfr.internal.tool.Main;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void additionTest()
    {
        MainApplication phobosCalc = new MainApplication();
        double codeOutput = phobosCalc.addition(1.0,2.0);
        double answer = 3;
        assertEquals(answer, codeOutput);
        //Assert.assertEquals(answer, codeOutput);
    }
}
