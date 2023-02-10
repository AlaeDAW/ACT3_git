public class Corona {
	Cercle exterior;
	Cercle interior;
	
	Corona (Cercle cint, Cercle cext) {
		interior = cint;
		exterior = cext;
	}
	
	double area() {
		return exterior.area() - interior.area();
	}
	
}