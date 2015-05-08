package trabalho1;
import java.util.ArrayList;

public class ListagemDeLivros {
	private Livro[] livros;
	
	public ListagemDeLivros() {
		livros = new Livro[]{
			new Livro(1, "Java como Programar", new Autor[]{new Autor("Deitel", "Paul"), new Autor("Deitel", "Harvey")}, 2010, "Pearson", new String[]{"Java", "Programacao"}),
			new Livro(2, "A Revolução dos Bichos", new Autor[]{new Autor("Orwell", "George")}, 1982, "Globo", new String[]{"Literatura Estrangeira", "Fabula"}),
			new Livro(3, "Core Java", new Autor[]{new Autor("Horstmann", "Cay"), new Autor("Cornell", "Gary")}, 2010, "Pearson", new String[]{"Java", "Programacao"}),
			new Livro(4, "1984", new Autor[]{new Autor("Orwell", "George")}, 2009, "Companhia das Letras", new String[]{"Literatura Estrangeira"}),
			new Livro(5, "Fundamentos Matematicos para a Ciencia da Computacao", new Autor[]{new Autor("Gersting", "Judith")}, 2013, "LTC", new String[]{"Matematica"}),
			new Livro(6, "Desenvolvendo Websites com PHP", new Autor[]{new Autor("Niederauer", "Juliano")}, 2004, "Novatec", new String[]{"PHP", "Programacao"}),
			new Livro(7, "Dom Casmurro", new Autor[]{new Autor("Assis", "Machado de")}, 1997, "L&PM Pocket", new String[]{"Literatura Brasileira"}),
			new Livro(8, "Biologia - Volume Único", new Autor[]{new Autor("Laurence", "J.")}, 2005, "Nova Geracao", new String[]{"Biologia", "Livro Didatico"})
		};
	}
	
	public Livro[] consultaPorTitulo(String titulo) {
		ArrayList<Livro> result = new ArrayList<Livro>();
		for(int i = 0; i < livros.length; i++) {
			if(livros[i].getTitulo().contains(titulo))
				result.add(livros[i]);
		}
		return (Livro[]) result.toArray(new Livro[0]);
	}
	
	public Livro[] consultaPorAssunto(String assunto) {
		ArrayList<Livro> result = new ArrayList<Livro>();
		for(int i = 0; i < livros.length; i++) {
		   for (int j=0; j<livros[i].getAssunto().length;j++)
			if( livros[i].getAssunto()[j].contains(assunto))				    
			    result.add(livros[i]);
		}
		return (Livro[]) result.toArray(new Livro[0]);
	}
	public Livro[] consultaPorAutor(String autor) {
		ArrayList<Livro> result = new ArrayList<Livro>();
		for(int i = 0; i < livros.length; i++) {
		   for (int j=0; j<livros[i].getAutor().length;j++)
			if( livros[i].getAutor()[j].getSobrenome().contains(autor))				    
			    result.add(livros[i]);
		}
		return (Livro[]) result.toArray(new Livro[0]);
	}
}