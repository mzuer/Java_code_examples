package ex3;

public class C extends B {

	public void m1(int i){
		System.out.println("B::m1");
		super.m1();
	}
	
	public void m3(){
		System.out.println("C:m3");
	}
	
}
