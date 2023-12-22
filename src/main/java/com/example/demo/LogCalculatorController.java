package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator/logarithm")
public class LogCalculatorController {

    private final LogCalculatorService logCalculatorService;

    public LogCalculatorController(LogCalculatorService logarithmCalculatorService) {
        this.logCalculatorService = logarithmCalculatorService;
    }

    @GetMapping("/natural")
    public double naturalLogarithm(@RequestParam double number) {
        return logCalculatorService.naturalLogarithm(number);
    }

    @GetMapping("/base-10")
    public double base10Logarithm(@RequestParam double number) {
        return logCalculatorService.base10Logarithm(number);
    }
}