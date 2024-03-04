package com.tak2;

 class Details {
	 String name="Anu";
	 int age=45;
	void display() {
		System.out.println("Name"+" "+name+" \n"+"Age"+" " +age);
	}

}
class Employee extends Details{
	int empId=45687;
	int salary=75000;
	void display1() {
		System.out.println("EmployeeId"+" "+empId+" \n"+"Salary"+" "+salary);
		super.display();
	}
}
//Employee(){
//	super.display();
//	
//}
	public class Person1 {
		
	
public static void main(String[] args) {

	Employee Emp= new Employee();
	Emp.display1();
	//Emp.display();
	
}
}
