public class cheque{
	double valor;
	String valorPorExtenso;
	Data data = new Data();
	String nomeEmissor;
	String nomeRecebedor;
	void mostrar(){
		System.out.println("----------------------------------------------------");
		System.out.printf("CHEQUE                         VALOR: R$"+valor");
		System.out.printf("Pago a quantia de "+ valorPorExtenso);
		System.out.printf("A "+ nomeRecebedor);
		System.out.printf("Data: "+ data.porExtenso);
		System.out.printf("                      __________________");
		System.out.printf("                     "+ nomeEmissor);
	}
}