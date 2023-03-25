package tareasUnidad_10;

public class EsferaTridimencional 
{

	public Esfera(double radio) 
	{
		super(radio);
	}

	public double optenerArea() 
	{

		return 4 * Math.PI * Math.pow(super.optenerLado1(), 2);
	}

	
	public double optenerVolumen() {

		return 4 / 3 * Math.PI * Math.pow(super.optenerLado1(), 3);
	}
	

	public String toString() {
		return "Esfera";
	}
	
}
