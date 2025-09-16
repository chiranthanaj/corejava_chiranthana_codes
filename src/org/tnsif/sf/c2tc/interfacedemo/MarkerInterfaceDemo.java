package org.tnsif.sf.c2tc.interfacedemo;

public class MarkerInterfaceDemo {
	public static void main(String[] args) {
		Student s=new Student(11,"Arun",20000.00,"Cse");
		s.getId();
		s.setId(100);
		s.getName();
		s.setName("Ravi");
		s.getFees();
		s.setFees(100000.00);
		s.getCourse();
		s.setCourse("Ai");
	}
}