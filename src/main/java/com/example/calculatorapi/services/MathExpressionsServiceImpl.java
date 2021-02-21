package com.example.calculatorapi.services;

import com.example.calculatorapi.models.MathExpression;
import com.example.calculatorapi.repository.MathExpressionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.common.collect.Lists;

import java.util.List;

@Service
public class MathExpressionsServiceImpl implements MathExpressionsService{

    private MathExpressionsRepository repository;

    @Autowired
    public MathExpressionsServiceImpl(MathExpressionsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<MathExpression> getMathExpressions() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    public int saveLine(String expression, float result) {
        return repository.saveLine(expression, result);
    }
}
