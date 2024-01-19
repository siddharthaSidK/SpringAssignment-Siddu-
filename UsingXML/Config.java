package usingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import usingBeans.Employee;
import usingConfig.EmployeeServices;

import java.util.List;
public class Config {
	public static void main(String[] args) {
		EmployeeServices es = new EmployeeServices();
		ApplicationContext con = new FileSystemXmlApplicationContext("spring.xml");
		EmployeeServices emp= con.getBean("EmployeeService",EmployeeServices.class);
		Employee Employee=new Employee(1,"Siddu",27,"Trainer",20000);
 	   es.createEmployee(Employee);
 	   Employee=new Employee(2,"Shoban",30,"Tester",55000);
 	   es.createEmployee(Employee);
 	   //retrieve Employee
 	   Employee getEmployee=es.viewEmployee(2);
 	   System.out.println(getEmployee);
 	   //update Employee
 	   Employee updatedEmployee=new Employee(3,"praveen",35,"HR",60000);
 	   es.updateEmployee(updatedEmployee);
 	   //delete Employee
 	   es.removeEmployee(2);
 	   //list of Employees
 	   List<Employee> list=es.getEmployeeList();
 	   System.out.println("list of Employees:");
 	   for(Employee s:list) {
 		   System.out.println(s);
 	   }
}
}