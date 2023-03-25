package tareasUnidad_10;

public class TridimencionalTetraedro {

	
	public void Tetraedro(double altura) 
	{
		super(altura);
	}


	public double optenerArea() 
	{

		return super.optenerLado1() * super.optenerLado1() * Math.sqrt(3);
	}


	public double optenerVolumen() 
	{

		return super.optenerLado1() * super.optenerLado1() * super.optenerLado1() * 
				(Math.sqrt(2) / 12);
	}

	
	public String toString() {
		return "Tetraedro";
	}
	
}
