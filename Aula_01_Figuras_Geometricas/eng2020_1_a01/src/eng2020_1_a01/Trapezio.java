package eng2020_1_a01;

public class Trapezio extends Poligono {
	double baseMenor;
	
	public Trapezio(double base, double altura, double baseMenor) {
		super(base,altura);
		this.baseMenor = baseMenor;
	}
	@Override
	public double perimetro() {
		double lateral = getBase()-baseMenor;	
		// TODO Auto-generated method stub
		return getBase()+baseMenor+2*lateral;
	}
	
	public double area() {
		return (getBase()+baseMenor)*getAltura()/2;
	}
	@Override
	public String toString() {
		return "Trapezio [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "base menor" + baseMenor + "]";
	}

}
