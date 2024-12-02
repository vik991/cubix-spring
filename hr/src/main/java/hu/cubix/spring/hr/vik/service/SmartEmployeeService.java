package hu.cubix.spring.hr.vik.service;

import hu.cubix.spring.hr.vik.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;

@Service
public class SmartEmployeeService implements EmployeeService {
    @Override
    public int getPayRaisePercent(Employee employee) {

        long yearsWorked = Duration.between(employee.getTimestamp(), LocalDateTime.now()).toDays() / 365;

        if (yearsWorked >= 10) {
            return 10; // 10% for 10 or more years
        } else if (yearsWorked >= 5) {
            return 5; // 5% for 5-10 years
        } else if (yearsWorked >= 2.5) {
            return 2; // 2% for 2.5-5 years
        } else {
            return 0; // No raise for less than 2.5 years
        }
    }
}
