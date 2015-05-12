public class Exercicio04 {
	public static void main (String [] args)
	
	{
		int i;
		String nome;
		double produto, qntProduto, preco,faturamento;
		faturamento=0;
		System.out.println("Informe a quantidade de Produtos a venda: "); 
		produto=Integer.parseInt(System.console().readLine());
	
		for(i=1;i<=produto;i++){
	
			System.out.println("Informe o nome do Produto vendido: ");
			nome=System.console().readLine();
			
			System.out.println("Informe a quantidade de Produtos vendidos: "); 
			qntProduto=Double.parseDouble(System.console().readLine());
	
			System.out.println("Informe o PRECO do PRODUTO: "); 
			preco=Double.parseDouble(System.console().readLine());
	
			faturamento+=qntProduto*preco;
		}
			
		System.out.printf(" O Faturamento e R$%.2f",faturamento);
	
	}
	
}