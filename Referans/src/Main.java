
public class Main {

	public static void main(String[] args) {
		
		Person reference;
		Person p1=new Person("ismail","��nar",22);
		Admin a1=new Admin("kaz�m","karabekir",20);
		Employee e1=new Employee("kalem","say",19);
		
		reference=a1;
		
		p1.print();
		reference.print();
		e1.print();
	}

}
