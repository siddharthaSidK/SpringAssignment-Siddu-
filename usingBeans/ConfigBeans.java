package usingBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.concentrix.spring_transaction_demo.config.BeanConfig;
//import com.concentrix.spring_transaction_demo.model.Employee;
//import com.concentrix.spring_transaction_demo.service.EmpService;

public class ConfigBeans 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
        		new AnnotationConfigApplicationContext(BeanConfiguration.class);
    	context.registerShutdownHook();
        
        EmployeeService service = context.getBean(EmployeeService.class);
        
        Employee emp = new Employee(121,"Siddu",35, "Trainer",44231);
        service.save(emp);
        service.upd();
        service.del(108);
        context.close();
        
    }
}