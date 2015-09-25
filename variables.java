package polymorphisme;

public class variables {

	
	public static void main (String[] args){
		
		int i=1;
		afficher(i);
		afficher(i);
		System.out.println("------------");
		A a1 = new A(1);
		a1.afficher();
		a1.modifier();
		a1.afficher();
		System.out.println("------------");
		A a2 = new A(2);
		a2.afficher();
		A a3 = new A(3);
		a3.afficher();
		System.out.println("------------");
		a3=a2;
		a2.afficher();
		a3.afficher();
		System.out.println("------------");
		a2.modifier();
		a2.modifier();
		a2.afficher();
		a3.afficher();
		System.out.println("------------");
		System.out.println(""+(a3==a2));
		System.out.println(""+(a3.equals(a2)));

	}
	
	static void modifier(int i){
		i++;
	}
	
	static void afficher(int i){
		System.out.println(i);
	}

}
	