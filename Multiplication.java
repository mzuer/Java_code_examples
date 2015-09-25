package multiplication;

public class Multiplication {

	public static void main (String[] args){
		System.out.println(multi(6,12));
		System.out.println(multiAme(4,6));
		System.out.println(puissance(2,2));
		System.out.println(puissance(5,3));
		
	}
	
	//multiplier x  par y
	public static int multi(int x, int y) {
		
		int result=0;
		
		while (y>0){
			result+=x;
			y--;
		}
		return result;	
	}
	
	public static int multiAme(int x, int y){
		int result=0;
		
		while(y>0){
			while(y%2==0){
				x*=2;
				y/=2;
			}
				result+=x;
				y--;
		}
		return result; 
	}
	
	public static int puissance(int x, int y){
		int result=1;
		
		while(y>0){
			while(y%2==0){
				x*=x;
				y/=2;
			}
				result*=x;
				y--;
		}
		return result; 
	}
	
	
}
