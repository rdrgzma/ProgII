public class Aluno3{
	int matriculaAluno;
	String nomeAluno;
	double [] notasProvas;
	double [] notasTrabalhos;
	 
	
	Aluno3(String nomeAluno, int matriculaAluno){
		this.nomeAluno=nomeAluno;
		this.matriculaAluno=matriculaAluno;
		
	}
	void adicionaNotaProvas(int quantProvas){
		notasProvas=new double [quantProvas];
		for(int i = 0; i< notasProvas.length; i++){
		System.out.printf("--- A nota da prova %d--- \n", i+1);
		notasProvas[i] = Double.parseDouble(System.console().readLine());
	}
	}
	void adicionaNotaTrabalhos( int quantTrabalhos){
		notasTrabalhos = new double [quantTrabalhos];
		for(int i =0; i<notasTrabalhos.length; i++){
		System.out.printf("--- A nota do Trabalho %d--- \n", i+1);
		notasTrabalhos[i] = Double.parseDouble(System.console().readLine());
	}
	}
	
	public double mediaProvas(){

		double soma =0;
		for(int i=0; i<notasProvas.length; i++ ){
		    soma+= notasProvas[i];
			
		}
	return soma/notasProvas.length;
		
	}

	
	public double mediaTrabalhos(){
		double soma =0;
		for(int i=0; i<notasTrabalhos.length; i++ ){
			
		soma+= notasTrabalhos[i];
			
		}
		return soma/notasTrabalhos.length;
		
	}
	
	public double media(){
		return (mediaProvas()*6+mediaTrabalhos()*4)/10.0;
	}
	
	

}