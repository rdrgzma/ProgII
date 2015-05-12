public class Exercicio03{
	public static void main (String [] args)
	{
	double x, result;
	System.out.println("Digite um valor: "); 
	x=Double.parseDouble(System.console().readLine());
	if (x!=0){
		result=x*x-5*x+6;
		System.out.println(" O Valor da funcao F(x) e :");
		System.out.println(result); 
		} 
		else {
		System.out.println("O Valor digitado e zero"); 
		System.exit(0);
		}
	}
}