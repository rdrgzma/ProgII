public class Veiculo{
	
	int numeroPlaca;
	String modelo, cor;
	Proprietario proprietario;
	
		
	void  mostraVeiculo(){
		
	System.out.println();	
	proprietario.mostraProprietario();
	System.out.println("---Dados do Veiculo---");
	System.out.println("Numero Placa: "+numeroPlaca);
	System.out.println("Modelo: "+modelo);
	System.out.println("Cor: "+cor);
	System.out.println();
	
	}


}