public class Exercicio3{
	public static void main (String []args){
		
		NotaFiscal nota=new NotaFiscal();
		
		System.out.println("Informe a descricao do Item 1:");
		nota.item1.descricao=System.console().readline();
		System.out.println("Informe o preco do Item 1:");
		nota.item1.preco=Double.parseDouble(System.console().readline());
		System.out.println("Informe a quantidade do Item 1:");
		nota.item1.quantidade=Double.parseDouble(System.console().readline());
		System.out.println("Iforme a aliquota para este ITEM: ");
		nota.item1.aliquota=Double.parseDouble(System.console().readline());
		
		System.out.println("Informe a descricao do Item 2:");
		nota.item2.descricao=System.console().readline();
		System.out.println("Informe o preco do Item 2:");
		nota.item2.preco=Double.parseDouble(System.console().readline());
		System.out.println("Informe a quantidade do Item 2:");
		nota.item2.quantidade=Double.parseDouble(System.console().readline());
		System.out.println("Iforme a aliquota para este ITEM: ");
		nota.item1.aliquota=Double.parseDouble(System.console().readline());
		
		System.out.println("Informe a descricao do Item 3:");
		nota.item3.descricao=System.console().readline();
		System.out.println("Informe o preco do Item 3:");
		nota.item3.preco=Double.parseDouble(System.console().readline());
		System.out.println("Informe a quantidade do Item 3:");
		nota.item3.quantidade=Double.parseDouble(System.console().readline());
		System.out.println("Iforme a aliquota para este ITEM: ");
		nota.item1.aliquota=Double.parseDouble(System.console().readline());
		
		nota.mostraNota();
		
	}
}