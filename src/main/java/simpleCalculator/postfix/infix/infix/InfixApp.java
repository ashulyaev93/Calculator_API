package simpleCalculator.postfix.infix.infix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InfixApp {

    public static ArrayList<String> trans(String str) throws IOException {
        ArrayList<String> output2;

            InToPost theTrans = new InToPost(str);
            output2 = theTrans.doTranse();
            System.out.println("Postfix is " + output2 + '\n');

        return output2;
    }


    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}

