package eng2020_1_a01;

public abstract class Poligono extends Figura {
	private double base, altura;
	
	@Override
	public String toString() {
		return "Poligono [base=" + base + ", altura=" + altura + "]";
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Poligono() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double perimetro() {
		return 0;
	}

}
