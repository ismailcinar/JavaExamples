package eriþim;

public class Person {
	public String name;
	private String surname;
	int age;
	
	public Person(String n,String s,int a)
	{
		name=n;
		surname=s;
		age=a;
	}
	
	public void print()
	{
		System.out.println(name);
		System.out.println(surname);
		System.out.println(age);

	}

}
