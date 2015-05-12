/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.util.Scanner;

/**
 *
 * @author Márcio
 */
public class Trabalho1 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        System.out.println("digite o codigo do livro:");
        codigo(entrada.nextInt());
        	System.out.println("Digite o termo da consulta: ");
	String consulta = entrada.nextLine();
        Livro [] liv = new ListagemDeLivros().consultaPorTitulo(consulta);
	for(int i=0; i<liv.length;i++){
	    System.out.println();
	    System.out.println("Referencia: "+liv[i].consultaReferencia()); // consulta referencia
	     
	    System.out.println("Editora: "+liv[i].getEditora().toUpperCase()); // mostra editora
	    if(liv[i].getAssunto().length>1) // inicio consulta assunto
                System.out.print("Assuntos: ");
            else
                System.out.print("Assunto: ");
            //consulta assunto
	    for(int j=0; j<liv[i].getAssunto().length;j++){
	       System.out.print(liv[i].getAssunto()[j]+" ");
	    }
	    System.out.println();
            // fim consulta assunto
            if(liv[i].getAutor().length>1) //inicio consulta autor
	        System.out.print("Autores: ");
            else
                System.out.print("Autor: ");
            
	    for(int k=0;k<liv[i].getAutor().length;k++){
		
                System.out.print(liv[i].getAutor()[k].getSobrenome()+","+liv[i].getAutor()[k].getNome());
                if(k<liv[i].getAutor().length-1)
                    System.out.print(";");
            } // fim consulta autor
	    System.out.println();  
	}
    } 
    public void codigo(int cod){
        Livro  livro = new ListagemDeLivros().consultaPorCodigo(cod);
        if( livro != null){
            System.out.println(livro.getTitulo());
            if(livro.getAutor().length>1) //inicio consulta autor
                System.out.print("Autores: ");
            else
                System.out.print("Autor: ");
            for(int k=0;k<livro.getAutor().length;k++){
                System.out.print(livro.getAutor()[k].getSobrenome()+","+livro.getAutor()[k].getNome());
                if(k<livro.getAutor().length-1)
                    System.out.print(";");
                }
            }
        else
            System.out.println("Livro nao encontrado");
    }
                

}
