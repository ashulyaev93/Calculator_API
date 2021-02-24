package com.example.calculatorapi.services;

import com.example.calculatorapi.model.Calculator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CalculateService {
    int calculate(String inputString);
    List<Calculator> showLogByDate(String fromDate, String toDate);
    List<Calculator> showLogByExpression(String expression);
}
