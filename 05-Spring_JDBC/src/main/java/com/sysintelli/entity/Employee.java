package com.sysintelli.entity;

public class Employee {

	private int id;
	private String name;

	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}
public Employee(int id){
	this.id=id;
}
	
    public Employee() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
