//JUIN 2005
package ex6;

public class Exceptions {

	public static void throwAnException(){
		throw new IllegalStateException();
	}
	

	public static void main(String[] args) {

		System.out.println("A");
		//=>1) A
		
		A a  = null;
		//e=null;
		
		if(a==null) System.out.println("ouioui");
		
		try{
			System.out.println("B");
			//=> 2) B
			throwAnException();		//appelle la méthode qui déclenche ISE
			System.out.println("C");
			//N'affiche pas C !!!
		}
		catch(IllegalArgumentException iae){
			System.out.println("D");
		}
		catch(IllegalStateException ise){
			System.out.println("E");
			return;
			//=> 3) E
		}
		catch(IndexOutOfBoundsException ioe){
			System.out.println("F");
		}
		finally{
			System.out.println("G");
			//=> 5) G
		}
		System.out.println("H");
		//=> 6) H
	}

}


class A{}