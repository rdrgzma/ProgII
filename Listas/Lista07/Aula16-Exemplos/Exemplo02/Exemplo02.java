public class Exemplo02 {
	public static void main(String[] args) {
		// Abaixo está sendo criado o vetor de objetos. Cada uma das posições deste vetor conterá
		// inicialmente o valor null, ou seja, os objetos para cada posição não serão criados neste
		// momento. Será necessário mais adiante colocar objetos em cada uma das posições do vetor.
		Emprestimo[] emprestimos = new Emprestimo[4];
		
		emprestimos[0] = new Emprestimo();
		emprestimos[0].titulo = "Java, como Programar";
		emprestimos[0].nome = "Fulano da Silva";
		emprestimos[0].diasAtraso = 0;
		
		emprestimos[1] = new Emprestimo();
		emprestimos[1].titulo = "Core Java";
		emprestimos[1].nome = "Maria das Neves";
		emprestimos[1].diasAtraso = 0;
		
		emprestimos[2] = new Emprestimo();
		emprestimos[2].titulo = "Lógica de Programação";
		emprestimos[2].nome = "Ciclano Seilayevski";
		emprestimos[2].diasAtraso = 5;
		
		emprestimos[3] = new Emprestimo();
		emprestimos[3].titulo = "Estatística";
		emprestimos[3].nome = "João da Silva Sauro";
		emprestimos[3].diasAtraso = 2;

		for(int i = 0; i < emprestimos.length; i++) {
			if(emprestimos[i].diasAtraso > 0) {
				System.out.println(emprestimos[i].nome + " - " + emprestimos[i].diasAtraso + " dias em atraso");
			}
		}
	}
}