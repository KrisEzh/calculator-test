package pro.sky.java.course2.calculatortest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/calculator")
    public class Controller {
        private final CalculatorService calculatorService;

        public Controller(CalculatorService calculatorService) {
            this.calculatorService = calculatorService;
        }

        @GetMapping
        public String helloCalculator() {
            return "<b>Welcome to calculator</b>";
        }

        @GetMapping(path = "/plus")
        public String plusAnswer(@RequestParam("num1") int value1, @RequestParam("num2") int value2) {
            return value1 + " + " + value2 + " = " + calculatorService.plus(value1, value2);
        }

        @GetMapping(path = "/minus")
        public String minusAnswer(@RequestParam("num1") int value1, @RequestParam("num2") int value2) {
            return value1 + " - " + value2 + " = " + calculatorService.minus(value1, value2);
        }

        @GetMapping(path = "/multiply")
        public String multiplyAnswer(@RequestParam("num1") int value1, @RequestParam("num2") int value2) {
            return value1 + " * " + value2 + " = " + calculatorService.multiply(value1, value2);
        }

        @GetMapping(path = "/divide")
        public String divideAnswer(@RequestParam("num1") int value1, @RequestParam("num2") int value2) {
            return value1 + " / " + value2 + " = " + calculatorService.divide(value1, value2);
        }
        @GetMapping(path = "/greetings")
        public String showGreetings(@RequestParam(value = "num1", required = true) int value1, @RequestParam(value = "num2", required = true) int value2) {
            return String.valueOf(value1 + value2);
        }

    }

