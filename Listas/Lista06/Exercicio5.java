public class Exercicio5 {

	public static void main(String[] args) {

		char [][] matA;
		int k=0;
		int tam = 8;

		matA = new char [tam][tam];
		
		for(int i=0;i<tam;i++){
            for (int j=0;j<tam;j++){
				if((i+j)%2==0 && i<3){
					matA[i][j]= 'B';	
				}
				if((i+j)%2==0 && i>4){
					matA[i][j]= 'P';
				}
                System.out.printf("|%c|",matA[i][j]);
			}
			System.out.println();
		}
	}
}