package simpleCalculator.postfix.infix;

import simpleCalculator.postfix.infix.infix.InfixApp;
import simpleCalculator.postfix.infix.postfix.PostfixApp;

import java.io.IOException;

public class Calculator {
    public int calculate(String str) throws IOException {
        String infixStr = InfixApp.trans(str);
        int result = PostfixApp.parser(infixStr);
        return result;
    }
}
