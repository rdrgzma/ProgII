import java.util.Scanner;
public class Exercicio7{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra;
		char primLetra;
		String aux;
		System.out.println("Digite a palavra que deseja traduzir para Pig Latin:");
		palavra = sc.nextLine();
		primLetra = palavra.charAt(0);
		aux = palavra.substring(1);
		System.out.printf("A palavra em Pig Latin e: %s%s"+"ay",aux,primLetra);
	}
}