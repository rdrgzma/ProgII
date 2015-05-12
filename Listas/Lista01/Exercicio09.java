public class Exercicio09 {
	public static void main (String [] args){
		int i,N,p;
		p=1;
		System.out.println("Digite o numero que deseja calcular o fatorial:");
		N=Integer.parseInt( System.console().readLine());
		if(N==0){
			System.out.printf("0!= 1");
		}
		if(N!=0){ 
			
			for(i=1;i<=N;i++){
				p=p*i;
			}
		System.out.printf("%d!=%d\n",N,p);
		}
	}
}
