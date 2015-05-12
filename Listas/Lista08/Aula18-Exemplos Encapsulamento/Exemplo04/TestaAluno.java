public class TestaAluno {
	public static void main(String[] args) {
		Aluno a = new Aluno(1234, "Fulano da Silva");
		
		// Mostra dados do aluno.
		System.out.println("--- DADOS ORIGINAIS DO ALUNO ---");
		System.out.println("Matrícula: " + a.getMatricula());
		System.out.println("Nome: " + a.getNome());
		
		// Tenta modificar o número de matrícula do aluno para -1
		System.out.println("\nTentando alterar número de matrícula...");
		if(a.setMatricula(-1))
			System.out.println("Número de matrícula alterado com sucesso!");
		else
			System.out.println("Ops! Número de matrícula inválido!");
		
		System.out.println("\n--- DADOS DO ALUNO APOS TENTATIVA DE ALTERACAO DE MATRICULA ---");
		System.out.println("Matrícula: " + a.getMatricula());
		System.out.println("Nome: " + a.getNome());
		
		// Altera nome do aluno
		a.setNome("Fulano de Tal da Silva");
		
		System.out.println("\n--- DADOS DO ALUNO APOS TENTATIVA DE ALTERACAO DE NOME ---");
		System.out.println("Matrícula: " + a.getMatricula());
		System.out.println("Nome: " + a.getNome());
	}
}