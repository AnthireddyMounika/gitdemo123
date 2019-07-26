package com.sysintelli.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.sql.DataSource;


import org.springframework.jdbc.datasource.DriverManagerDataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sysintelli.entity.Employee;

public class EmployeeDAO {

	private JdbcTemplate JdbcTemplate;

	
  public JdbcTemplate getJdbcTemplate() {
		return JdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}

	public int addEmployee(Employee emp) { 
    
		 String query="insert into student values('"+emp.getId()+"','"+emp.getName()+"')";  
				    return JdbcTemplate.update(query);
	}

	public int deleteEmployeeByID(Employee emp) {
		 String query="delete from student where id='"+emp.getId()+"' ";  
		 
			return JdbcTemplate.update(query); 
	}

	public List<Employee> getAllEmployeesRowMapper(){  
		 return JdbcTemplate.query("select * from employee",new RowMapper<Employee>(){  
		      
		    public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Employee e=new Employee();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        
		        return e;  
		    }  
		    });  
		}  

	//public List getAllEmployees() {
		 String query = "select * from employee"; 
		
		 List<Employee> listContact = new LinkedList<Employee>();
	        
	        //return a;
		 
			
	}


	

