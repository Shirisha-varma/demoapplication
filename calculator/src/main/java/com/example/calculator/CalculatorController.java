package com.example.calculator;
import com.example.calculator.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
    @Autowired
        private CalculatorService calculatorService;

        @GetMapping("/add")
        public double add(@RequestParam double a, @RequestParam double b) {
            return calculatorService.add(a, b);
        }

        @GetMapping("/subtract")
        public double subtract(@RequestParam double a, @RequestParam double b) {
            return calculatorService.subtract(a, b);
        }

        @GetMapping("/multiply")
        public double multiply(@RequestParam double a, @RequestParam double b) {
            return calculatorService.multiply(a, b);
        }

        @GetMapping("/divide")
        public double divide(@RequestParam double a, @RequestParam double b) {
            return calculatorService.divide(a, b);
        }
    }


