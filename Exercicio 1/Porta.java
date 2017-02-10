package com.iniciantes.java.tutorial;

public class Porta{

	private boolean fechada;

	//Se retornar true é pq ta fechada, se false ta aberta
	public boolean isFechada(){
		return this.fechada;
	}

	public void setIsFechada(boolean fechada){
		this.fechada = fechada;
	}
	
	public String getStatusPorta(){
		if(isFechada()){
			return "Fechada";
		}else{
			return "Aberta";
		}
	}

}