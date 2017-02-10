package com.iniciantes.java.tutorial;

public class Casa extends Construcao{
	
	private Pessoa proprietario;  
	private Porta portas; 
	
	public Casa(){
		setProprietario(new Pessoa()); 
		setPortas(new Porta());
		setFinalidade("Residencial");		
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

	public Porta getPortas() {
		return portas;
	}

	public void setPortas(Porta portas) {
		this.portas = portas;
	}

}
