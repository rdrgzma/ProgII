public class Exemplo01 {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		System.out.print("Matricula: ");
		a.matricula = Integer.parseInt(System.console().readLine());
		System.out.print("Nome: ");
		a.nome = System.console().readLine();
		
		System.out.print("Quantas notas o aluno possui? ");
		int nroNotas = Integer.parseInt(System.console().readLine());
		a.notas = new double[nroNotas];
		
		for(int i = 0; i < nroNotas; i++) {
			System.out.printf("Nota %d: ", i+1);
			a.notas[i] = Double.parseDouble(System.console().readLine());
		}
		
		System.out.printf("\nMEDIA DO ALUNO = %.1f\n", a.media());
		System.out.println("APROVADO? " + (a.aprovado() ? "Sim" : "Nao"));
		if(!a.aprovado())
			System.out.printf("PRECISA DE %.1f NO EXAME.\n", a.quantoPrecisa());
	}
}