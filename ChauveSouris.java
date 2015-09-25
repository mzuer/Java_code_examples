package ex3;

public class ChauveSouris extends Mammifère implements EtreVolant{

	public void vole(){
		System.out.println("méthode de l'interface");
	}
	
	public void voleChauve(){
		System.out.println("je suis une chauvesouris");
	}
	
}
