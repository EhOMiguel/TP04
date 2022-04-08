package Model;
/**
 * Armazena e exclui os dados relacionados a agencia
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class Agencia extends Telefone {//estende a classe abstrata Telefone
	
	private String cidade, estado, endereco, nome;
	/**
	 * Edita o telefone da agencia
	 * @param telefone int referente ao numero de telefone da agencia
	 */
	public void TelefoneEditar(int telefone) {//edita o telefone
		setNumero(telefone);	
	}
	/**
	 * Muda os dados de agencia para null e entra no metodo excluir para excluir o telefone
	 *
	 */
	public void excluirAgencia() {//exclui a agencia
		setNome(null);
		setEstado(null);
		setEndereco(null);
		setCidade(null);
		excluir();
	}
	/**
	 * Construtor de agencia
	 * @param cidade String com o nome da cidade de onde fica a agencia
	 * @param estado String com o nome do estado de onde fica a agencia
	 * @param endereco String com o endereco de onde fica a agencia
	 * @param nome String com o nome da agencia
	 * @param ddd int com o DDD do numero de telefone da agencia
	 * @param numero int com o numero de telefone da agencia
	 */
	public Agencia(String cidade, String estado, String endereco, String nome, int ddd, int numero) {
		super(ddd, numero);
		this.cidade = cidade;
		this.estado = estado;
		this.endereco = endereco;
		this.nome = nome;
	}
	//gets e sets
	public int Numero() {
		int numero=getNumero();
		return numero;
	}
	public int DDD(int nagencia) {
		int ddd=getDDD();
		return ddd;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
