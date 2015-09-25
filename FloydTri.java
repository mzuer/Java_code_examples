package floydTriangle;

public class FloydTri {
	
	public static void main (String[] args){
		
		//floydTriangle(5);
		int n4=9;System.out.println(n4); 		//=>9
		double r4=n4;System.out.println(r4);		//=>9.0
		int n5=19/4;System.out.println(n5);		//=>4
		double r5=r4;System.out.println(r5);		//=>9.0
		//int n6=n5/r5;System.out.println(n6);
		double r6=n5/r5;System.out.println(r6);		//=>0.444444....
		//int n7=4/5.6;System.out.println(n7);
		//double r7=4/5.6;System.out.println(r7);
		//int n=5.2;System.out.println(n);
		int n1=(int)5.2;System.out.println(n1);		//=>5
		double r2=19/4;System.out.println(r2);		//=>4.0
		double r3=19.0/4;System.out.println(r3);	//=>4.75
		
	}
	
	public static void floydTriangle(int x){
		
		int n=1;
		for(int i=0;i<x;i++){
			for(int j=0;j<=i;j++){
				System.out.print(n+"\t");
				n++;
			}
			System.out.println();
		}
		
		
	}

}
