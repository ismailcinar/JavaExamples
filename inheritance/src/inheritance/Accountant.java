package inheritance;

public class Accountant extends Person
{
	int salary;
	public void print()
	{
		super.print();
		System.out.println("salary    :"+salary);
	}
}
