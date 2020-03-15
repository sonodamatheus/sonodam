package eng2020_1_a01;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double lado) {
		super(lado, lado);
		// TODO Auto-generated constructor stub
	}
	
	public double area() {
		return getBase() * getAltura();
	}

	@Override
	public double diagonal() {
		return getAltura() * Math.sqrt(2);
	}
	
	@Override
	public double perimetro() {
		return getBase()*4;
	}
	public String toString() {
		return "Quadrado [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}

}
