/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.util.Scanner;

/**
 *
 * @author Márcio
 */
public class Prova1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Informe o tamanho do vetor de Tags: ");
	int  tam = entrada.nextInt();
	TagHTML [] tag =new TagHTML[tam] ;
	for (int i=0;i<tam;i++){
	  tag[i] = new TagHTML("span");  
	}
	System.out.println("Escolha uma posicao do vetor de tags: ");
	int  pos = entrada.nextInt();
        
	while(pos>=0 && pos<tag.length){
	System.out.println("Escolha o nome da tag: ");
	tag[pos].setNome(entrada.next());
	System.out.println("Escolha a id da tag");
	tag[pos].setId(entrada.next());
	
	System.out.println("Escolha o conteudo da tag");
	tag[pos].setConteudo(entrada.next()); 
        
        System.out.println("A tag possui fechamento? S - SIM ou N - NAO");
        String str = entrada.next();
        if(str.equals("S")){
	tag[pos].setPossuiFechamento(true);}
        else if(str.equals("N")){
            tag[pos].setPossuiFechamento(false);
        }
        
        System.out.println("Escolha uma posicao do vetor de tags: ");
	pos = entrada.nextInt();
    }
        
        for(int i=0;i<tag.length;i++){
            System.out.println(tag[i].geraTexto(true));
        }
    }
    
}
