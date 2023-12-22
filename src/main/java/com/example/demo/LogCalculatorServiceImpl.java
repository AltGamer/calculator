package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class LogCalculatorServiceImpl implements LogCalculatorService {

    @Override
    public double naturalLogarithm(double number) {
        return Math.log(number);
    }

    @Override
    public double base10Logarithm(double number) {
        return Math.log10(number);
    }
}