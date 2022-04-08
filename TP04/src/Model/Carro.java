package Model;


/**
 * Armazena e exclui os dados relacionados ao carro
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class Carro {
	
	private Funcao[] funcoes = new Funcao[999];
	private String[] vetorCarro= new String[999];
	
	//atributos
	
	private String marca, nome, foto, placa, classe;
	private int capacidade, numeroPortas, ano, valor;
	/**
	 * Muda os dados do carro para null e 0 para excluir os dados relacionados ao carro
	 */
	public void excluirCarro() {
		setMarca(null);
		setNome(null);
		setPlaca(null);
		setCapacidade(0);
		setNumeroPortas(0);
		setAno(0);
		setValor(0);
		setClasse(null);
	}
	/**
	 *Metodo construtor da classe carro, metodo sobrecarregado
	 * @param marca String com o nome da marca do carro
	 * @param nome String com o nome do carro
	 * @param foto String com o endereço da foto
	 * @param placa String com os caracteres da placa do carro
	 * @param capacidade int com o numero de pessoas que pode andar no carro
	 * @param numeroPortas int com o numero de portas que o carro possui
	 * @param ano int com o ano que o carro foi fabricado
	 * @param valor int com o valor em reais do dia de aluguel do carro
	 * @param ncarro int com o numero referente ao total de carros cadastrados no software
	 * @param arCondicionado boolean, se true o carro possui ar condicionado, se false não possui 
	 * @param travaEletrica boolean, se true o carro possui trava eletrica, se false não possui 
	 * @param vidroEletrico boolean, se true o carro possui vidro eletrico, se false não possui 
	 * @param direcaoHidraulica boolean, se true o carro possui direcao hidraulica, se false não possui 
	 * @param airbag boolean, se true o carro possui airbag, se false não possui 
	 * @param abs boolean, se true o carro possui abs, se false não possui 
	 */
	//sobrecarga
	public Carro(String marca, String nome, String foto, String placa, int capacidade, 
			int numeroPortas, int ano, int valor, int ncarro, boolean arCondicionado, boolean travaEletrica, boolean vidroEletrico, boolean direcaoHidraulica,
			boolean airbag, boolean abs) {
		
		this.marca = marca;
		this.nome = nome;
		this.foto = foto;
		this.placa = placa;
		this.capacidade = capacidade;
		this.numeroPortas = numeroPortas;
		this.ano = ano;
		this.valor = valor;
		funcoes[ncarro]= new Funcao(arCondicionado, travaEletrica, vidroEletrico, direcaoHidraulica,
				 airbag, abs);//entra em funcoes para terminar de criar o novo carro
		
	}
	/**
	 *Metodo construtor da classe carro
	 * @param marca String com o nome da marca do carro
	 * @param nome String com o nome do carro
	 * @param placa String com os caracteres da placa do carro
	 * @param capacidade int com o numero de pessoas que pode andar no carro
	 * @param numeroPortas int com o numero de portas que o carro possui
	 * @param ano int com o ano que o carro foi fabricado
	 * @param valor int com o valor em reais do dia de aluguel do carro
	 * @param ncarro int com o numero referente ao total de carros cadastrados no software
	 * @param arCondicionado boolean, se true o carro possui ar condicionado, se false não possui 
	 * @param travaEletrica boolean, se true o carro possui trava eletrica, se false não possui 
	 * @param vidroEletrico boolean, se true o carro possui vidro eletrico, se false não possui 
	 * @param direcaoHidraulica boolean, se true o carro possui direcao hidraulica, se false não possui 
	 * @param airbag boolean, se true o carro possui airbag, se false não possui 
	 * @param abs boolean, se true o carro possui abs, se false não possui 
	 */
	public Carro(String marca, String nome, String placa, int capacidade, 
			int numeroPortas, int ano, int valor, int ncarro, boolean arCondicionado, boolean travaEletrica, boolean vidroEletrico, boolean direcaoHidraulica,
			boolean airbag, boolean abs) {
		
		this.marca = marca;
		this.nome = nome;
		this.placa = placa;
		this.capacidade = capacidade;
		this.numeroPortas = numeroPortas;
		this.ano = ano;
		this.valor = valor;
		funcoes[ncarro]= new Funcao(arCondicionado, travaEletrica, vidroEletrico, direcaoHidraulica,
				 airbag, abs);//entra em funcoes para terminar de criar o novo carro
		
	}
	
	//gets e sets
	
	public String getClasse() {
		return classe;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public int getNumeroPortas() {
		return numeroPortas;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String getMarca() {
		return marca;
	}
	public int getValor() {
		return valor;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String[] getVetorCarro() {
		return vetorCarro;
	}

	public void setVetorCarro(String[] vetorCarro) {
		this.vetorCarro = vetorCarro;
	}
	
	
}
