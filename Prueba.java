package tareasUnidad_10;
import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args) 
	{

		List<Figura> figuraList = new ArrayList<Figura>() 
		{
		{
				add(new Circulo(10));
				add(new Triangulo(3, 3, 4));
				add(new Cuadrado(5));
				add(new Esfera(17));
				add(new Cubo(8));
				add(new Tetraedro(9));
			}
		};

		for (Figura figura : figuraList) 
		{
			if (figura instanceof Bidimencional) 
		{
				System.out
						.println("El area de " + figura + " = " + ((Bidimencional) figura).optenerArea());
			} else if (figura instanceof Tridimecional) {
				System.out
						.println("El area de " + figura + " = " + ((Tridimecional) figura).optenerArea()
								+ " | El volumen de la figura = " + ((Tridimecional) figura).optenerVolumen());
			}
		}

	}
	
}
