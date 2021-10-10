
public class Main {

	public static void main(String[] args) {
		IShape shape;//=new IShape ();
		Kare kare=new Kare();
		Daire daire=new Daire();
			
		shape=kare;
		System.out.println("Karenin alaný    :"+shape.alan(7));
		System.out.println("Karenin çevresi  :"+shape.cevre(7));
		shape=daire;
		System.out.println("dairenin alaný   :"+shape.alan(7));
		System.out.println("dairenin çevresi :"+shape.cevre(7));
	}

}
