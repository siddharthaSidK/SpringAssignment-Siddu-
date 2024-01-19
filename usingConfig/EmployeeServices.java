package usingConfig;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Data
@Repository
public class EmployeeServices implements EmployeeDAO{
	private List<Employee> EmployeeList = new ArrayList<Employee>();
	
	public void createEmployee(Employee Employee) {
		if(!(EmployeeList.contains(Employee))) {
		EmployeeList.add(Employee);
		System.out.println("New Employee Created");
		}
		else {
			System.out.println("Employee already Exists");
		}
	}
	public Employee viewEmployee(int sid) {
		for(Employee s:EmployeeList) {
			if(sid==s.getEid()) {
				return s;
			}
		}
		System.out.println("Employee Not Found");
		return null;
	}
	
	public void updateEmployee(Employee Employee){
		for(Employee s:EmployeeList) {
			if(Employee.getEid()==s.getEid()) {
				s.setEid(Employee.getEid());
				s.setEname(Employee.getEname());
				s.setEage(Employee.getEage());
				s.setDepartment(Employee.getDepartment());
				s.setSalary(Employee.getSalary());
			}
	}
	}
	
	public void removeEmployee(int eid) {
		for(Employee s:EmployeeList) {
			if(eid==s.getEid()) {
				EmployeeList.remove(eid);
				System.out.println("Employee Removed Successfully");
			}
			else {
				System.out.println("Employee No found");
				break;
			}
		}
	}
}