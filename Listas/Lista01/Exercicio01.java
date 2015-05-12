public class Exercicio01{
	public static void main(String[] args){
		double a,b,c, determinante;
		System.out.println("Digite o valor do primeiro coeficiente");
		a=Double.parseDouble( System.console().readLine());
		System.out.println("Digite o valor do segundo coeficiente");
		b=Double.parseDouble( System.console().readLine());
		System.out.println("Digite o valor do terceiro coeficiente");
		c=Double.parseDouble( System.console().readLine());
		determinante=b*b-4*a*c;
		if(determinante==0){
			System.out.printf("A equacao possui uma unica raiz real");
		}
		if(determinante>0){
			System.out.printf("A equacao possui duas raizes reais");
		}
		
		if(determinante<0){
			System.out.printf("A equacao nao possui raiz real");
		}
	}
}