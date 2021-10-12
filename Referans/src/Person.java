
public class Person {
	String name;
	String surname;
	int age;
	
	
	Person(String n,String s,int a)
	{
		name=n;
		surname=s;
		age=a;
		
		
	}
	void print()
	{
		System.out.println("name    : "+name);
		System.out.println("surname : "+surname);
		System.out.println("age     : "+age);
		System.out.println("========= ");

	}

}
