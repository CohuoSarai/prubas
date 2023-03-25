package tareasUnidad_10;

public class TrianguloExtencionBidimencional {

private double semiPerimetro;
	
	public Triangulo(double lado1, double lado2, double lado3) {
			super(lado1, lado2, lado3);
			semiPerimetro = (lado1 + lado2 + lado3) / 2;
			if(!(semiPerimetro > lado1 && semiPerimetro > lado2 && semiPerimetro > lado3)) {
				throw new IllegalArgumentException("los siguientes numros no representan los lado del triangulo");
	}
	}

	
	public double optenerArea() {
		double lado1 = super.optenerLado1();
		double lado2 = super.optenerLado2();
		double lado3 = super.optenerLado3();
		return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
	}


	public String toString() {
		return "Triangulo";
	
}
