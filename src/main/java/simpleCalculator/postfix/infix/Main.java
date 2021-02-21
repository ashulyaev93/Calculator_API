package simpleCalculator.postfix.infix;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner math = new Scanner(System.in);
        String str = math.nextLine();

        Calculator calculator = new Calculator();
        int result = calculator.calculate(str);
        System.out.println(result);
    }
}
