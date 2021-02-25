package simpleCalculator.postfix.infix;

import simpleCalculator.postfix.infix.infix.InfixApp;
import simpleCalculator.postfix.infix.postfix.PostfixApp;

import java.io.IOException;
import java.util.ArrayList;

public class Calculator {
    public float calculate(String str) throws IOException {
        ArrayList<String> infixStr = InfixApp.trans(str);
        float result = PostfixApp.parser(infixStr);
        return result;
    }
}
