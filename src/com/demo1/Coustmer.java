package com.demo1;

public class Coustmer {
  int coustmer_id;
  String coustmer_name ;
  String coustmer_city;
  
  public static void main(String[] args) {
	Coustmer c1=new Coustmer();
	Coustmer c2=new Coustmer(5);
	Coustmer c3=new Coustmer(1,"Abc","pune");
	System.out.println("Coustmer="+c3);
	
}

@Override
public String toString() {
	return "Coustmer [coustmer_id=" + coustmer_id + ", coustmer_name=" + coustmer_name + ", coustmer_city="
			+ coustmer_city + "]";
}
  
  Coustmer(){
	  System.out.println("no arugument");
  }
  
  Coustmer(int a){
	  System.out.println("single parameter");
  }

public Coustmer(int coustmer_id, String coustmer_name, String coustmer_city) {
	super();
	this.coustmer_id = coustmer_id;
	this.coustmer_name = coustmer_name;
	this.coustmer_city = coustmer_city;
	

}
  
}
