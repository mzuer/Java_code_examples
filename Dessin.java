package ex2;

public class Dessin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int row=-2;row<=2;row++){
			for(int col=-2;col<=2;col++){
				if(col*col<row*row)
					System.out.print("* ");
				else
					System.out.print(". ");
			}
			System.out.println();
			
		}

	}

}
