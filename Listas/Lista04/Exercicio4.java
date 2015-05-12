public class Exercicio4{
	public static void main(String[] args){
		Aluno al=new Aluno();
		
		System.out.println("Informe o nome do aluno: ");
		al.nomeAluno = System.console().readLine();
		
		System.out.println("Informe a matricula do aluno: ");
		al.matriculaAluno = Integer.parseInt(System.console().readLine());
		
		
		System.out.println("Informe primeira nota do aluno: ");
		al.nota1 = Double.parseDouble(System.console().readLine());
		
		
		System.out.println("Informe a segunda nota do aluno: ");
		al.nota2 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Nome:"+al.nomeAluno);
		System.out.println("Matricula:"+al.matriculaAluno);
		
		if(al.aprovado()){
			System.out.println("Aluno aprovado com nota: "+al.media());
			
		}else{
			System.out.println("O aluno precisa de "+al.quantoPrecisa()+" no exame");
		}

	}
}