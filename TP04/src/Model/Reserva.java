package Model;
/**
 * Armazena e exclui os numeros de cada escolha referentes a reserva do usuario
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class Reserva {
	
	
	private int numeroAgencia, numeroClasse, numeroCarro, numeroConta;
	
/**
 * Metodo construtor de reserva
 * @param numeroAgencia int com o numero da agencia que o usuario escolheu
 * @param numeroClasse int com o numero da classe do carro que o usuario escolheu
 * @param numeroCarro int com o numero do carro que o usuario escolheu
 * @param numeroConta int com o numero da conta do usuario
 */
	public Reserva(int numeroAgencia, int numeroClasse, int numeroCarro, int numeroConta) {

		this.numeroAgencia = numeroAgencia;
		this.numeroClasse = numeroClasse;
		this.numeroCarro = numeroCarro;
		this.numeroConta = numeroConta;
	}
	/**
	 * Exclui os dados de reserva, salvando todos como 0
	 */
	public void excluirreserva() {
		this.numeroAgencia = 0;
		this.numeroClasse = 0;
		this.numeroCarro = 0;
		this.numeroConta = 0;
	}
	//gets e sets
	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroClasse() {
		return numeroClasse;
	}

	public void setNumeroClasse(int numeroClasse) {
		this.numeroClasse = numeroClasse;
	}

	public int getNumeroCarro() {
		return numeroCarro;
	}

	public void setNumeroCarro(int numeroCarro) {
		this.numeroCarro = numeroCarro;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	

}
