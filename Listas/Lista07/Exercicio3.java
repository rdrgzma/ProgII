public class Exercicio3 {
	public static void main(String[] args){
	
	
	System.out.println("--- Informe o nome do aluno---");
	String nome = System.console().readLine();
	System.out.println("--- Informe a matricula do aluno---");
	int matricula = Integer.parseInt(System.console().readLine());
	Aluno3 aluno = new Aluno3(nome,matricula);
	
	System.out.println("--- A quantidade de Provas---");
	int provas = Integer.parseInt(System.console().readLine());
	
	aluno.adicionaNotaProvas(provas);
	
	System.out.printf("--- A media das Provas = %.1f--- \n", aluno.mediaProvas());
	
	
	System.out.println("--- A quantidade de Trabalhos---");
	int trabalhos= Integer.parseInt(System.console().readLine());
	
	aluno.adicionaNotaTrabalhos(trabalhos);
	
	System.out.printf("--- A media dos Trabalhos = %.1f --- \n", aluno.mediaTrabalhos());
	
	System.out.printf("--- A media do Aluno = %.1f --- \n", aluno.media());
}
}