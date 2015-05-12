public class ItemNotaFiscal{
	String descricao;
	double preco, aliquota;
	int quantidade, numeroItem;
	
	double calculaTotal(){
		return preco*quantidade;
	}
	double calculaICMS( aliquota){
		return aliquota*preco;
	}
	void mostraItem(numeroItem){
		System.out.printf("ITEM "+numeroItem);
		System.out.printf("-Descricao: "+descricao);
		System.out.printf("-Preco Unit.: R$"+preco);
		System.out.printf("-Quantidade: "+quantidade);
		System.out.printf("-Valor total: R$"+calculaTotal());
		System.out.printf("--ICMS: R$"+calculaICMS());
	}
}