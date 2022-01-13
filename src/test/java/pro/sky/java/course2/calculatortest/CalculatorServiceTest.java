package pro.sky.java.course2.calculatortest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

        private final CalculatorService out = new CalculatorService();

        @Test
        public void plus(){
            int value1=5;
            int value2=5;
            CalculatorService calculatorService=new CalculatorService();
            int num3Expected = Integer.parseInt(calculatorService.plus(value1, value2));
            int num3Actual = value1 + value2;
            assertEquals(num3Expected, num3Actual);
        }
        @Test
        public void minus(){
            int value1=5;
            int value2=5;
            CalculatorService calculatorService=new CalculatorService();
            int num3Expected = Integer.parseInt(calculatorService.minus(value1, value2));
            int num3Actual = value1 - value2;
            assertEquals(num3Expected, num3Actual);
        }
        @Test
        public void multiply(){
            int value1=5;
            int value2=5;
            CalculatorService calculatorService=new CalculatorService();
            int num3Expected = Integer.parseInt(calculatorService.multiply(value1, value2));
            int num3Actual = value1 * value2;
            assertEquals(num3Expected, num3Actual);
        }
        @Test
        public void divide() {
            int value1 = 5;
            int value2 = 5;
            CalculatorService calculatorService = new CalculatorService();
            int num3Expected = Integer.parseInt(calculatorService.divide(value1, value2));
            int num3Actual = value1 / value2;
            assertEquals(num3Expected, num3Actual);
        }
        @Test
        public void divideException() throws IllegalArgumentException{
            assertThrows(IllegalArgumentException.class, () -> out.divide(5,0));
        }

    }


