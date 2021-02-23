package com.example.calculatorapi.services;
import com.example.calculatorapi.repository.CalculateLogRepository;
import com.example.calculatorapi.services.calculator.Calculator;
import com.example.calculatorapi.services.calculator.CalculatorImpl;
import com.example.calculatorapi.services.db.CalculateLogServiceDataBase;

import com.example.calculatorapi.services.db.CalculateLogServiceDataBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateServiceImpl implements CalculateService {
    private Calculator calculator;
    private CalculateLogServiceDataBase logger;

    @Autowired
    public CalculateServiceImpl(CalculateLogRepository clr){
        this.calculator = new CalculatorImpl();

        this.logger = new CalculateLogServiceDataBaseImpl(clr);
    }

    @Override
    public int calculate(String inputString) {
        return this.calculator.calculate(inputString);
    }

    @Override
    public List<com.example.calculatorapi.model.Calculator> getLog() {
        return this.logger.getLog();
    }
}
