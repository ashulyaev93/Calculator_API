package com.example.calculatorapi.services.calculator;

import com.example.calculatorapi.services.calculator.parser.infix.InfixParserImpl;
import com.example.calculatorapi.services.calculator.parser.Parser;
import com.example.calculatorapi.services.calculator.parser.postfix.PostfixParserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {
    private Parser infixParser;
    private Parser postfixParser;

    @Autowired
    public CalculatorImpl(){
        this.infixParser = new InfixParserImpl();
        this.postfixParser = new PostfixParserImpl();
    }

    @Override
    public int calculate(String str) {
        String infixStr = (String) infixParser.parser(str);
        int result = (int) postfixParser.parser(infixStr);
        return result;
    }
}
