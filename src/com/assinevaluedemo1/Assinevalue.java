package com.assinevaluedemo1;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Assinevalue {

	static void Employee() throws CloneNotSupportedException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter empid");
		int empid=sc.nextInt();
		
		System.out.println("enter empname");
		String empname=sc.next();
		
		System.out.println("enter empcity");
		String empcity=sc.next();
		
		Emp e1=new Emp(empid,empname,empcity);
		
		System.out.println("e1=="+e1);
		
		Emp e2=(Emp)e1.clone();

		System.out.println("e2=="+e2);
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee();
	}
}
class Emp implements Cloneable {
	
	int empid;
	String empname;
	String empcity;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empname=" + empname + ", empcity=" + empcity + "]";
	}
	public Emp(int empid, String empname, String empcity) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empcity = empcity;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}