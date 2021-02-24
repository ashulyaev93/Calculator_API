package com.example.calculatorapi.controllers;

import com.example.calculatorapi.model.Calculator;
import com.example.calculatorapi.services.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalculateController {
    private CalculateService service;

    @Autowired
    public CalculateController(CalculateService service) {
        this.service = service;
    }

    @PostMapping("/calculator")
    public int calculate(@RequestBody Calculator calculator) {
        int result = service.calculate(calculator.getExpression());
        return result;
    }

    @GetMapping("/historycalc")
    public List<Calculator> showLog(@RequestBody Calculator logger) {
        List<Calculator> date = service.showLog(logger.getFromDate(), logger.getToDate());
        return date;
    }
}