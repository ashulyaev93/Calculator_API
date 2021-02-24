package com.example.calculatorapi.services.db;

import com.example.calculatorapi.model.Calculator;
import com.example.calculatorapi.repository.CalculateLogRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateLogServiceDataBaseImpl implements CalculateLogServiceDataBase {
    private CalculateLogRepository repository;

    @Autowired
    public CalculateLogServiceDataBaseImpl(CalculateLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveLog(String expression, float result) {
        repository.saveLog(expression, result);
    }

    @Override
    public List<Calculator> showLogByDate(String fromDate, String toDate) {
        return Lists.newArrayList(repository.getLogByDateInterval(fromDate, toDate));
    }

    @Override
    public List<Calculator> showLogByExpression(String expression) {
        return Lists.newArrayList(repository.getLogByExpression(expression));
    }
}
