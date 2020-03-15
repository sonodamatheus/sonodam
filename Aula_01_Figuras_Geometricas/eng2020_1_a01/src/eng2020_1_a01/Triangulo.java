package eng2020_1_a01;

public class Triangulo extends Poligono{
	public Triangulo(double base, double altura) {
		super(base, altura);
	}
	
	public	double area(){
			return getBase()*getAltura()/2;
		}
	@Override
	public String toString() {
		return "Triangulo [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}
	@Override
	public double perimetro() {
		
		return getBase()*3;
	}
}
