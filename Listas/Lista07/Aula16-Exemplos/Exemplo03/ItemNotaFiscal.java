public class ItemNotaFiscal {
	String descricao;
	double precoUnit;
	int quantidade;
	double aliquota;
	
	double valorTotal() {
		return precoUnit * quantidade;
	}
	
	double icms() {
		return aliquota * valorTotal();
	}
	
	void mostrar(int numItem) {
		System.out.println("ITEM " + numItem);
		System.out.println("Descrição..: " + descricao);
		System.out.printf("Preço Unit.: R$ %.2f\n", precoUnit);
		System.out.println("Quantidade.: " + quantidade);
		System.out.printf("Valor Total: R$ %.2f\n", valorTotal());
		System.out.printf("ICMS.......: R$ %.2f\n", icms()); 
	}
}