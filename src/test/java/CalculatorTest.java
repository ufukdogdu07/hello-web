package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import com.accenture.CalcNumber;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
      CalcNumber calculator = new CalcNumber();
      calculator.setNumber1(5);
      calculator.setNumber2(3);
      int sum = calculator.getTotal();
      assertEquals(9, sum);
    }
  }
