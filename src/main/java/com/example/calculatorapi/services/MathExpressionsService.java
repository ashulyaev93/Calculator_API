package com.example.calculatorapi.services;

import com.example.calculatorapi.models.MathExpression;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface MathExpressionsService {

    List<MathExpression> getMathExpressions();

    int saveLine(String expression, float result);
}
