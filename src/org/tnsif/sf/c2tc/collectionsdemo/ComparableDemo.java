package org.tnsif.sf.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
class Person5 implements Comparable<Person5>
{
	String name;
	int age;
	
	public Person5(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void display()
	{
		System.out.println("Name :"+  name +"  age :"+age);
	}
	//sort by name
	public int compareTo(Person5 other)
	{
		return this.name.compareTo(other.name);
	}
}
public class ComparableDemo {
public static void main(String[] args) {
		ArrayList<Person5> people=new ArrayList<>();
		people.add(new Person5("John",26));
		people.add(new Person5("Anil",29));
		people.add(new Person5("Sushma",71));
		
		Collections.sort(people);
		
		for(Person5 person:people)
		{
			person.display();
		}

	}

}