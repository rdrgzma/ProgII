/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Márcio
 */
public class ItemNotaFiscal {
    private int item;
    private String descricao;
    private int quantItem;
    private double preco;

    public int getItem() {
	return item;
    }

    public void setItem(int item) {
	this.item = item;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    public int getQuantItem() {
	return quantItem;
    }

    public void setQuantItem(int quantItem) {
	this.quantItem = quantItem;
    }

    public double getPreco() {
	return preco;
    }

    public void setPreco(double preco) {
	this.preco = preco;
    }

    public ItemNotaFiscal(int item, String descricao, int quantItem, double preco) {
	this.item = item;
	this.descricao = descricao;
	this.quantItem = quantItem;
	this.preco = preco;
    }
    public ItemNotaFiscal() {
	this(0,"",0,0);
    }
    public double valorTotal(){
	return preco*quantItem;
    }
    public double valorDescontado(double percentual){
	return valorTotal()*(1-(percentual)/100);
    }
}
