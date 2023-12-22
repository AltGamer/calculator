package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LogCalculatorServiceTest {

    @Autowired
    private LogCalculatorService logCalculatorService;

    @Test
    void testNaturalLogarithm() {
        double result = logCalculatorService.naturalLogarithm(10);
        assertEquals(2.3026, result, 0.0001);
    }

    @Test
    void testBase10Logarithm() {
        double result = logCalculatorService.base10Logarithm(100);
        assertEquals(2, result, 0.0001);
    }

}