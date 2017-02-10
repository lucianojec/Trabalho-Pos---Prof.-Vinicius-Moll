//Pacote onde a classe está localizada
package com.iniciantes.java.tutorial;

//Assinatura da classe
public class Pessoa {
	
	private String nome; //Nome da pessoa
	
	//Metodo Construtor
	public Pessoa(){
		nome = "Luciano";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
