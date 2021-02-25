package simpleCalculator.postfix.infix.infix;

import java.util.ArrayList;

public class InToPost {
    private StackX theStack;
    private String input;
    private String output = "";
    private ArrayList<String> output2 = new ArrayList<>();


    public InToPost(String in){
        input = in;
        int stackSize = input.length();
        theStack = new StackX(stackSize);
    }


    public ArrayList<String> doTranse() {

        String temp = "";
        for (int j = 0; j < input.length(); j++) {//для каждого символа
            char ch = input.charAt(j);//чтение символа
            theStack.displayStack("For " + ch + " ");//диагностика
            boolean isNumber = false;
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    temp = temp + ch;
                    isNumber = true;
                    break;
            }
            if(!isNumber){
                output2.add(temp);
                temp = "";
            }
        }
        // Добавляем в массив последнее число
        output2.add(temp);
        temp = "";

        System.out.println(output2.toString());

        while (!theStack.isEmpty()){
            theStack.displayStack("While ");
            output2.add(String.valueOf(theStack.pop()));
            //output = output + theStack.pop();
        }
        theStack.displayStack("End ");
        return output2;
    }


    public void gotOper(char opThis, int prec1) {

        while(!theStack.isEmpty()) {
              char opTop = theStack.pop();
              if (opTop == '(') {
                  theStack.push(opTop);
                  break;
              } else {
                  int prec2;
                  if (opTop == '+' || opTop == '-') prec2 = 1;
                  else prec2 = 2;
                  if (prec2 < prec1) {
                      theStack.push(opTop);
                      break;
                  } else output = output + opTop;
              }
        }
        theStack.push(opThis);
    }


    public void gotParen(char ch) {
        while(!theStack.isEmpty()) {
            char chx = theStack.pop();
            if(chx == '(') break;
            else output = output + chx;
        }
    }
}