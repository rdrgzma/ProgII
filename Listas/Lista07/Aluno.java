public class Aluno{
	int matriculaAluno;
	String nomeAluno;
	double nota1, nota2;
	
	Aluno(String nomeAluno, int matriculaAluno, double nota1, double nota2 ){
		this.nomeAluno=nomeAluno;
		this.matriculaAluno=matriculaAluno;
		this.nota1=nota1;
		this.nota2=nota2;
	}
		
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
	void mostrar(){
		System.out.println("Dados do aluno");
		System.out.printf("Nome: %s\n",nomeAluno);
		System.out.printf("Matricula: %d\n",matriculaAluno);
		System.out.printf("Nota 1: %.1f\n",nota1);
		System.out.printf("Nota 2: %.1f\n",nota2);
		System.out.printf("Media: %.1f\n",media());
		if(aprovado()){
			System.out.println("Aluno Aprovado");
		} else {
			System.out.printf("O aluno %s necessita de nota = %.1f no exame final \n",nomeAluno, quantoPrecisa());

		} 
	}
}