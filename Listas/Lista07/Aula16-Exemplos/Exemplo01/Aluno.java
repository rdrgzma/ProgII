public class Aluno {
	int matricula;
	String nome;
	double[] notas = new double[2];
	
	double media() {
		double soma = 0.0;
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		return soma / notas.length;
	}
	
	boolean aprovado() {
		return media() >= 7;
	}
	
	double quantoPrecisa() {
		return (50 - media() * 6) / 4;
	}
}