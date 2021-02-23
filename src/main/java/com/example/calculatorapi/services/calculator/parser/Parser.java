package com.example.calculatorapi.services.calculator.parser;

import org.springframework.stereotype.Service;

@Service
public interface Parser<T> {
    T parser(String inputString);
}
