
public class Main {

	public static void main(String[] args) {
		IShape shape;//=new IShape ();
		Kare kare=new Kare();
		Daire daire=new Daire();
			
		shape=kare;
		System.out.println("Karenin alan�    :"+shape.alan(7));
		System.out.println("Karenin �evresi  :"+shape.cevre(7));
		shape=daire;
		System.out.println("dairenin alan�   :"+shape.alan(7));
		System.out.println("dairenin �evresi :"+shape.cevre(7));
	}

}
