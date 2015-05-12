public class Exercicio04{
	
	public static main(String [] args){
		
		Racional fracao1=new Racional();
		fracao1.numerador=2;
		fracao1.denominador=5;
		
		Racional fracao2=new Racional();
		fracao2.numerador=1;
		fracao2.denominador=3;
		
		Racional fracao3=new Racional();
		fracao3.numerador=3;
		fracao3.denominador=4;
		
		Racional mult = fracao1.multiplica(fracao2);
		
		Racional mult1 = fracao3.multiplica(fracao1);
		
		System.out.println(mult.geraString());
	}
}