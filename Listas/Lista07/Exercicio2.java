//import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args){
	//	Scanner entrada = new Scanner(System.in);
		Aluno [] alunos = new Aluno[4];
		boolean aux = true;
		
		alunos[0]= new Aluno("Joao",111,10.0,10.0);
		alunos[1]= new Aluno("Maria",112,9.0,10);
		alunos[2]= new Aluno("Jose",113,0.5,1.0);
		alunos[3]= new Aluno("Mario",114,7.0,7.0);
		
		System.out.println("--- Informe o numero de matricula do aluno---");
		//int mat = Integer.parseInteger (entrada.nextInt());
		int mat = Integer.parseInt(System.console().readLine());
		for (int i=0; i < alunos.length; i++){
			 if(alunos[i].matriculaAluno == mat){
				alunos[i].mostrar();
				aux=false;
				
			} 
			
		}
		if(aux){
			System.out.println("Aluno nao encontrado");
		}
	}
}
	