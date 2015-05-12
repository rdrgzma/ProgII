public class ExemploData {
	public static void main(String[] args) {
		Data d = new Data();
		
		System.out.print("Informe o dia: ");
		d.dia = Integer.parseInt(System.console().readLine());
		
		System.out.print("Informe o mes: ");
		d.mes = Integer.parseInt(System.console().readLine());
		
		System.out.print("Informe o ano: ");
		d.ano = Integer.parseInt(System.console().readLine());
		
		System.out.printf("Data digitada = %02d/%02d/%04d\n", d.dia, d.mes, d.ano);
	}
}