package Model;

/**
 * Classe abstrata que armazena e exclui os dados referentes a telefone
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public abstract class Telefone {
	
	
	//atributos
	
	private int ddd, numero;
	/**
	 * Exclui os dados de telefone, salvando todos em 0
	 */
	public void excluir() {
		setNumero(0);
		setDDD(0);
	}
	
	//metodos especiais
	/**
	 * Metodo construtor de telefone
	 * @param ddd int referente ao DDD do telefone
	 * @param numero int com o numero do telefone
	 */
	public Telefone(int ddd, int numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	//gets e sets
	public int getDDD() {
		return ddd;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setDDD(int ddd) {
		this.ddd = ddd;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

}
