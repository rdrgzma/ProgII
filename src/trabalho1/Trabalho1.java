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
        int controle =1;
        while(controle==1){
            System.out.println();
            System.out.println("Digite 1: Para realizar consulta por codigo do livro.");
            System.out.println("Digite 2: Para realizar consulta por titulo do livro.");
            System.out.println("Digite 3: Para realizar consulta por assunto do livro.");
            System.out.println("Digite 4: Para realizar consulta por Sobrenome do autor do livro.");
            System.out.println("Digite qualquer outro valor para sair do sistema.");
            System.out.println();
            System.out.println("Digite o numero do tipo de consulta desejada: ");
            int comando = entrada.nextInt();
                switch (comando){
                    default:
                        System.out.println("Voce saiu do sistema.");
                        controle=0;
                        break;
                    case 1:
                        System.out.println("Digite o codigo do livro: ");
                        Livro livro = new ListagemDeLivros().consultaPorCodigo(entrada.nextInt());
                        System.out.println("-----Resultado da pesquisa-----");
                        System.out.println();
                        if( livro != null){
                            System.out.println("1 resultado encontrado:");
                            System.out.println("Titulo: "+livro.getTitulo());
                            System.out.println("Referencia: "+livro.consultaReferencia());
                            System.out.println();
                        }
                        else
                            System.out.println("Livro nao encontrado");
                        System.out.println();
                        System.out.println("--------Fim da pesquisa--------");
                        break;
                    case 2:
                        System.out.println("Digite o titulo do livro: ");
                        Livro [] livros2 = new ListagemDeLivros().consultaPorTitulo(entrada.next());
                        System.out.println("-----Resultado da pesquisa-----");
                        System.out.println();
                        if(livros2.length>0){
                            if(livros2.length==1){
                                System.out.println("1 resultado encontrado:");
                            }
                            else
                                System.out.println(livros2.length+" resultados encontrados:");
                            for(int i=0;i<livros2.length;i++){
                                System.out.println("Codigo: "+livros2[i].getCodigo());
                                System.out.println("Titulo: "+livros2[i].getTitulo());
                                System.out.println();
                            }
                        }
                        else
                            System.out.println("Livro nao encontrado.");
                        System.out.println();
                        System.out.println("-----Resultado da pesquisa-----");
                        break;
                    case 3:
                        System.out.println("digite o assunto desejado: ");
                        Livro [] livros3 = new ListagemDeLivros().consultaPorAssunto(entrada.next());
                        System.out.println("-----Resultado da pesquisa-----");
                        System.out.println();
                        if(livros3.length>0){
                            if(livros3.length==1){
                                System.out.println("1 resultado encontrado:");
                            }
                            else
                                System.out.println(livros3.length+" resultados encontrados:");
                            for(int i=0;i<livros3.length;i++){
                                System.out.println("Codigo: "+livros3[i].getCodigo());
                                System.out.println("Titulo: "+livros3[i].getTitulo());
                                System.out.println();
                            }
                        }
                        else
                            System.out.println("Livro nao encontrado.");
                        System.out.println();
                        System.out.println("-----Resultado da pesquisa-----");
                        break;
                    case 4:
                        System.out.println("Digite o sobrenome do autor desejado: ");
                        Livro [] livros4 = new ListagemDeLivros().consultaPorAutor(entrada.next());
                        System.out.println("-----Resultado da pesquisa-----");
                        System.out.println();
                        if(livros4.length>0){
                            if(livros4.length==1){
                                System.out.println("1 resultado encontrado:");
                            }
                            else
                                System.out.println(livros4.length+" resultados encontrados:");
                            for(int i=0;i<livros4.length;i++){
                                System.out.println("Codigo: "+livros4[i].getCodigo());
                                System.out.println("Titulo: "+livros4[i].getTitulo());
                                System.out.println();
                            }
                        }
                        else
                            System.out.println("Livro nao encontrado.");
                        System.out.println();
                        System.out.println("-----Resultado da pesquisa-----");
                        break;

                }    
        }
       

    }
}
