public class Emprestimo {
	String titulo;
	String nome;
	int diasAtraso;
	
	Emprestimo(String titulo, String nome, int diasAtraso) {
		this.titulo = titulo;
		this.nome = nome;
		this.diasAtraso = diasAtraso;
	}
	
	double multa() {
		return 0.50 * diasAtraso;
	}
}







