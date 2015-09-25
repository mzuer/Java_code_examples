package ex3;

public class Mouette extends Oiseau implements EtreVolant{

	public void vole(){
		System.out.println("méthode de l'interface");
	}
	
	public void voleMouette(){
		System.out.println("je suis une mouette");
	}
	
}
