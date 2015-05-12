public class Racional{
	int numerador;
	int denominador;
	
	Racional multiplica (Racional outraFracao){
		
		Racional resultado = new Racional();
		resultado.numerador = numerador*outraFracao.numerador;
		resultado.denominador = denominador*outraFracao.denominador;
		return resultado;
	}
	
	Racional divisao (Racional outraFracao){
		
		Racional resultado = new Racional();
		resultado.numerador = numerador*outraFracao.denominador;
		resultado.denominador = denominador*outraFracao.numerador;
		return resultado;
	}
	
	Racional soma(Racional outraFracao){
		Racional resultado = new Racional();
		int mmc= Math.max(denominador, outraFracao);
		
		while(mmc%denominador!=0 && mmc%outraFracao.denominador!=0){
			mmc++;
		}
		
		resultado.denominador = mmc / denominador*numerador+mmc /outraFracao.denominador*numerador;
		return resultado;
			
	}
	
	String garaString(){
		return numerador+" / "+denominador;
	}
}