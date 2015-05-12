public class Exercicio1{
	public static void main(String [] args){
		Quadrado q = new Quadrado();
	
		System.out.println("Informe o lado do quadrado");
		q.lado=Double.parseDouble(System.console().readLine());
	
		System.out.println("Area do quadrado = " + q.areaQuadrado());
		System.out.println("Perimetro do quadrado = " + q.perimetroQuadrado());
		System.out.println("Diagonal do quadrado = " + q.diagonalQuadrado());
	}
	
}