package com.example.calculatorapi.controllers;

import com.example.calculatorapi.model.Calculator;
import com.example.calculatorapi.services.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @PostMapping("/history/date")
    @ResponseBody
    public List<Calculator> showLogByDate(@RequestBody Map<String,String> param) {
        List<Calculator> dataDate = service.showLogByDate(param.get("fromDate"), param.get("toDate"));
        return dataDate;
    }

    @PostMapping("/history/expression")
    @ResponseBody
    public List<Calculator> showLogByExpression(@RequestBody Map<String,String> params) {
        List<Calculator> dataExpression = service.showLogByExpression(params.get("expression"));
        return dataExpression;
    }
}