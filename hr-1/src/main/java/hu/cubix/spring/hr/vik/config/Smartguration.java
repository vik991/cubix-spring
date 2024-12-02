package hu.cubix.spring.hr.vik.config;

import hu.cubix.spring.hr.vik.service.EmployeeService;
import hu.cubix.spring.hr.vik.service.SmartEmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("smart")
public class Smartguration {

        @Bean
        public EmployeeService employeeService(){
            return new SmartEmployeeService();

        }

}
