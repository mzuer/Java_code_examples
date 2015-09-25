package ex46;

public class AbstractStatic {
	
	    public static void main(String[] args) {

	    	N un = new N();
	        System.out.println(un.n); 	//1
	        System.out.println(un.b); 	//false
	        System.out.println(un.i);	//1
	    	System.out.println("****");
	    	un.m1();
	    	System.out.println("****");
	        System.out.println(un.n);	//1	
	        System.out.println(un.b);	//true
	        System.out.println(un.i);	//1
	        
	        //********************************************
	        
	        N deux = new N(true);
	        System.out.println(deux.n);	//4
	        System.out.println(deux.b);	//false
	        System.out.println(deux.i);	//2
	        
	        deux.m1();
	        System.out.println(deux.n);	//4
	        System.out.println(deux.b);	//true
	        System.out.println(deux.i);	//2
	        
	        deux.m3();	        
	        System.out.println(deux.n);	//4
	        System.out.println(deux.b);	//true
	        System.out.println(deux.i);	//3  
	        
	        //********************************************
	        
	        Z trois = new Z();
	        System.out.println(trois.n);	//5
	        System.out.println(trois.b);	//false
	        System.out.println(trois.o);	//1
	        
	        trois.m1();
	        System.out.println(trois.n);	//5
	        System.out.println(trois.b);	//false
	        System.out.println("##########");
	        System.out.println(trois.m1());
	        System.out.println("##########");
	        System.out.println(trois.o);	//1
	        
	        trois.m3();	        
	        System.out.println(trois.n);	//5
	        System.out.println(trois.b);	//false
	        System.out.println(trois.o);	//2     
	        
	        //********************************************
	        
	        Z quatre = new Z(false);
	        System.out.println(quatre.n);	//6
	        System.out.println(quatre.b);	//false
	        System.out.println(quatre.o);	//4
	        
	        quatre.m3();	        
	        System.out.println(quatre.n);	//6
	        System.out.println(quatre.b);	//false
	        System.out.println(quatre.o);	//5
	        
	        
	        Q cinq = new Q();
	        System.out.println(cinq.n);	//7
	        System.out.println(cinq.d);	//0    
	        
	        cinq.m2();
	        System.out.println(cinq.n);	//7
	        System.out.println(cinq.d);	//0
	    }
	}

