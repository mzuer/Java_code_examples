package ex3;

public class Main {


	public static void main(String[] args) {
		
		B b = new C(); 			//OK car C extends B
		b.m1();b.m2();b.m3();
		//B::m1
		//A::m2B::m2
		//C::m3
		
		b = new B();
		b.m1();b.m2("2");b.m3();
		//B::m1
		//A::m22
		//B::m3

	}

}
