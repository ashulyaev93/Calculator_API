package com.example.calculatorapi.model;

import javax.persistence.*;
import java.util.Scanner;

@Entity
@Table(name = "math_expression")
public class Calculator {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "expression")
    private String expression;

//    @Column(name = "date")
//    private String date;

    @Column(name = "result")
    private float result;

    public Calculator(){

    }

    public Calculator(int id, String expression, float result){
        this.id = id;
        this.expression = expression;
//        this.date = date;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpression() {
        return expression;
    }

    public float getResult() {
        return result;
    }

    @Override
    public String toString(){
        return expression + " " + result;
    }
    }



