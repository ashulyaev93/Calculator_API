package com.example.calculatorapi.services.db;

import com.example.calculatorapi.model.Calculator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CalculateLogServiceDataBase {
    void saveLog(String expression, float result);
    List<Calculator> showLogByDate(String fromDate, String toDate);
    List<Calculator> showLogByExpression(String expression);
}
