package irred;

public class Fraction {
	
	private int num;
	private int den;
	
	public Fraction(int x, int y){
		num=x;
		den=y;
	}
	
	public void reduire(){
			int i =pgdc(num,den);
			num/=i;
			den/=i;
		}
		
	
	public int pgdc(int a, int b){
		
		while(a!=b){
			if(a>b)a-=b;
			if(a<b)b-=a;
		}
		return a;
	}
	
	public String toString(){
		return num+"/"+den;
	}

}
