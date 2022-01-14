package pro.sky.java.course2.calculatortest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {

        private final CalculatorService out = new CalculatorService();

        public static Stream<Arguments> provideParamsForPlus() {
            return Stream.of(
                    Arguments.of(10, 5, 15),
                    Arguments.of(-1, 2, 1),
                    Arguments.of(0, 1 , 1)
            );
        }
        @ParameterizedTest
        @MethodSource("provideParamsForPlus")
        public void shouldGenerateCorrectPlus(int value1, int value2, int expectedInt) {
            int result = out.plus(value1, value2);
            assertEquals(expectedInt, result);
        }
        public static Stream<Arguments> provideParamsForMinus() {
            return Stream.of(
                    Arguments.of(10, 5, 5),
                    Arguments.of(-5, 0, -5),
                    Arguments.of(3, 4, -1)
            );
        }
        @ParameterizedTest
        @MethodSource("provideParamsForMinus")
        public void shouldGenerateCorrectMinus(int value1, int value2, int expectedInt) {
            int result = out.minus(value1, value2);
            assertEquals(expectedInt, result);
        }

        public static Stream<Arguments> provideParamsForMultiply() {
            return Stream.of(
                    Arguments.of(10, 5 , 50),
                    Arguments.of(0, 2, 0),
                    Arguments.of(-1, 5, -5)
            );
        }
        @ParameterizedTest
        @MethodSource("provideParamsForMultiply")
        public void shouldGenerateCorrectMultiply(int value1, int value2, int expectedInt) {
            int result = out.multiply(value1, value2);
            assertEquals(expectedInt, result);
        }
        public static Stream<Arguments> provideParamsForDivide() {
            return Stream.of(
                    Arguments.of(10, 5 , 2),
                    Arguments.of(0, 2, 0),
                    Arguments.of(5, -1, -5)
            );
        }
        @ParameterizedTest
        @MethodSource("provideParamsForDivide")
        public void shouldGenerateCorrectDivide(int value1, int value2, int expectedInt) {
            int result = out.divide(value1, value2);
            assertEquals(expectedInt, result);
        }

    }

