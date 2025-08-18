package org.tnsif.sf.c2tc.oops;

class Course
{
	String coursename = "Java Programming";
	
	void showCourse() 
	{
		System.out.println("Course : "+coursename);	
	}
		
}

class Student extends Course
{
	String name = "Amit";
	
	void showStudent()
	{
		System.out.println("Name : "+name);
	}
}

public class Singlelevelinheritance {
	public static void main(String[] args) {

		Student s = new Student();
		s.showCourse();
		s.showStudent();
	}
}