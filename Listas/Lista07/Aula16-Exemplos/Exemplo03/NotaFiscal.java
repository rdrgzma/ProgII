public class NotaFiscal {
	ItemNotaFiscal[] itens = new ItemNotaFiscal[0];
	
	double valorTotal() {
		double soma = 0.0;
		for(int i = 0; i < itens.length; i++) {
			soma += itens[i].valorTotal();
		}
		return soma;
	}
	
	void mostrar() {
		System.out.println("----------------------------");
		System.out.println("       NOTA FISCAL");
		System.out.println("----------------------------");
		for(int i = 0; i < itens.length; i++) {
			itens[i].mostrar(i+1);
		}
		System.out.printf("TOTAL = R$ %.2f\n", valorTotal());
		System.out.println("----------------------------");
	}
}