package io;

import java.io.Serializable;

class Employee  implements Serializable, Comparable<Employee>{
	
	String name;
	int id;
	double salary;
	transient String password;
	
	
	
	Employee() {
		super();
	}
	Employee(String name, int id, double salary, String password) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.password = password;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	String getPassword() {
		return password;
	}
	void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", password=" + password + "]";
	}
	@Override
	public int compareTo(Employee o) {
		int result;
		if (this.id > o.id)
			return 1;
		else if  (this.id < o.id)
			return -1;
		else 
		return this.name.compareTo(o.name);
			
		
		//return this.name.compareTo(o.name);
	}
	
	

}
