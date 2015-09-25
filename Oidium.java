package polymorphisme;

public class Oidium extends Champignons{

	private String cepage;
	
	public Oidium (String nom, boolean comestible, String cepage){
		super(nom, comestible);
		this.cepage=cepage;
	}
	
	public void cepageAttaque(){
		System.out.println(cepage);
	}
	
}
