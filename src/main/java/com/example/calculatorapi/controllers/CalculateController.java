package com.example.calculatorapi.controllers;

import com.example.calculatorapi.model.Calculator;
import com.example.calculatorapi.services.CalculateService;
import com.example.calculatorapi.services.CalculateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
public class CalculateController {
    private CalculateService service;
    private static int nextId = 1;

    @Autowired
    public CalculateController(CalculateService service) {
        this.service = service;
    }

    @PostMapping("/calculator")
    public int calculate(@RequestBody Calculator calculator) {
        calculator.setId(nextId++);
        int result = service.calculate(calculator.getExpression());
        return result;
    }

//    @GetMapping("/calculator")
//    public List<Calculator> getLog() {
//        return service.getLog();
//    }
}