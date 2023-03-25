package tareasUnidad_10;

public class CuboTridimencional 
{

	public Cubo(double altura) 
	{
		super(altura);
	}

	
	public double optenerArea() 
	{
		return super.establecerLado1() * super.establecerLado1() * 6;
	}

	
	public double optener Volumen() 
	{
		return super.establecerLado1() * super.establecerLado1() * super.establecerLado1();
	}


	public String toString() {
		return "Cubo";
	}
	
}
