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
    public boolean saveLog(String inputString, float result) {
        return true;
    }

    @Override
    public List<Calculator> getLog(String fromDate, String toDate) {
        return Lists.newArrayList(repository.findAll());
    }
}
