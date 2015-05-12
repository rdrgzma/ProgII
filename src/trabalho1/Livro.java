/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.util.ArrayList;

/**
 *
 * @author Márcio
 */
public class Livro {
    private int codigo;
    private String titulo;
    private Autor [] autor;
    private int ano;
    private String editora;
    private  String [] assunto;

    public Livro(int codigo, String titulo, Autor[] autor, int ano, String editora, String[] assunto) {
	this.codigo = codigo;
	this.titulo = titulo;
	this.autor = autor;
	this.ano = ano;
	this.editora = editora;
	this.assunto = assunto;
    }

    public Livro() {
    }
    

  
    public int getCodigo() {
	return codigo;
    }

    public String getTitulo() {
	return titulo;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public int getAno() {
	return ano;
    }

    public String getEditora() {
	return editora;
    }

    public String[] getAssunto() {
	return assunto;
    }
    
    public String consultaReferencia() {
    
        String ref="";
	for(int i = 0; i < autor.length; i++) {
	    
        ref +=(autor[i].getSobrenome().toUpperCase().concat(",".concat(autor[i].getNome())));
        
        if(i<autor.length-1)	
            ref+=";";
        else
            ref+=".";
	}
        return  ref+getTitulo()+"."+getEditora()+","+getAno()+".";
    }    
}

               
		


    
    
  
