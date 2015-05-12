public class TestaSemaforo {
	public static void main(String[] args) {
		Semaforo sinaleira = new Semaforo(); // Cria objeto da classe. Estado inicial: VERMELHO.
		
		System.out.println(sinaleira.geraString());
		sinaleira.proximoEstado(); // Muda para AMARELO.
		System.out.println(sinaleira.geraString());
		sinaleira.proximoEstado(); // Muda para VERDE.
		System.out.println(sinaleira.geraString());
		sinaleira.proximoEstado(); // Muda para VERMELHO.
		System.out.println(sinaleira.geraString());
		sinaleira.proximoEstado(); // Muda para AMARELO.
		System.out.println(sinaleira.geraString());
		sinaleira.proximoEstado(); // Muda para VERDE.
		System.out.println(sinaleira.geraString());
		
		// Forçando estado indesejável...
		sinaleira.estadoAtual = -123; // Esta linha agora causa um erro de compilação.
		sinaleira.proximoEstado();
		System.out.println(sinaleira.geraString());
	}
}
