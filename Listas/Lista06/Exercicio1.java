import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetA, vetB, vetC;
		int cont;
		int soma = 0;
		int tam = 10;
		vetA = new int[tam];
		vetB = new int[tam];
		vetC = new int[tam];

		System.out.println("--- Informe os valores do primeiro vetor ---");
		for(cont = 0; cont < vetA.length; cont++) {
			System.out.print("vetA[" + cont + "]: ");
			vetA[cont] = entrada.nextInt();
		}
		
		System.out.println("--- Informe os valores do segundo vetor ---");
		for(cont = 0; cont < vetB.length; cont++) {
			System.out.print("vetB[" + cont + "]: ");
			vetB[cont] = entrada.nextInt();
		}
		
		for(cont = 0; cont < vetC.length; cont++) {
			vetC[cont] = vetA[cont] * vetB[cont];
		}
		
		System.out.println("--- CALCULANDO A SOMA DOS ELEMENTOS DO TERCEIRO VETOR ---");
		for(cont = 0; cont < vetC.length; cont++) {
			soma+=vetC[cont];
			
		}
		System.out.printf("Soma = %d\n",soma);
	
	}
	
}

