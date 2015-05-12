public class Exercicio02{
	
	public static void main(String [] args){
		
		Proprietario prop1 = new Proprietario();
		prop1.nome = "joao";
		prop1.endereco = "Avenida Edgar Pires de Castro";
		prop1.sexo = "Masculino";
		prop1.cpf= 123456;
		prop1.numeroCarteira = 100000001;
		
		Proprietario prop2 = new Proprietario();
		prop2.nome = "Maria";
		prop2.endereco = "ARua da Praia";
		prop2.sexo = "Feminino";
		prop2.cpf= 22223333;
		prop2.numeroCarteira = 2340000;
		
		Veiculo veic1 = new Veiculo();
		veic1.numeroPlaca = 7788;
		veic1.modelo ="Fusca";
		veic1.proprietario= prop1;
		veic1.cor = "Vermelho";
		
		Veiculo veic2 = new Veiculo();
		veic2.numeroPlaca = 7444;
		veic2.modelo ="Fox";
		veic2.proprietario= prop2;
		veic2.cor = "Preto";
		
		Veiculo veic3 = new Veiculo();
		veic3.numeroPlaca = 3223;
		veic3.modelo ="Gol";
		veic3.proprietario= prop2;
		veic3.cor = "Branco";
		
		veic1.mostraVeiculo();
		veic2.mostraVeiculo();
		veic3.mostraVeiculo();
		
		
	}
}