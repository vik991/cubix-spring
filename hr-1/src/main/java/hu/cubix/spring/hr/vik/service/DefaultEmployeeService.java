package hu.cubix.spring.hr.vik.service;

import hu.cubix.spring.hr.vik.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


public class DefaultEmployeeService implements EmployeeService {

    @Override
    public int getPayRaisePercent(Employee employee) {
        return 5;
    }


}
