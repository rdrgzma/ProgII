public class NotaFiscal{
	ItemNotaFiscal item1 = new ItemNotaFiscal();
	ItemNotaFiscal item2 = new ItemNotaFiscal();
	ItemNotaFiscal item3 = new ItemNotaFiscal();
	
	double calculaTotalNota(){
		return item1.calculaTotal()+item2.calculaTotal()+item3.calculaTotal();
	}
	
	void mostraNota(){
		System.out.println("NOTA FISCAL");
		item1.mostraItem(1);
		item2.mostraItem(2);
		item3.mostraItem(3);
		System.out.printf("TOTALr= R$ "+calculaTotalNota());
	}
}