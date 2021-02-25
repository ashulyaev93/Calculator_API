package simpleCalculator.postfix.infix.postfix;

import java.util.ArrayList;

public class ParsePost {
    private StackX theStack;
    private ArrayList<String> input;

    public ParsePost(ArrayList<String> s){
        input = s;
    }

    public float doParse(){
        theStack = new StackX(20);//создание объекта стека
        String str;
        float f = 0;
        int j;
        float num1, num2, interAns;
        boolean isNumber = false;

        for(j = 0; j < input.size(); j++){//для каждого элемента массива
            str = input.get(j);//чтение символа
            theStack.displayStack("" + str + " ");//диагностика

            try {
                f = Float.valueOf(str);
                isNumber = true;
            } catch (NumberFormatException e) {
                // Не число
                isNumber = false;
            }

            if(isNumber) {//если это цифра, занести в стек (!в книге кастомный тип int)
                theStack.push(f);//Занести в стек
            }
            else{//если оператор
                num2 = theStack.pop();// извлечение операндов
                num1 = theStack.pop();

                switch (str){
                    case "+":
                        interAns = num1 + num2;
                        break;
                    case "-":
                        interAns = num1 - num2;
                        break;
                    case "*":
                        interAns = num1 * num2;
                        break;
                    case "/":
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
