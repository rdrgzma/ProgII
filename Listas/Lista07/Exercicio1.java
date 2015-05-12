import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Scanner entrada = new Scanner(System.in);
		Veiculo [] veiculos = new Veiculo[4];
		boolean aux = true;

		veiculos[0]= new Veiculo(11,"Fusca",2000, "ABC1999", 10000.00, 90000);
		veiculos[1]= new Veiculo(12,"Fiat Palio",2010, "ABC2999", 15000.00, 79000);
		veiculos[2]= new Veiculo(13,"Ford Fiesta",2014, "CAB1995", 22000.00, 10780);
		veiculos[3]= new Veiculo(14,"kombi",1980, "BBB0012", 17000.00, 108789);
		
		System.out.println("--- Informe oo codigo do veiculo ---");
		int cod = Integer.parseInt(System.console().readLine());
		for (int i=0; i < veiculos.length; i++){
			 if(veiculos[i].codigo == cod){
				veiculos[i].mostrar();
				aux = false;
			}
		}
		if(aux){
			System.out.println("Veiculo nao encontrado");
		}
	
	}
}

