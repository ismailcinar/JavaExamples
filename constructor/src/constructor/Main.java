package constructor;

public class Main {

	public static void main(String[] args) {
		Person person1=new Person();
		Person person2=new Person("KAz�m");
		Person person3=new Person("KAz�m","Karabekir");
		Person person4=new Person("KAz�m","Karabekir",19);

		System.out.println(person4.name);
		System.out.println(person4.surname);
		System.out.println(person4.age);
		System.out.println(person1.name);

		

	}

}
