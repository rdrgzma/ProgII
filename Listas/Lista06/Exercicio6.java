import java.util.Scanner;
public class Exercicio6{
	public static void main(String [] args){
		
		Scanner entrada = new Scanner (System.in);
		int matA[][] = new int [4][3];
		int matAt[][] = new int [3][4];
		int i,j;
		
		System.out.println("--- Informe os dados da matriz A ---");
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 3; j++) {
				System.out.printf("matA[%d][%d]: ", i, j);
				matA[i][j] = entrada.nextInt();
			}
		}
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 3; j++) {
				matAt[j][i]=matA[i][j];
				
			}
		}
		
		System.out.println("--- Matriz transposta da matriz A ---");
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				System.out.printf("matAt[%d][%d]: %d \n", i, j, matAt[i][j]);
			}
		}
	}
}