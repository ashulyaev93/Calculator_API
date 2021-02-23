package com.example.calculatorapi.services.calculator;

import org.springframework.stereotype.Service;

@Service
public interface Calculator {
    int calculate(String inputString);
}
