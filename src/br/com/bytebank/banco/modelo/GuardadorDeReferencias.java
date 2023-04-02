package br.com.bytebank.banco.modelo;

import java.util.ArrayList;

public class GuardadorDeReferencias {
	
	private ArrayList<Conta> referencias;
	private int quantidade;
	
	public GuardadorDeReferencias() {
		this.referencias = new ArrayList<>();
		this.quantidade = 0;
	}
 
	public void adiciona(Conta cl) {
		this.referencias.add(cl);
		this.quantidade++; 
	}
	
	public int getQuantidadeElementos() {
		return this.quantidade;		
	}
	
	public Object getReferencia(int pos) {
		return this.referencias.get(pos);
	}
}
