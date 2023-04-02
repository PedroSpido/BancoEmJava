package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa um cliente do Bytebank
 * @author Pedro Spido
 *
 */
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cep;
	private String cpf;
	private String endereco;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
}
