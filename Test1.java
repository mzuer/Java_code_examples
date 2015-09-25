//MAI 2013
package ex6;

public class Test1 {

	public static void main(String[] args) {

		Carré1 test1 = new Carré1(new double[][]{{2.0,7.0,6.0},{9.0,5.0,1.0},{4.0,3.0,8.0}}, 3);
		
		for(int i=0; i<test1.taille();i++){
			for(int j=0;j<test1.taille();j++){
				System.out.print(""+test1.getN(i,j)+"\t");				
			}
		System.out.println();	
		}
		
		System.out.println(""+test1.ligne(1));
		System.out.println(""+test1.colonne(1));
		System.out.println(""+test1.diago1());
		System.out.println(""+test1.diago2());
		System.out.println(""+test1.magique());
		
		
	}

}
