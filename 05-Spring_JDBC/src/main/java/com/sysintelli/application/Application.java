package com.sysintelli.application;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sysintelli.dao.EmployeeDAO;
import com.sysintelli.entity.Employee;

public class Application {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		ApplicationContext context1= new ClassPathXmlApplicationContext("spring_config.xml");
		
		                
		
		EmployeeDAO dao=(EmployeeDAO)context1.getBean("edao");
		  System.out.println("hi");
	   int stats=dao.addEmployee (new Employee(4,"lcky"));

	  System.out.println("sucessfully inserted");
	   
	  int stat=dao.deleteEmployeeByID (new Employee(4));
	  System.out.println("sucessfully deleted");
		     
		    List<Employee> lis=dao.getAllEmployeesRowMapper();  
	          
		    for(Employee e:lis)  
		        System.out.println(e.toString());
		    
		    
		   
		    
	}

}
