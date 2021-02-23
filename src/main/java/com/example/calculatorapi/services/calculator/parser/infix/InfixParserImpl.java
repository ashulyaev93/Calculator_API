package com.example.calculatorapi.services.calculator.parser.infix;

import com.example.calculatorapi.services.calculator.parser.Parser;
import org.springframework.stereotype.Service;

@Service
public class InfixParserImpl implements Parser {

    @Override
    public String parser(String inputString) {
        String output;

        InToPost theTrans = new InToPost(inputString);
        output = theTrans.doTranse();

        return output;
    }
}
