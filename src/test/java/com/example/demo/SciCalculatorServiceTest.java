package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SciCalculatorServiceTest {

    @Autowired
    private SciCalculatorService sciCalculatorService;

    @Test
    void testPower() {
        double result = sciCalculatorService.power(2, 3);
        assertEquals(8, result, 0.0001);
    }

    @Test
    void testSquareRoot() {
        double result = sciCalculatorService.squareRoot(16);
        assertEquals(4, result, 0.0001);
    }
}