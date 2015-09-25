package ex67_eyrolles;

public class Surdef{
	public static void main (String[] args){
		byte bb=1;short p=2;int n=3;long q=4;float x=5f;double y=6;
		A a =new A();a.f(bb);a.f(x);System.out.println();
		B b =new B();b.f(bb);b.f(x);System.out.println();
		C c =new C();c.f(bb);c.f(q);c.f(x);System.out.println();
		D d =new D();d.f(bb);c.f(q);c.f(y);System.out.println();
		E e =new E();e.f(bb);e.f(q);e.f(y);System.out.println();
		F f =new F();f.f(bb);f.f(n);f.f(x);f.f(y);f.f(p);System.out.println();
	}
}
