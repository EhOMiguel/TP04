package Model;

/**
 * Exclui e armazena todos os dados referentes a classe
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class Classe {	
	//atributos
	
	private String nome;
	/**
	 * Exclui os dados referentes a agencia setando null
	 */
	public void excluirclasse() {
		setNome(null);
	}

	//gets e sets
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Classe(String nome) {
		this.nome = nome;
	}
}
