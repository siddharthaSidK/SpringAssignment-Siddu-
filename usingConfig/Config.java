package usingConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
public class Config {
	public static void main(String[] args) {
		EmployeeServices es=new EmployeeServices();
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		EmployeeServices employeeDAO=context.getBean(EmployeeServices.class);
		Employee employee=new Employee(1,"Siddu",21,"Developer",200000);
 	   es.createEmployee(employee);
 	   employee=new Employee(2,"Shoban",30,"Tester",55000);
 	   es.createEmployee(employee);
 	   //retrieve employee
 	   Employee getemployee=es.viewEmployee(2);
 	   System.out.println(getemployee);
 	   //update employee
 	   Employee updatedemployee=new Employee(3,"praveen",35,"manager",60023);
 	   es.updateEmployee(updatedemployee);
 	   //delete employee
 	   es.removeEmployee(2);
 	   //list of employees
 	   List<Employee> list=es.getEmployeeList();
 	   System.out.println("list of employees:");
 	   for(Employee e:list) {
 		   System.out.println(e);
 	   }
}
}