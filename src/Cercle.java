public class Cercle {
	
	double radi;
	
	Cercle (double radi) {
		this.radi = radi;
	} 
	
	double area() {
		return Math.PI*Math.pow(radi, 2);
	}
	
}
