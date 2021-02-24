package com.example.calculatorapi.repository;

import com.example.calculatorapi.model.Calculator;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CalculateLogRepository extends CrudRepository<Calculator, Long>{
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "insert into history_calculation values (null, ?1,?2, current_timestamp)")
    void saveLog(String expression, float result);

    @Query(nativeQuery = true, value = "select * from history_calculation where date >= ?1 and date <= ?2")
    List<Calculator> getLogByDateInterval(String fromDate, String toDate);

    @Query(nativeQuery = true, value = "select * from history_calculation where expression = ?1")
    List<Calculator> getLogByExpression(String expression);
}
