package inheritance;

public class Main {

	public static void main(String[] args)
	{
		Accountant a1=new Accountant();
		Person p1=new Person();
		a1.name="ismail";
		a1.surname="çýnar";
		a1.age=22;
		a1.salary=100000;
		
		p1.name="kazim";
		p1.surname="karabekir";
		p1.age=33;
		
		
		Admin ad1= new Admin();
		ad1.name="iso";
		ad1.surname="çýnar";
		ad1.age=23;
		ad1.role="admin";
		System.out.println("Information of the object of the person class");
		p1.print();
		System.out.println("Information of the object of the Accountant class");
		a1.print();
		System.out.println("Information of the object of the Admin class");
		ad1.print();
		
	}

}
