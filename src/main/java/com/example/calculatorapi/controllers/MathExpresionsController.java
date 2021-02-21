package com.example.calculatorapi.controllers;

import com.example.calculatorapi.models.MathExpression;
import com.example.calculatorapi.services.MathExpressionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MathExpresionsController {
    private MathExpressionsServiceImpl service;

    @Autowired
    public MathExpresionsController(MathExpressionsServiceImpl service) {
        this.service = service;
    }

    @RequestMapping(path = "/mathexpression", method = RequestMethod.GET)
    public List<MathExpression> getMathExpressions() {
        return service.getMathExpressions();
    }
}
