package tareasUnidad_10;

public class CirculoBidimencional {

	public void Circulo(double radio) 
	{
		super(radio);
	}

	
	public double optenerArea() 
	{
		return Math.PI * super.optenerLado1() * super.optenerLado1();
	}

	
	public String toString() 
	{
		return "Ciiculo";
	}
	
	

}
	

