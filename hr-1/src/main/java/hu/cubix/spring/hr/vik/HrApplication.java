package hu.cubix.spring.hr.vik;

import hu.cubix.spring.hr.vik.model.Employee;
import hu.cubix.spring.hr.vik.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class HrApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}


	@Autowired
	SalaryService salaryService;

		@Override
		public void run(String... args) throws Exception {

			// Creating some new test employees
			Employee emp1 = new Employee(1, "Developer", 50000, LocalDateTime.now().minusYears(3));
			Employee emp2 = new Employee(2, "Manager", 70000, LocalDateTime.now().minusYears(8));
			Employee emp3 = new Employee(3, "Director", 100000, LocalDateTime.now().minusYears(12));
			Employee emp4 = new Employee(4, "Intern", 30000, LocalDateTime.now().minusMonths(6));


			// Printing original salaries
			System.out.println("Original Salaries:");
			System.out.println(emp1.getJob() + "Salary: " + emp1.getSalary());
			System.out.println(emp2.getJob() + "Salary: " + emp2.getSalary());
			System.out.println(emp3.getJob() + "Salary: " + emp3.getSalary());
			System.out.println(emp4.getJob() + "Salary: " + emp4.getSalary());

			// Apply salary raise
			salaryService.setNewSalary(emp1);
			salaryService.setNewSalary(emp2);
			salaryService.setNewSalary(emp3);
			salaryService.setNewSalary(emp4);

			// Printing out updated salaries
			System.out.println("\nUpdated Salaries:");
			System.out.println(emp1.getJob() + " Salary: " + emp1.getSalary());
			System.out.println(emp2.getJob() + " Salary: " + emp2.getSalary());
			System.out.println(emp3.getJob() + " Salary: " + emp3.getSalary());
			System.out.println(emp4.getJob() + " Salary: " + emp4.getSalary());


		}
	}

