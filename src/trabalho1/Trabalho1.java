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
	Scanner entrada =new Scanner(System.in);
	
	System.out.println("Digite o termo da consulta: ");
	String consulta = entrada.nextLine();
	
	Livro [] liv = new ListagemDeLivros().consultaPorTitulo(consulta);
	 for(int i=0; i<liv.length;i++){
	     
	    System.out.println("Referencia: "+liv[i].consultaReferencia());
	     
	    System.out.println("Editora: "+liv[i].getEditora().toUpperCase());
	    
	    System.out.print("Assunto: ");
	    for(int j=0; j<liv[i].getAssunto().length;j++){
	   
	    System.out.print(liv[i].getAssunto()[j]+" ");
	    }
	    
	    System.out.println();
	    System.out.print("Autor: ");
	    for(int k=0;k<liv[i].getAutor().length;k++){
		
	    System.out.print(liv[i].getAutor()[k].getSobrenome()+","+liv[i].getAutor()[k].getNome()+".");
	    }
	    System.out.print(liv[i].getEditora().toUpperCase()+"."+liv[i].getAno());
	    
	    
	    System.out.println();  
	}
	
    }   
}
