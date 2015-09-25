package polymorphisme;

public class Sapin extends Plantes implements Foret{

	public Sapin(String nom, int nbreFlles){
		super(nom, nbreFlles);
	}
	
	public void milieu (){
		System.out.println("forestier");
	}
	
	
	public void typeForet(){
		System.out.println("résineux");
	}
	
}
