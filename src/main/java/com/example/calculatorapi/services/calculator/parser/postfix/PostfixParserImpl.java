package com.example.calculatorapi.services.calculator.parser.postfix;

import com.example.calculatorapi.services.calculator.parser.Parser;
import org.springframework.stereotype.Service;

@Service
public class PostfixParserImpl implements Parser {

    @Override
    public Integer parser(String inputString) {
        int output;

        ParsePost aParser = new ParsePost(inputString);
        output = aParser.doParse();

        return output;
    }
}
