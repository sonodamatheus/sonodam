package eng2020_1_a01;

public class Cilindro extends Circulo implements Volume{
	private double altura;
	public Cilindro(double raio, double altura) {
		super(raio);
		this.setAltura(altura);
		// TODO Auto-generated constructor stub
	}
	 @Override
	 public double area() {
		 return getRaio() * Math.PI;
	 }
	 public double volume(){
		 return area()* getRaio()*getRaio()*Math.PI;	 
	 }
		public String toString() {
			return "Cilindro [getRaio()=" + getRaio() +  "]";
	}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}

}
