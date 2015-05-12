public class CdPlayer{
	public static void main(String[] args){
		
		CD cd = new CD();
		int comando=1;
		
		System.out.println("Informe o numero de musicas");
		cd.numeroMusica=Integer.parseInt(System.console().readLine());
		System.out.println("Entre com o comando do CD Player");
		comando=Integer.parseInt(System.console().readLine());
		
		while(comando!=0){
						if(comando==1){
								cd.play();
							} else if(comando==2){
									cd.pause();
									} else if(comando==3){
											cd.stop();
											} else if(comando==4){
													cd.avancar();
													} else if(comando==5){
															cd.retroceder();
															} else if( comando>5){
																System.out.println("Comando Invalido");
															}
		System.out.println("Musica atual: "+ cd.numeroFaixa);
		System.out.println("Entre com o comando do CD Player");
		comando=Integer.parseInt(System.console().readLine());
		}
	}
}