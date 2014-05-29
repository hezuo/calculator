package com.ingeniadev.test.calculator;

import com.ingeniadev.app.calculator.Calculator;
import com.ingeniadev.app.calculator.CalculatorInterface;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorInterfaceTest {

    @Test
    public void testSumarDosEnteros() throws Exception {
        CalculatorInterface cal = new Calculator();
        Long param1 = new Long(1);
        Long param2 = new Long(2);
        Long res = cal.sumarDosEnteros(param1, param2);
        assertEquals(res, (Long)(param1 + param2));
    }

    public void noesTest(){

    }

    @Test
    public void testSumarDosEnterosNegativos() throws Exception {
        CalculatorInterface cal = new Calculator();
        Long param1 = new Long(-1);
        Long param2 = new Long(-2);
        Long res = cal.sumarDosEnteros(param1, param2);
        assertEquals(res, new Long(0));

    }

    @Test
    public void testSumarDosEnterosNulo() throws Exception {
        CalculatorInterface cal = new Calculator();
        Long param1 = null;
        Long param2 = null;
        Long res = cal.sumarDosEnteros(param1, param2);
        assertEquals(res, new Long(0));
    }
}