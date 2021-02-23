package com.example.calculatorapi.services.db;

import com.example.calculatorapi.model.Calculator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CalculateLogServiceDataBase {
    boolean saveLog(String inputString, float result);
    List<Calculator> getLog(String fromDate, String toDate);
}
