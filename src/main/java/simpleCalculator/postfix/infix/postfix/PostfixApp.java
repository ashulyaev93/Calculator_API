package simpleCalculator.postfix.infix.postfix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostfixApp {

    public static int parser(String str) throws IOException {
        int output;

            ParsePost aParser = new ParsePost(str);
            output = aParser.doParse();
            System.out.println("Evaluates to " + output);
            return output;
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}

