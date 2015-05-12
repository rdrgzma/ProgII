import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetA; 
		int cont;
		int aux1=0;
		int aux2=1;
		System.out.printf("--- Informe a quantidade de equipes do campeonato ---\n");
		int tam = entrada.nextInt();
		vetA = new int[tam];
		System.out.printf("--- Informe a pontuacao dos %d equipes do campeonato --- \n",tam);
		for(cont = 0; cont < vetA.length; cont++) {
			int l=cont+1;
			System.out.printf("Equipe %d\n",l);
			vetA[cont] = entrada.nextInt();
		}
		for (cont=0; cont<vetA.length-1;cont++){
			if(vetA[cont]>vetA[cont+1]){
				aux1 = vetA[cont];
			}else{
				aux1=vetA[cont+1];
			}
			if(aux1==vetA[cont]){
				++aux2;
			}
		}
	System.out.printf("Pontuacao da equipe campea = %d\n",aux1 );
		
	System.out.printf("Quantidade de equipes campeas = %d\n",aux2);
	}
}