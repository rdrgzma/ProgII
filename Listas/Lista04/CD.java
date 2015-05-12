public class CD{
	int numeroMusica;
	int numeroFaixa;
	boolean onPlayer=false;
	
	int play (){
		if(numeroFaixa==0){
			numeroFaixa=1;
		}
		System.out.println("PLAY");
		return numeroFaixa;
		
	}
	int pause(){
		System.out.println("PAUSE");
		return numeroFaixa;
	}
	int stop(){
		System.out.println("STOP");
		return numeroFaixa=1;
		
	}
	int avancar(){
		if(numeroFaixa<numeroMusica){
			numeroFaixa+=1;
		} else{
			numeroFaixa=1;
		}
		System.out.println("AVANCAR");
		return numeroFaixa;
	}
	int retroceder(){
		if(numeroFaixa>1 && numeroFaixa<numeroMusica){
			numeroFaixa-=1;
		} else{
			numeroFaixa=1;
		}
		System.out.println("RETROCEDER");
		return numeroFaixa;
	}
}