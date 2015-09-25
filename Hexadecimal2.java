package ex72;

public class Hexadecimal2 {

	private int nombre;
	private String hexa;
	
	
	//1er constr : à partir d'une valeur entière
	public Hexadecimal2(int n){
		nombre=n;
		hexa=convertHexa(nombre);
		
	}
	
	//2ème constr : à partir d'une chaine de caractères
	public Hexadecimal2(String s){
			hexa=s;
			nombre = convertNum(s);
			
		}
	
	
	//lire la valeur sous forme numérique
	public int toInt(){
		return nombre;
	}
	
	
	//lire la valeur sous forme hexadécimale
	public String toString(){
		return hexa;
	}
	
	
	public String convertHexa(int n){
		
		
	}
	
	
	public int convertNum(String hexa){
		
		
		
	}
	
	public static void main (String[]args){
		
		
		
	}
	
}
