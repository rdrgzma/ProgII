public class Exercicio08 {
	public static void main (String [] args){
		int i,p;
		p=3;
		for(i=0;i<=15;i++){
			if(i==0){
				System.out.println("1");
			}
			if(i==1){
				System.out.println("3");
			}
			if(i>1){
			p*=3;
			System.out.printf("%d\n",p);
			}
		}
	}
}