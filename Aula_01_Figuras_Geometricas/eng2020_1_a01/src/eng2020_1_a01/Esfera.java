package eng2020_1_a01;

public class Esfera extends Circulo implements Volume{

	public Esfera(double raio) {
		super(raio);
		// TODO Auto-generated constructor stub
	}
/*	 @Override
	 public double area() {
		 return getRaio() * Math.PI;
	 }
*/	 public double volume(){
		 return 4/3*(area()*area()*area())* Math.PI;	 
	 }
		public String toString() {
			return "Esfera [getBase()=" + getRaio() +"]";
	}


}
