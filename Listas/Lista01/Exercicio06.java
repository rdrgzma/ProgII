public class Exercicio06 {
	public static void main (String [] args)
	
	{
		int i,p,res;
		System.out.println("Informe um numero: "); 
		p=Integer.parseInt(System.console().readLine());
		System.out.printf("Tabuada do %d\n",p);
		for(i=1;i<=10;i++){
			res=p*i;
			System.out.printf("%d x %d = %d\n",p,i,res);
		}
	
	}
	
}