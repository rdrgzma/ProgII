/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Márcio
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Informe o numero do Item \n");
	int n=entrada.nextInt();
	System.out.print("Informe a descricao do Item \n");
	String d = entrada.next();
	System.out.print("Informe a quantidade de Itens \n");
	int q=entrada.nextInt();
	System.out.print("Informe o preco do Item \n");
	double p = entrada.nextDouble();
	
	ItemNotaFiscal itemNota = new ItemNotaFiscal(n,d,q,p);
	
	System.out.printf("Numero do Item: %d \n", itemNota.getItem());
	System.out.printf("Descricao do Item: %s \n", itemNota.getDescricao());
	System.out.printf("Quantidade de Itens: %d \n", itemNota.getQuantItem());
	System.out.printf("Preco do Item: %.2f \n", itemNota.getPreco());
	System.out.printf("Valor Total: %.2f \n", itemNota.valorTotal()); 
	System.out.printf("Desconto: %.2f \n", itemNota.valorDescontado(15));  
    }

  
    
}
