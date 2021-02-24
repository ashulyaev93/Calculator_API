package com.example.calculatorapi.model;

import javax.persistence.*;

@Entity
@Table(name = "history_calculation")
public class Calculator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "expression")
    private String expression;

    @Column(name = "result")
    private float result;

    @Column(name = "date")
    private String date;

    public Calculator() {

    }

    public Calculator(int id, String expression, float result, String date) {
        this.id = id;
        this.expression = expression;
        this.result = result;
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return this.expression;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}





