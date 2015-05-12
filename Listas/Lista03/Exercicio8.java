import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercicio8{
	
	public static void main (String[] args) {
		
		Calendar calendario = new GregorianCalendar();
		
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int mes = calendario.get(Calendar.MONTH)+1;
		int ano = calendario.get(Calendar.YEAR);
		
		System.out.println("DATA: "+dia+"/"+mes+"/"+ano);
		
	}
}