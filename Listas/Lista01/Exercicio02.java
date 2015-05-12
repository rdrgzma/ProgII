public class Exercicio02{
	public static void main(String[] args){
		double codigo,preco;
		System.out.println("Digite o codigo do produto");
		codigo=Double.parseDouble( System.console().readLine());
		System.out.println("Digite o preco do produto");
		preco=Double.parseDouble( System.console().readLine());
		System.out.printf("O preco do produto e: R$%.2f\n",preco);
		if(codigo==1){
			System.out.printf("Este produto e procedente da regiao NORTE");
		}
		else if(codigo==2 || codigo==5 || codigo==9){
			System.out.printf("Este produto e procedente da regiao SUL");
		}
		
		else if(codigo==3 || codigo>=10 && codigo<=15){
			System.out.printf("Este produto e procedente da regiao LESTE");
		}
		else if(codigo==7 || codigo==20){
			System.out.printf("Este produto e procedente da regiao OESTE");
		}
		else if(codigo!=2 && codigo!=5 && codigo!=9 && codigo!=7 && codigo!=20 && codigo!=3 && codigo<=10 || codigo>=15){
			System.out.printf("Este produto e IMPORTADO");
		}
		
	}
}