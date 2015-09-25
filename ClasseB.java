//OCTOBRE 2006
package ex5;

public class ClasseB implements InterfaceA{

	int a;
	
	public ClasseB(){
		a=0;
	}
	
	public int methodeA(){
	//il faut déclarer b !
		int b;
		b=0;
		//manque le return
		return b;
	}
	
	//il faut implémenter la 2ème méthode de l'interface :

	public void methodeB(int a){
		System.out.println(""+a);
	}

	
	public static void main(String[] args) {

		ClasseB b;
		//il faut instancier
		b = new ClasseB();
		b.methodeA();
		
	}

}
