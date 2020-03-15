package eng2020_1_a01;

public class Cubo extends Quadrado implements Volume{

	public Cubo(double lado) {
		super(lado);;
		// TODO Auto-generated constructor stub
	}
	 @Override
	 public double area() {
		 return getBase() * getAltura();
	 }
	 public double volume(){
		 return area()* getAltura();	 
	 }
		public String toString() {
			return "Cubo [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}


}
