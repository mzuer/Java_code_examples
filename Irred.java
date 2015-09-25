package irred;

public class Irred {
	
	public static void main (String[]args){
		
		Fraction f = new Fraction(36,8);
		System.out.println(f);
		f.reduire();System.out.println(f);
		
		Fraction g= new Fraction(63,42);
		System.out.println(g);
		g.reduire();System.out.println(g);
				
		
	}

}
