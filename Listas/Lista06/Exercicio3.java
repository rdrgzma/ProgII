import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetA, vetB;
		int cont;
		int tam=20;
		vetA = new int[tam];
		vetB = new int[tam];
		

		System.out.println("--- Informe os valores do vetor A ---");
		for(cont = 0; cont < vetA.length; cont++) {
			System.out.print("vetA[" + cont + "]: ");
			vetA[cont] = entrada.nextInt();
		}
		vetB[0]=vetA[0];
		vetB[1]=vetA[1]; // não considerei as posições 0 e 1 dos vetores como pares ou ímpares
		for(cont = 2; cont < vetB.length; cont++) {
			
			if(cont%2==0){
			vetB[cont] = 2*vetA[cont];
			}else{
				vetB[cont]=3*vetA[cont];
			}
		}
		for(cont = 0; cont < vetB.length; cont++) {
			System.out.printf("vetB[%d] = %d\n ",cont,vetB[cont]);
		}
	
	}
	
}