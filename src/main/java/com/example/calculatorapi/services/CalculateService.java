package com.example.calculatorapi.services;

import com.example.calculatorapi.model.Calculator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CalculateService {
    int calculate(String inputString);
    List<Calculator> showLog(String fromDate, String toDate);
}
