public class Semaforo {
	private int estadoAtual = 1; // 1 representa o semáforo em VERMELHO,
								 // 2 em AMARELO e 3 em VERDE.
	
	public void proximoEstado() {
		estadoAtual++;
		if(estadoAtual > 3)
			estadoAtual = 1;
	}
	
	public String geraString() {
		switch(estadoAtual) {
			case 1: return "Vermelho: PARE!";
			case 2: return "Amarelo: ATENCAO!";
			case 3: return "Verde: SIGA EM FRENTE.";
			default: return "Estado inválido!";
		}
	}
}