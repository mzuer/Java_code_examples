package euclide;

public class Euclide {
	
	public static void main (String[] args){
		
		System.out.println(euclide2(6,36));
		System.out.println(euclide2(5,25));
		System.out.println(euclide2(49,14));
		System.out.println(euclide2(225,45));
		
	}
	
	public static int pgdc(int a, int b){
		
		while(a!=b){
			
			if(a>b)
				a-=b;
			else
				b-=a;
		}
		return a;
		
	}
	
	public static int pgdcRec(int a, int b){
		
		if(a==b)
			return a;
		else if(a>b)
			return pgdcRec(a-b,b);
		else
			return pgdcRec(a,b-a);
	}

	public static int euclide2(int a, int b){
		int temp;
		/*if(a>b){
			temp=a;
			a=b;
			b=temp;
		}*/
		while(b>0){
			temp=a%b;
			a=b;
			b=temp;
		}
		return a;
	}
	
}
