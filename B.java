package ex3;

public class B extends A{

	public void m1(){
		System.out.println("B::m1");
	}
	
	public void m2(){
		super.m2("B::m2");
	}
	
	public void m3(){
		System.out.println("B::m3");
	}
}
