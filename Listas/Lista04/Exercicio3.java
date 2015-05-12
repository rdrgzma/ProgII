public class Exercicio3{
	public static void main(String[]args){
		int segundosInc;
		Horario h = new Horario();
		
		System.out.println("Informe a hora: ");
		h.hora = Integer.parseInt(System.console().readLine());
		System.out.println("Informe os minutos: ");
		h.minuto = Integer.parseInt(System.console().readLine());
		System.out.println("Informe os segundos: ");
		h.segundo = Integer.parseInt(System.console().readLine());
		
		System.out.println("Informe a quantidade de segundos a ser acrescentada: ");
		segundosInc=Integer.parseInt(System.console().readLine());
		
		for ( int i=0;i<segundosInc;i++) {
			h.incSegundo();
		}
		System.out.println("Horario modificado: "+h.hora+":"+h.minuto+":"+h.segundo);
		
	}
}