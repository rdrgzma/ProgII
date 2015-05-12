public class Aluno {
	private int matricula;
	private String nome;
	
	// Construtores em 99% dos casos serão public.
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	// Métodos set podem retornar um valor sinalizando sucesso ou falha. Por exemplo, o número de
	// matrícula do aluno deve ser um valor positivo. Logo, se for informado um valor negativo,
	// o método não altera o atributo e retorna false, sinalizando o erro. Caso contrário, o 
	// atributo será alterado e o valor true será retornado. Existem outras formas de sinalizar
	// erros (levantando exceções, por exemplo) que veremos mais adiante.
	public boolean setMatricula(int matricula) {
		if(matricula > 0) {
			this.matricula = matricula; // Podemos usar this aqui também.
			return true;
		} else {
			return false;
		}
	}
	
	// Método GET sempre retornam um valor, já que devem retornar o valor do atributo associado.
	// O tipo de retorno deve ser o mesmo do atributo considerado.
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	// O nome do aluno pode receber qualquer valor, sem restrições. Por isso, o método SET não
	// retorna nenhum valor de sinalização e apenas faz uma atribuição.
	public void setNome(String nome) {
		this.nome = nome;
	}
}