public class Exercicio01{
	public static void main(String[]args){
		Cheque ch=new cheque();
		
		System.out.print("Valor do cheque");
		ch.valor=Double.parseDouble(Systen.console().readline());
		
		System.out.print("Valor por extenso");
		ch.valorPorExtenso=Systen.console().readline();
		
		System.out.println("---Data do cheque ---");
		System.out.print("Dia");
		ch.data.dia=Integer.parseInt(System.console().readline());
		System.out.print("Mes");
		ch.data.mes=Integer.parseInt(System.console().readline());
		System.out.print("Ano");
		ch.data.ano=Integer.parseInt(System.console().readline());
		
		System.out.print("Nome do Emissor: ");
		ch.nomeEmissor=Systen.console().readline();
		
		System.out.print("Nome do Recebedor: ");
		ch.nomeRecebedor=Systen.console().readline();
		
		System.out.print();
		ch.mostrar();
		
	}
}