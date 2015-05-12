public class Exercicio4 {

	public static void main(String[] args) {
		char [] vetA;
		char [][] matA;
		int k=0;
		vetA = new char [64];
		matA = new char [8][8];
		
		for(int cont = 1; cont < vetA.length; cont++) {
			vetA[0]= 'C';
			if(cont%8!=0 && vetA[cont-1]=='C'){
				vetA[cont] = 'E';
			}else if(cont%8==0){
				vetA[cont]=vetA[cont-1];
			}else if(cont%8!='C' && vetA[cont-1]=='E'){
				vetA[cont] = 'C';
			}
		}
		
		for(int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                matA[i][j]=vetA[k];
				k++;
				System.out.printf("| %c |",matA[i][j]);
			}
			System.out.println();
		}
	 
	}
}