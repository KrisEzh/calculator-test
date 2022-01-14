package pro.sky.java.course2.calculatortest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

        private final CalculatorService out = new CalculatorService();
    int value1 = 5;
    int value2 = 5;

        @Test
        public void plus(){
            CalculatorService calculatorService=new CalculatorService();
            int num3Expected = calculatorService.plus(value1, value2);
            int num3Actual = value1 + value2;
            assertEquals(num3Expected, num3Actual);
        }
        @Test
        public void minus(){
            CalculatorService calculatorService=new CalculatorService();
            int num3Expected = calculatorService.minus(value1, value2);
            int num3Actual = value1 - value2;
            assertEquals(num3Expected, num3Actual);
        }
        @Test
        public void multiply(){
            CalculatorService calculatorService=new CalculatorService();
            int num3Expected = calculatorService.multiply(value1, value2);
            int num3Actual = value1 * value2;
            assertEquals(num3Expected, num3Actual);
        }
        @Test
        public void divide() {
            CalculatorService calculatorService = new CalculatorService();
            int num3Expected = calculatorService.divide(value1, value2);
            int num3Actual = value1 / value2;
            assertEquals(num3Expected, num3Actual);
        }
        @Test
        public void divideException() throws IllegalArgumentException{
            assertThrows(IllegalArgumentException.class, () -> out.divide(5,0));
        }

    }


