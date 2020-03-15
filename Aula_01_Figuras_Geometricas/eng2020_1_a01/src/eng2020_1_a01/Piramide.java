package eng2020_1_a01;

public class Piramide extends Quadrado implements Volume {
	private double altura;
	public Piramide(double lado, double altura) {
		super(lado);
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}
	public double area() {
		return getBase()*getBase();
	}
	public double volume(){
		return area()*altura;
	}
	public String toString() {
		return "Piramide [getBase()=" + getBase() + "getAltura()" + getAltura() +"]";
	}
}
