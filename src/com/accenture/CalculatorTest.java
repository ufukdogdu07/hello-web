package com.accenture;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
      CalcNumber calculator = new CalcNumber();
      calculator.setNumber1(5);
      calculator.setNumber2(3);
      int sum = calculator.getTotal();
      assertEquals(8, sum);
    }
  }
