package com.tak2;

import java.util.Scanner;

public class Person {
	
		  private String name;
		  private int age;

		  // Constructor to initialize name and age
		  public Person(String name, int age) {
		    this.name = name;
		    this.age = age;
		  }

		  // Method to display name and age
		  public void displayInfo() {
		    System.out.println("Name: " + name + ", Age: " + age);
		  }
		  public static void main(String[] args) {
			Person p1=new Person("Anu", 18);
			p1.displayInfo();
		}
		}

	
	
