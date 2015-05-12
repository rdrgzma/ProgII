import java.util.Random;
public class Exercicio4{
	
	public static void main (String[] args) {
		
		Random aleatorio = new Random();
		int numero, numeroUsuario;
		numero=aleatorio.nextInt(1000)+1;
		System.out.println(numero);
		System.out.println("Digite um numero:");
		numeroUsuario = Integer.parseInt( System.console().readLine());
		while (numero!=numeroUsuario){
			if(numero>numeroUsuario){
				System.out.println("O numero sorteado e maior.");
				System.out.println("Digite um numero:");
				numeroUsuario = Integer.parseInt( System.console().readLine());
			}
			if(numero<numeroUsuario){
				System.out.println("O numero sorteado e menor.");
				System.out.println("Digite um numero:");
				numeroUsuario = Integer.parseInt( System.console().readLine());
			}
		}
		if(numero==numeroUsuario){
			System.out.println("Voce acertou");
			
		}
	}
}