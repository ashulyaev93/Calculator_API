package com.example.calculatorapi.repository;

import com.example.calculatorapi.models.MathExpression;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MathExpressionsRepository extends CrudRepository<MathExpression, Long>{
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "insert into math_expression values (?1,?2)")
    int saveLine(String expression, float result);
}
