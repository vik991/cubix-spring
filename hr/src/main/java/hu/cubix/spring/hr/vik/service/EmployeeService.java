package hu.cubix.spring.hr.vik.service;

import hu.cubix.spring.hr.vik.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;


public interface EmployeeService {

    int getPayRaisePercent(Employee employee);

}
