/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

/**
 *
 * @author Márcio
 */
public class Autor {
    private String sobrenome;
    private String nome;

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
	return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
	return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
	this.nome = nome;
    }

    public Autor(String sobrenome, String nome) {
	this.sobrenome = sobrenome;
	this.nome = nome;
    }
    
}
