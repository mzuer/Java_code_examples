package horner;

public class Horner {

	private double[] coeff;
	
	public Horner(double[] tab){
		coeff=tab;
	}
	
	
	public double horner (double x){
	
	    double result = 0;
	    for (int i = coeff.length - 1; i >= 0; i--)
	        result = coeff[i] + (x * result);
	    return result;
	}
}

