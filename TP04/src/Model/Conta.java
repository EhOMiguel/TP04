package Model;
/**
 * Classe que armazena e excluir os dados da conta 
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class Conta extends Telefone {//estende a classe abstrata Telefone
	
	//atributos
	
	private String cpf, nome, email, cnh;
	/*
	 * salva os novos dados de telefone da conta para editar
	 */
	public void telefoneEditar( int ddd, int numero) {
		setDDD(ddd);
		setNumero(numero);
	}
	/**
	 * salva os dados da conta como null e entra no metodo de excluir o telefone para excluir todos os dados
	 * 
	 */
	public void excluir() {
		setNome(null);
		setCPF(null);
		setEmail(null);
		setCNH(null);
		excluir();
	}
	/**
	 * Metodo Construtor de conta
	 * @param cpf String com o CPF do usuario
	 * @param nome String com o nome do usuario
	 * @param email String com o email do usuario
	 * @param ddd int com o DDD do telefone do usuario
	 * @param numero int com o numero do teelfone do usuario
	 * @param cnh String com a CNH do usuario
	 */
	public Conta(String cpf, String nome, String email, int ddd,
			int numero, String cnh) {
		super(ddd, numero);
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.cnh = cnh;	
	}
	
	//gets e sets
	
	public int Numero(int nconta) {
		int numero = getNumero();
		return numero;
	}
	public int DDD(int nconta) {
		int ddd = getDDD();
		return ddd;
	}
	public String getCPF() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getCNH() {
			return cnh;
		}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
		
	}
	
	public void setCNH(String cnh) {
		this.cnh = cnh;
	}

				
}
