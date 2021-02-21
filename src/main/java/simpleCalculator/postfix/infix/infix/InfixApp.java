package simpleCalculator.postfix.infix.infix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixApp {

    public static String trans(String str) throws IOException {
        String output;

            InToPost theTrans = new InToPost(str);
            output = theTrans.doTranse();
//            System.out.println("Postfix is " + output + '\n');

        return output;
    }


    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}

