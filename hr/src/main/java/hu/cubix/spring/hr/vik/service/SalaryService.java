package hu.cubix.spring.hr.vik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hu.cubix.spring.hr.vik.model.Employee;

@Service
public class SalaryService {


    private  EmployeeService employeeService;

    @Autowired
    public SalaryService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void setNewSalary(Employee employee) {
        int raisePercent = employeeService.getPayRaisePercent(employee);
        int newSalary = employee.getSalary() + (employee.getSalary() * raisePercent / 100);
        employee.setSalary(newSalary);
    }

}
