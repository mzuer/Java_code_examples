package catch_return;

class Erreur extends Exception{

}

class A{
	public A (int n) throws Erreur{
		if(n==1)
			throw new Erreur();
	}
}
