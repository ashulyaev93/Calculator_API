package simpleCalculator.postfix.infix.postfix;

public class ParsePost {
    private StackX theStack;
    private String input;

    public ParsePost(String s){
        input = s;
    }

    public int doParse(){
        theStack = new StackX(20);//создание объекта стека
        char ch;
        int j;
        int num1, num2, interAns;

        for(j = 0; j < input.length(); j++){//для каждого символа
            ch = input.charAt(j);//чтение символа
            theStack.displayStack("" + ch + " ");//диагностика
            if(ch >= '0' && ch <= '9') {//если это цифра, занести в стек (!в книге кастомный тип int)
                theStack.push((int) (ch - '0'));//Занести в стек
            }
            else{//если оператор
                num2 = theStack.pop();// извлечение операндов
                num1 = theStack.pop();
                switch (ch){
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                theStack.push(interAns);
            }
        }
        interAns = theStack.pop();
        return interAns;
    }
}
