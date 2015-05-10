/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;
/**
 *
 * @author Márcio
 */
public class TagHTML {
    private String nome;
    private String id;
    private String conteudo;
    private boolean possuiFechamento;

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getConteudo() {
	return conteudo;
    }

    public void setConteudo(String conteudo) {
	this.conteudo = conteudo;
    }

    public void setPossuiFechamento(boolean possuiFechamento) {
	this.possuiFechamento = possuiFechamento;
    }

    public TagHTML(String nome, String id, String conteudo, boolean possuiFechamento) {
	this.nome = nome;
	this.id = id;
	this.conteudo = conteudo;
	this.possuiFechamento = possuiFechamento;
    }

    public TagHTML(String nome) {
	this(nome,"","",false);
    }
    public String geraTexto(boolean maiuscula){ // COMENTARIO LEONARDO: O método deveria receber apenas um parâmetro. O conteúdo a ser exibido é o armazenado no atributo "conteudo".
	String aux ="";
	if(!this.id.equals("") && maiuscula ){ // COMENTARIO LEONARDO: Cuidado aqui! Não usar contains mas equals para verificar se o conteúdo é "".
	    

		aux="<"+this.nome.toUpperCase()+" ID='"+this.id+"'"+">"+this.conteudo+"</"+this.nome.toUpperCase()+">";
	    
		if(!this.possuiFechamento){
                    aux="<"+this.nome.toUpperCase()+" ID='"+this.id+">"+this.conteudo;
	    
	}
        }
            if(!this.id.equals("")&& !maiuscula){
                if(this.possuiFechamento){
		aux= "<"+this.nome+"id= '"+this.id+"'"+">"+this.conteudo+"</"+this.nome+">";
	    } 
		aux= "<"+this.nome+" id='"+this.id+">"+this.conteudo;             
		
    }
            if(this.id.equals("")){
                if(maiuscula){
             if(this.possuiFechamento){
	    	aux= "<"+this.nome.toUpperCase()+">"+this.conteudo+"</"+this.nome.toUpperCase()+">";
             }
                aux= "<"+this.nome.toUpperCase()+">";  
            }else{
                    if(this.possuiFechamento){
	    	aux= "<"+this.nome+">"+this.conteudo+"</"+this.nome+">";
             }
                aux= "<"+this.nome+">";  
                }
            }
   return aux;    
} 
    }



       
	
    


