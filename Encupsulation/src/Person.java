
public class Person {
	private	String name;
	private String surname;
	private int age;
	
	
	public void setName(String n)
	{
		name=n;
	}
	public void setSurname(String s)
	{
		surname=s;
	}
	public void setAge(int a)
	{
		if(a>=0 && a<=101)
		age=a;
		else
		{
			age=0;
			System.out.println("wrong entry");
		}
	}
	public String getName()
	{
		return name;
	}
	public String getSurname()
	{
		return surname;
	}
	public int getAge()
	{
		return age;
	}
	public void print()
	{
		System.out.println("Name	 :"+getName());
		System.out.println("Surname  :"+getSurname());
		System.out.println("Age  	 :"+getAge());

	}
}
