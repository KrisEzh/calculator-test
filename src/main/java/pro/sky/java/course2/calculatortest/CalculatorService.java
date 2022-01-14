package pro.sky.java.course2.calculatortest;

import org.springframework.stereotype.Service;

    @Service
    public class CalculatorService {

        public Integer plus(int value1, int value2) {
            int num3 = value1 + value2;
            return num3;
        }

        public  Integer minus(int value1, int value2) {
            int num3 = value1 - value2;
            return num3;
        }

        public  Integer multiply(int value1, int value2) {
            int num3 = value1 * value2;
            return num3;
        }

        public  Integer divide(int value1, int value2) throws IllegalArgumentException {
            if (value2 == 0) {
                throw new IllegalArgumentException();
            } else {
                int num3 = value1 / value2;
                return num3;
            }
        }

    }






