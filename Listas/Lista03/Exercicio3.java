public class Exercicio3{
	public static void main (String[] args){
		String palavra,aux;
		boolean consoante=true;
		int i;
		System.out.println("Digite a palavra: ");
		palavra = System.console().readLine();
		i=palavra.length();
		aux = palavra.substring(0,i-1);
		
		if(aux.endsWith("a")|| aux.endsWith("e")|| aux.endsWith("i")|| aux.endsWith("u")){
			consoante=false;
		} ;
		//System.out.println(i);
		//System.out.printf("%s"+"  aux",aux);
		//System.out.println(consoante);
		
		if(palavra.endsWith("o") || palavra.endsWith("ch")|| palavra.endsWith("sh")|| palavra.endsWith("ss")|| palavra.endsWith("x")|| palavra.endsWith("z")){
			System.out.printf("%s"+"es",palavra);
		} else if(palavra.endsWith("y") && (consoante==true)){
			System.out.printf("%s"+"ies",aux);
		}else{
			System.out.printf("%s"+"s",palavra);
		};
		
	}
}