package constructor;

public class Person {
String name;
String surname;
int age;

	public Person() 
	{
		System.out.println("unparameter");
	}
	public Person(String n) 
	{
		System.out.println("string");
name=n;
	}
	public Person(String na,String sn ) 
	{
		System.out.println("2 variable");
		name=na;
		surname=sn;
	}

	public Person(String na,String sn, int ag ) 
	{
		System.out.println("3 variable");
		name=na;
		surname=sn;
		age=ag;
	}

}
