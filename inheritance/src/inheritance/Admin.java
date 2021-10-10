package inheritance;

public class Admin extends Person 
{
	String role;
	
	public void print()
	{
		super.print();
		System.out.println("role      :"+role);


	}

	

}
