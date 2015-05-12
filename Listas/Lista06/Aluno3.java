public class Aluno3{
	int matriculaAluno, quantProvas, quantTrabalhos;
	String nomeAluno;
	 double [] notasProvas;
	 double [] notasTrabalhos;
	 
	
	Aluno3(String nomeAluno, int matriculaAluno){
		this.nomeAluno=nomeAluno;
		this.matriculaAluno=matriculaAluno;
		
	}
		
	public double mediaProvas(){
		notasProvas=new double [quantProvas]
		for(int i=0; i<notasProvas.lenght; i++ ){
			double soma += notasProvas[i];
			
		}
		return soma/notasProvas.lenght;
		
	}
	
	public double mediaTrabalhos(){
		notasTrabalhos=new double [quantTrabalhos]
		for(int i=0; i<notasTrabalhos.lenght; i++ ){
			double soma += notasTrabalhos[i];
			
		}
		return soma/notasTrabalhos.lenght;
		
	}
	
	public double media(){
		return (notasProvas()*6+notasTrabalhos*4)/10.0;
	}
	
	public boolean aprovado(){
		if(media()>=7.0){
			return true;
		} else {
			return false;
		}
	}
	public double quantoPrecisa(){
		return (50.0-media()*6.0)/4.0;
		
	}
	void mostrar(){
		System.out.println("Dados do aluno");
		System.out.printf("Nome: %s\n",nomeAluno);
		System.out.printf("Matricula: %d\n",matriculaAluno);
		System.out.printf("Media: %.1f\n",media());
		
	}
}