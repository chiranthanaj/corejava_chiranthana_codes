package org.tnsif.sf.c2tc.oops;

class Human1
{
	int age;
	String name;
}


public class BeforeEncapsulation {

	public static void main(String[] args) {
		Human1 obj=new Human1();
		obj.age=20;
		obj.name="chiru";
		obj.age=16;
		obj.name="niharika";
		System.out.println("Age " +obj.age + " "+ "Name "+obj.name);
	}

}