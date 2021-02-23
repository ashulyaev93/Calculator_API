package com.example.calculatorapi.services.calculator.parser.postfix;

public class PostfixStackX {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public PostfixStackX(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int j){ //размещение элемента на вершине стека;
        stackArray[++top] = j;
    }

    public int pop(){ //извлечение элемента с вершины стека;
        return stackArray[top--];
    }
}
