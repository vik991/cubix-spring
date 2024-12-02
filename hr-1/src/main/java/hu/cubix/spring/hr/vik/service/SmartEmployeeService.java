package hu.cubix.spring.hr.vik.service;

import hu.cubix.spring.hr.vik.config.PayriseConfig;
import hu.cubix.spring.hr.vik.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;


public class SmartEmployeeService implements EmployeeService {
// I have commented out the @Value solutions
//    @Value("${payrise.lowerLimit}")
//    private int limitLower;
//    @Value("${payrise.higherLimit}")
//    private int limitHigher;
//    @Value("${payrise.percent}")
//    private int percent;
    @Autowired
    PayriseConfig config;



    @Override
    public int getPayRaisePercent(Employee employee) {

        long yearsWorked = Duration.between(employee.getTimestamp(), LocalDateTime.now()).toDays() / 365;


        if (yearsWorked >= 10) {
            return 10; // 10% for 10 or more years
        } else if (yearsWorked >= config.getHigherLimit()) {
            return config.getPercent(); // 5% for 5-10 years
        } else if (yearsWorked >= config.getLowerLimit()) {
            return 2; // 2% for 2.5-5 years
        }


        else {
            return 0; // No raise for less than 2.5 years
        }
    }
}
