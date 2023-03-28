package com.second;

public class A {


  public int a=20;//instance variable
     
   public static int b=30;//static variable
    
   public void m1() {
    	System.out.println("inside instance method");
      	A aa=new A();
    	aa.m1();
    	C.m2();
    	System.out.println("a==="+aa.a);
    	System.out.println("q==="+C.q);
    }
    
   public static void m2() {
    	System.out.println("inside static method");
    	
    	
    }
   
   public static void main(String[] args) {
		C cc=new C();
		cc.m1();
	
    	
	}
}
   


class C {

   public int a=10;//instance variable
 
  public static int q=50;//static variable

 public void m1() {
	System.out.println("inside instance method");
}

 public static void m2() {
	System.out.println("inside static method");
	A aa=new A();
	aa.m1();
	System.out.println("a==="+aa.a);
	System.out.println("inside instance method");
	System.out.println(A.b);
}
}