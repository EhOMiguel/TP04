package Model;

import java.util.Scanner;
/**
 * Armazena os dados referente as funcoes
 * @version 0.1 (Abril 2022)
 */
public class Funcao {
	
	
	Scanner ler = new Scanner(System.in);
	
	//atributos
	
	private boolean arCondicionado, travaEletrica,
	vidroEletrico, direcaoHidraulica, airbag, abs;
	
	/**
	 * Metodo construtor de funcoes
	 * @param arCondicionado boolean, se true o carro possui ar condicionado, se false não possui 
	 * @param travaEletrica boolean, se true o carro possui trava eletrica, se false não possui 
	 * @param vidroEletrico boolean, se true o carro possui vidro eletrico, se false não possui 
	 * @param direcaoHidraulica boolean, se true o carro possui direcao hidraulica, se false não possui 
	 * @param airbag boolean, se true o carro possui airbag, se false não possui 
	 * @param abs boolean, se true o carro possui abs, se false não possui 
	 */
	public Funcao(boolean arCondicionado, boolean travaEletrica, boolean vidroEletrico, boolean direcaoHidraulica,
			boolean airbag, boolean abs) {
		
		this.arCondicionado = arCondicionado;
		this.travaEletrica = travaEletrica;
		this.vidroEletrico = vidroEletrico;
		this.direcaoHidraulica = direcaoHidraulica;
		this.airbag = airbag;
		this.abs = abs;
	}
	//gets e sets
	public boolean isArCondicionado() {
		return arCondicionado;
	}

	
	public boolean isTravaEletrica() {
		return travaEletrica;
	}

	public boolean isVidroEletrico() {
		return vidroEletrico;
	}

	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public void setTravaEletrica(boolean travaEletrica) {
		this.travaEletrica = travaEletrica;
	}

	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}

	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}
	

}
