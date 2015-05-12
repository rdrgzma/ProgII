public class Aluno{
	int matriculaAluno;
	String nomeAluno;
	double nota1, nota2;
		
	public double media(){
		
		return (nota1+nota2)/2.0;
		
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
}