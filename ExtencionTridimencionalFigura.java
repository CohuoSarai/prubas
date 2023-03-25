package tareasUnidad_10;

public class ExtencionTridimencionalFigura 
{

	public Tridimecional(double lado1, double lado2,double lado3) {
		super(lado1, lado2, lado3);
	}
	public Tridimecional(double lado1,double lado2) {
		super(lado1,lado2);
	}
	public Tridimecional(double lado1) {
		super(lado1);
	}
	public Tridimecional() {
		super();
	}
	
	
	
	public abstract double optenerArea(); 
	public abstract double optenerVolumen(); 
	
}
