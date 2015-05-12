public class Emprestimo {
	String titulo;
	String nome;
	int diasAtraso;
	
	double multa() {
		return 0.50 * diasAtraso;
	}
}







