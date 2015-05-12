public class Exemplo04 {
	public static void main(String[] args) {
		// Abaixo está sendo criado o vetor de objetos. Cada uma das posições deste vetor conterá
		// inicialmente o valor null, ou seja, os objetos para cada posição não serão criados neste
		// momento. Será necessário mais adiante colocar objetos em cada uma das posições do vetor.
		Emprestimo[] emprestimos = new Emprestimo[4];
		
		emprestimos[0] = new Emprestimo("Java, como Programar", "Fulano da Silva", 0);
		emprestimos[1] = new Emprestimo("Core Java", "Maria das Neves", 0);
		emprestimos[2] = new Emprestimo("Lógica de Programação", "Ciclano Seilayevski", 5);
		emprestimos[3] = new Emprestimo("Estatística", "João da Silva Sauro", 2);

		for(int i = 0; i < emprestimos.length; i++) {
			if(emprestimos[i].diasAtraso > 0) {
				System.out.println(emprestimos[i].nome + " - " + emprestimos[i].diasAtraso + " dias em atraso");
			}
		}
	}
}