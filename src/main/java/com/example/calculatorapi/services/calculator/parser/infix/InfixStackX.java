package com.example.calculatorapi.services.calculator.parser.infix;

public class InfixStackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public InfixStackX(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j){ //размещение элемента на вершине стека;
        stackArray[++top] = j;
    }

    public char pop(){ //извлечение элемента с вершины стека;
        return stackArray[top--];
    }

    public boolean isEmpty(){ //true, если стек пуст
        return(top == -1);
    }
}
