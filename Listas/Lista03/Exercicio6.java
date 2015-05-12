import java.util.Scanner;
public class Exercicio6{
	public static void main(String[] args){
		double a,b,c, determinante;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro coeficiente");
		a = sc.nextDouble();
		System.out.println("Digite o valor do segundo coeficiente");
		b = sc.nextDouble();
		System.out.println("Digite o valor do terceiro coeficiente");
		c = sc.nextDouble();
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