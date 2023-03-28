package com.first;

public class F {
	int a=10;//instance variable
	
	static int b=20;//static variable
	
	void m1() {
		System.out.println("inside instance method");
		
	}
	static void m2() {
		System.out.println("inside static method");
		
		
	}
public static void main(String[] args) {
	int c=30;//local variable
	
}
{
	System.out.println("inside instance block");
	System.out.println("a==="+a);
	System.out.println("b==="+b);
}
static {
	System.out.println("inside static block");
	F f1=new F();
	System.out.println("a===="+f1.a);
	f1.m1();
}
}
class MM {
	int aa=40;//instance variable
	
	static int bb=50;//static variable
	
	void m3() {
		System.out.println("111111");//instance method
		F f1=new F();
		System.out.println("a==="+f1.a);
		System.out.println("b==="+F.b);
		
	}
	static void m4() {
		System.out.println("22222");//static method
		F f1=new F();
		System.out.println("a==="+f1.a);
		
		
	}
}
