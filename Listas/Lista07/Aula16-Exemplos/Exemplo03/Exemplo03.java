public class Exemplo03 {
	public static void main(String[] args) {
		NotaFiscal nota = new NotaFiscal();
		
		System.out.print("Numero de itens da nota: ");
		int nroItens = Integer.parseInt(System.console().readLine());
		
		System.out.print("\nAliquota do ICMS: ");
		double aliquotaICMS = Double.parseDouble(System.console().readLine());
		
		nota.itens = new ItemNotaFiscal[nroItens];
		for(int i = 0; i < nroItens; i++) {
			System.out.printf("--- Item %d ---\n", i+1);
			nota.itens[i] = new ItemNotaFiscal();
			System.out.print("Descricao..: ");
			nota.itens[i].descricao = System.console().readLine();
			System.out.print("Preco Unit.: ");
			nota.itens[i].precoUnit = Double.parseDouble(System.console().readLine());
			System.out.print("Quantidade.: ");
			nota.itens[i].quantidade = Integer.parseInt(System.console().readLine());
			nota.itens[i].aliquota = aliquotaICMS;
		}
		
		System.out.println();
		nota.mostrar();
	}
}