package com.demo1;

public class Employee {

	
	int employee_id;
	String employee_name;
	String employee_mobilenumber;
	
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Xyz","1254367890");
		
		System.out.println("employee="+e1);
		e1.setEmployee_id(1);
		e1.setEmployee_name("Abc");
		e1.setEmployee_mobilenumber("1234567890");
		System.out.println("employee="+e1);
		
		System.out.println("employee="+e1.employee_name);
		System.out.println("employee="+e1.getEmployee_mobilenumber());
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_mobilenumber="
				+ employee_mobilenumber + "]";
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_mobilenumber() {
		return employee_mobilenumber;
	}

	public void setEmployee_mobilenumber(String employee_mobilenumber) {
		this.employee_mobilenumber = employee_mobilenumber;
	}
	Employee(){
		System.out.println("no argument");
	}
     Employee(int a){
    	 System.out.println("single argument");
     }

	public Employee(int employee_id, String employee_name, String employee_mobilenumber) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_mobilenumber = employee_mobilenumber;
		
		System.out.println("using field");
	}
     
}
