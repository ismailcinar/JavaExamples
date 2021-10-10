
public class Main {

	public static void main(String[] args) {
		
		Example e;//=new Example();
		Hesap h1=new Hesap();
		int a,b;
		a=20;
		b=4;
		System.out.println("toplam: "+h1.topla(a, b));
		System.out.println("fark  : "+h1.cikar(a, b));
		System.out.println("carpým: "+h1.carp(a, b));
		System.out.println("bolum : "+h1.bol(a, b));

	}

}
