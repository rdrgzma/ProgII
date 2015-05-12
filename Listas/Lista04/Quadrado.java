public class Quadrado{
	double lado;
	
	double areaQuadrado(){
		return lado*lado;
	}
	double perimetroQuadrado(){
		return 4*lado;
	}
	double diagonalQuadrado(){
		return 1.41*lado;
	}
}