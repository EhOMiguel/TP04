package Controller;


import Model.Agencia;
import Model.Carro;
import Model.Classe;
import Model.Conta;
import Model.Funcao;
import Model.Reserva;
/**
 * Classe mais importante do programa todos os dados passam por aqui antes de serem salvos em suas devidas classes
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class ControleDados {
	//aqui é criado diversos atributos em sua maioria vetores, temporarios e definitivos, para armazenamento logico
	private int ncarro=6, nfuncao=6, nconta=6, nclasse=6, nAgencia=6, nReservas=1;
	private Agencia[] agencia = new Agencia[999];
	private Carro[] carros = new Carro[999];
	private Conta[] contas = new Conta[999];
	private Classe[] classes  = new Classe[999];
	private Funcao[] funcoes = new Funcao[999];
	private Reserva[] reserva = new Reserva[999];
	
	
	private String[] nomeCarro = new String[999];// vetor que serve de apoio para o vetor nomeCarro
	private String[] nomeCarroteste = new String[999];// vetor que serve para fazer testes com um nome de carro especifico
	private String[] vetorcarro = new String[999];//vetor que armazena o nome de todos os carros por ordem que são cadastrados
	/**
	 * metodo que get e returnn o Vetor Carro 
	 * @return vetor que armazena todos os carros cadastrados
	 */
	public String[] vetorCarro() {
		return getVetorcarro();
	}
	
	
	private String[][] tempvetorclasse = new String[999][999];//vetor que serve de apoio para o vetor classes
	private String[][] nomeFuncaoteste = new String[999][999];//vetor que server pra fazer teste com um nome de carro especifico
	private String[][] vetorclasse = new String[999][999];//vetor que armazena as classes pelos carros cada coluna e referente a uma classe e as linhas são os carros
	public String[][] vetorClasse() {
		return getVetorclasse();
	}
	
	
	private String[] tempVetorAgencia = new String[999];//vetor que serve de apoio para vetorAgencia
	private String[] vetorAgencia = new String[999];//vetor que armazena o nome de todas as agencias por ordem que são cadastradas
	public String[] vetorAgencia() {
		return getVetorAgencia();
	}
	
	
	int[] tempVetorConta = new int[999];// vetor que serve de apoio para vetorContas
	private int[] vetorContas = new int[999];//vetor que armazena o numero de indentificação das contas de cada usuario
	/**
	 * teste para saber se a conta que o usario esta tentando acessar existe
	 * @param nconta int com o numero da conta do usario
	 * @return true se a conta existir, false se a conta não existir
	 */
	public boolean testeConta(int nconta) {
		boolean teste=false;
		
		tempVetorConta=getVetorContas();
		if(tempVetorConta[nconta]!=0) teste=true;
		return teste;
	}

	private String[][] tempClasse = new String[999][999];//vetor para auxiliar a pegar o nome da classe que usuario escolheu
	private String[] tempAgencia = new String[999];//vetor para auxiliar a pegar o nome da agencia que o usuario escolheu
	private String[] tempReservas = new String[100];//vetor auxiliar de Reservas
	private String[] Reservas = new String[100];//vetor que salva os numeros das contas que tem reserva ativa
	private boolean[] templistaReservas = new boolean[100];//vetor auxiliar de listaReservas
	private boolean[] listaReservas = new boolean[100];//vetor que salva os numeros das contas que tem reserva ativa
	public boolean testereserva(int nconta) {
		templistaReservas=getListaReservas();
		boolean testeR=false;
		testeR=templistaReservas[nconta];
		return testeR;
	}
	public String[] listaReservas(){
		return getReservas();
	}
	
	/**
	 * Dados pre cadastrados referente a conta das pessoas
	 */
	public void pessoasCadastradas() {
			contas[1]= new Conta("611.405.840-22","Breno Barros Costa"
					, "cletus_mcdermott@gmail.com", 68, 38467821, "57840574870");
			contas[2]= new Conta("311.457.530-78", "Douglas Martins Silva"
					, "howard_larson55@hotmail.com", 96, 32176937, "65371176892");
			contas[3]= new Conta("843.605.690-68", "Rodrigo Martins Alves"
					, "vicente96@hotmail.com", 61, 36571488, "12141135186");
			contas[4]= new Conta("801.788.720-59", "Emily Araujo Barros"
					, "joey97@gmail.com", 79, 22181847, "25735851233");
			contas[5]= new Conta("892.876.620-61", "Giovana Carvalho Fernandes"
					, "francisca_steuber@yahoo.com", 84, 37956852, "81432175175");	
			tempVetorConta=getVetorContas();
			tempVetorConta[1]=1;//salvando o numero das contas por ordem que são cadastradas
			tempVetorConta[2]=2;
			tempVetorConta[3]=3;
			tempVetorConta[4]=4;
			tempVetorConta[5]=5;
			setVetorContas(tempVetorConta);
		}
	/**
	 * Esse metodo pega todos os dados que o usuario inseriu é cria o novo objeto conta
	 * @param cpf String cpf do usuario
	 * @param nome String nome do usuario
	 * @param email String email do usuario
	 * @param ddd int numero do DDD do telefone do usuario
	 * @param numero int numero de telefone do usuario
	 * @param cnh int numero da CNH do usuario
	 * @return numero da conta criada que sera fornecido ao usuario para acesso da conta no futuro
	 */
	public int cadastrarPessoa(String cpf, String nome, String email, int ddd,
			int numero, String cnh) {
		int npessoa = getNconta();//puxa o numero total de contas para fornecer um numero no vo para o usuario
		contas[npessoa] = new Conta(cpf, nome, email, ddd, numero, cnh);
		tempVetorConta=getVetorContas();
		tempVetorConta[npessoa]=npessoa;
		setVetorContas(tempVetorConta);//armazena o numero da conta criada
		setNconta(npessoa);//sempre que seta o numero de contas ele soma um para a proxima conta ter um numero diferente da anterior
		return npessoa;
	}
	/**
	 * edita os valores da conta que o usuario editou
	 * @param cpf String cpf do usuario
	 * @param nome String nome do usuario
	 * @param email String email do usuario
	 * @param ddd int numero do DDD do telefone do usuario
	 * @param numero int numero de telefone do usuario
	 * @param cnh int numero da CNH do usuario
	 * @param nconta int numero da conta que o usuario esta editando
	 */
	public void editarConta(String cpf, String nome, String email, int ddd,
			int numero, String cnh, int nconta) {
		contas[nconta].setNome(nome);
		contas[nconta].setEmail(email);
		contas[nconta].setCPF(cpf);
		contas[nconta].setCNH(cnh);
		contas[nconta].telefoneEditar(ddd, numero);
		
	}
	/**
	 * Exclui os dados referentes a conta que o usuario escolheu
	 * @param ncontaexcluir int numero da conta que o usuario deseja excluir
	 * @return true se a conta existir e um dados forem excluidos e false se a conta não existe ou se 
	 * deu algum problema na hora de excluir os dados
	 */
	public boolean excluirpessoa(int ncontaexcluir) {
		String nometeste=contas[ncontaexcluir].getNome();
		boolean tentativa=false;
		if(nometeste!=null) {
			contas[ncontaexcluir].excluir();
		tentativa=true;
		}
		return tentativa;
	}
	
	/**
	 * efetua o cadastro de funções pre cadastradas
	 */
	public void funcoesCadastradas() {
		funcoes[1]= new Funcao(true, true ,true, true, true, true);
		funcoes[2]= new Funcao(false, true ,false, true, false, true);
		funcoes[3]= new Funcao(false, true ,true, true, false, false);
		funcoes[4]= new Funcao(true, true ,true, true, true, true);
		funcoes[5]= new Funcao(true, true ,true, true, true, true);
	}
	/**
	 * efetua o cadastro de carros e classes pre cadastrados
	 */
	public void carrosCadastrados() {
		classes[1]= new Classe("Sedan");
		classes[2]= new Classe("SUV");
		classes[3]= new Classe("Economico");
		classes[4]= new Classe("Compacto");
		classes[5]= new Classe("Compacto economico");
		vetorclasse[0][1]="Sedan";
		vetorclasse[0][2]="SUV";
		vetorclasse[0][3]="Economico";
		vetorclasse[0][4]="Compacto";
		vetorclasse[0][5]="Compacto economico";
		
		vetorclasse[1][3]="Civic";
		vetorclasse[1][5]="Uno";
		vetorclasse[1][4]="Kwid";
		vetorclasse[1][1]="Corola";
		vetorclasse[1][2]="Renegade";
		setVetorclasse(vetorclasse);
		
		carros[1]= new Carro("Honda", "Civic", "CIV1C51", 5, 4, 2021, 210, 1, true, true, true, true,
				true, true);
		carros[2]= new Carro("Fiat", "Uno","PES4D40", 5, 2, 2019, 115, 2, false, true, false, true,
				false, true);
		carros[3]= new Carro("Renault", "Kwid", "MOD3L05", 5, 3, 2022, 110, 3, false, true, true, true,
				false, false);
		carros[4]= new Carro("Toyota", "Corola", "COL1S40", 5, 4, 2022, 230, 4, true, true, true, true,
				true, true);
		carros[5]= new Carro("Jeep", "Renegade", "COM9A55", 5, 4, 2020,  200, 5, true, true, true, true,
				true, true);
		
		nomeCarro[1]="Civic";
		nomeCarro[2]="Uno";
		nomeCarro[3]="Kwid";
		nomeCarro[4]="Corola";
		nomeCarro[5]="Renegade";
		setVetorcarro(nomeCarro);
		
		agencia[1] = new Agencia("Brasilia", "DF", "CLN 308 bloco B", "Me acha Asa Norte", 61, 987654321);
		agencia[2] = new Agencia("Brasilia", "DF", "CLS 510 bloco D", "Me acha Asa Sul", 61, 912345678);
		agencia[3] = new Agencia("Brasilia", "DF", "Hall - Area Externa do Aeroporto Internacional de Brasília - Lago Sul, ", "Me acha Aeroporto", 61, 943553456);
		agencia[4] = new Agencia("Brasilia", "DF", "Q 2 Conjunto G K, 14", "Me acha Paranoa", 61, 99125003);
		agencia[5] = new Agencia("Brasilia", "DF", "QS 1 - Taguatinga", "Me acha Taguatinga", 61, 912345678);
		tempVetorAgencia=getVetorAgencia();
		tempVetorAgencia[1]=("Me acha Asa Norte");
		tempVetorAgencia[2]=("Me acha Asa Sul");
		tempVetorAgencia[3]=("Me acha Aeroporto");
		tempVetorAgencia[4]=("Me acha Paranoa");
		tempVetorAgencia[5]=("Me acha Taguatinga");
		setVetorAgencia(tempVetorAgencia);
	}
	/**
	 * Efetua o casdastro de novos carros
	 * @param marca String marca do carro
	 * @param nome String nome do carro
	 * @param foto String endereço URL da foto do carro
	 * @param placa String caracteres da placa do carro
	 * @param capacidade int numero de pessoas que cabe no carro
	 * @param nportas int numero de portas que o carro possui
	 * @param anomod int ano de fabricação do carro
	 * @param valordia int valor do dia de aluguel do carro
	 */
	public void cadastrarCarro(String marca, String nome, String foto, String placa, int capacidade, int nportas, int anomod,
			int valordia) {
		int ncarro=getNcarro();
		carros[ncarro]=new Carro(marca, nome, foto, placa, capacidade, nportas, anomod, valordia, ncarro, false, false, false, false,
				false, false);
		nomeCarro=getVetorcarro();
		nomeCarro[ncarro]=nome;
		setVetorcarro(nomeCarro);
		setNcarro(ncarro);
	}
	/**
	 * Metodo para editar os dados do carro que o usuario escolheu
	 * @param marca String marca do carro
	 * @param nome String nome do carro
	 * @param foto String endereço URL da foto do carro
	 * @param placa String caracteres da placa do carro
	 * @param capacidade int numero de pessoas que cabe no carro
	 * @param nportas int numero de portas que o carro possui
	 * @param anomod int ano de fabricação do carro
	 * @param valordia int valor do dia de aluguel do carro
	 * @param opcao int numero do carro que o usuario deseja editar
	 */
	public void editarCarro(String marca, String nome, String foto, String placa, int capacidade, int nportas, int anomod,
			int valordia, int opcao) {
		carros[opcao].setMarca(marca);
		carros[opcao].setAno(anomod);
		carros[opcao].setCapacidade(capacidade);
		carros[opcao].setPlaca(placa);
		carros[opcao].setValor(valordia);
		carros[opcao].setNumeroPortas(nportas);
		carros[opcao].setNome(nome);
		nomeCarro=getVetorcarro();
		nomeCarro[opcao]=nome;
		setVetorcarro(nomeCarro);
		
	}	
	/**
	 * metodo que cadastra as funções do carro
	 * @param abs boolean, se true o carro possui abs, se false não possui 
	 * @param airbag boolean, se true o carro possui airbag, se false não possui 
	 * @param travaEletrica boolean, se true o carro possui trava eletrica, se false não possui 
	 * @param vidroEletrico boolean, se true o carro possui vidro eletrico, se false não possui 
	 * @param direcaoHidraulica boolean, se true o carro possui direcao hidraulica, se false não possui 
	 * @param arCondicionado boolean, se true o carro possui ar condicionado, se false não possui 
	 */
	public void cadastrarFuncao(boolean abs, boolean airbag, boolean travaEletrica, boolean vidroEletrico, boolean direcaoHidraulica,
			boolean arCondicionado) {
		int nfuncao=getNfuncao();
		funcoes[nfuncao]=new Funcao(arCondicionado, travaEletrica, vidroEletrico, direcaoHidraulica, airbag, abs);
		setNfuncao(nfuncao);
	}
	/**
	 * Metodo que exclui os dados os dados do carro
	 * @param Ncarro int numero do carro que o usuario deseja excluir
	 */
	public void removerCarro (int Ncarro) {
		carros[Ncarro].excluirCarro();
		tempvetorclasse = getVetorclasse();
		for(int x=1; x<100; x++) {
			for(int y=1; y<100; y++) {
				if(tempvetorclasse[y][x]==nomeCarro[Ncarro]) {
					tempvetorclasse[y][x]=null;
					y=100;
					x=100;
				}
			}
		}
		nomeCarro[Ncarro]=null;
		setVetorclasse(tempvetorclasse);
		setVetorcarro(nomeCarro);
	}
	
	/**
	 * Metodo que efetua o cadastro de uma nova classe
	 * @param nomeclasse String nome da classe que deseja cadastrar
	 */
	public void cadastrarClasse(String nomeclasse){
		int classe = getNclasse();
		classes[classe]= new Classe(nomeclasse);
		tempvetorclasse = getVetorclasse();
		vetorclasse[0][classe]=nomeclasse;
		setNclasse(classe);
		setVetorclasse(tempvetorclasse);
	}
	/**
	 * Metodo que exclui todos os dados referentes a classe escolhida
	 * @param classeExcluir String nome da classe que deseja excluir
	 * @param numeroclasse int numero da classe que deseja excluir
	 */
	public void excluirClasse(String classeExcluir, int numeroclasse) {
		classes[numeroclasse].excluirclasse();
		tempvetorclasse = getVetorclasse();
		for(int x=0; x<100; x++) {
			tempvetorclasse[x][numeroclasse]=null;
		}
		setVetorclasse(tempvetorclasse);
	}
	/**
	 * Metodo que efetua diversos testes para atribuir uma classe a um carro
	 * @param carro String nome do carro que deseja atribuir a classe
	 * @param classe String nome da classe que deseja atribuir ao carro
	 * @return true se passar em todos os testes e atribuir a classe ao carro,
	 * e false se não passar nos testes e não conseguir atribuir a classe ao carro 
	 */
	public boolean atribuirClasse(String carro, String classe) {
		boolean teste=false;
		nomeCarroteste=getVetorcarro();
		nomeFuncaoteste=getVetorclasse();
		for(int x=1; x<getNcarro(); x++) {
			String carroteste=nomeCarroteste[x];//primeiro pega o nome de um carro dentre os carros cadastrados 
			if(carroteste!=null) {
				if(carroteste.equals(carro)==true) {//quando ele encontrar um carro ele compara com o carro que o usuario deseja atribuir uma classe
					for(int y=1; y<getNfuncao(); y++) {//se os nomes forem iguais ele sabe que o carro existe e entra 
						String funcaoteste=nomeFuncaoteste[0][y];//agora ele faz a mesma coisa so que com a classe para saber se a classe existe no programa
						if(funcaoteste!=null) {
							if(classe.equals(funcaoteste)==true) {//se existir ele entra e ja cadastra o carro na classe
								teste=true;
								for(int z=1; z<99;z++) {
									funcaoteste=nomeFuncaoteste[z][y];//aqui ele vai na coluna da classe e procura um espaço vazio para cadastrar o carro
									if(funcaoteste==null) {//achou um expaço vazio ele entra e escreve o nome do carro no lugar do espaço vazio
										for(int x1=1; x1<99;x1++) {
											for(int y1=1; y1<99;y1++) {
												if(carro.equals(nomeFuncaoteste[x1][y1])==true) {//aqui ele procura em todas as classe o nome do carro
													nomeFuncaoteste[x1][y1]=null;//caso ele tivesse uma classe anteriormente ele apaga o carro desse classe para poder atribuir uma nova classe ao carro
												}	
											}
										}
										nomeFuncaoteste[z][y]=carro;//por ultimo ele salva o nome do carro na classe escolhida 
										x=99;//e encerra todas as repetições
										y=99;
										z=99;
										setVetorclasse(nomeFuncaoteste);//e seta o vetor pra ficar tudo salvo
									}
								}
							}
						}
					}
				}
			}
		}
		return teste;
	}

	/**
	 * remove todos os dados de uma agencia escolhida
	 * @param nAgencia int numero da agencia escolhida 
	 */
	public void removerAgencia (int nAgencia) {
		agencia[nAgencia].excluirAgencia();
		tempVetorAgencia = getVetorAgencia();
		tempVetorAgencia[nAgencia]=null;
		setVetorAgencia(tempVetorAgencia);
	}
	/**
	 * edita os dados de uma agencia escolhida
	 * @param cidade String nome da cidade
	 * @param endereco String endereço da agencia
	 * @param nomeA String nome da agencia
	 * @param telefone int telefone da agencia
	 * @param Nagencia int numero da agencia que deseja editar
	 */
	public void editarAgencia(String cidade, String endereco, String nomeA, int telefone, int Nagencia) {
		agencia[Nagencia].setNome(nomeA);
		agencia[Nagencia].setCidade(cidade);
		agencia[Nagencia].setEndereco(endereco);
		agencia[Nagencia].TelefoneEditar(telefone);
		tempVetorAgencia = getVetorAgencia();
		tempVetorAgencia[Nagencia]=nomeA;
		setVetorAgencia(tempVetorAgencia);
	}
	/**
	 * Recebe e salva os dados da agencia que deseja cadastrar
	 * @param cidade String nome da cidade
	 * @param estado String nome do estado que fica a cidade
	 * @param endereco String endereço da agencia
	 * @param nomeA String nome da agencia
	 * @param ddd int DDD do telefone da agencia
	 * @param telefone int telefone da agencia
	 */
	public void cadastrarAgencia(String cidade, String estado, String endereco, String nomeA, int ddd, int telefone) {
			int Nagencia = getnAgencia();
			agencia[Nagencia]= new Agencia(cidade, estado, endereco, nomeA, ddd, telefone);
			tempVetorAgencia = getVetorAgencia();
			tempVetorAgencia[nAgencia]=nomeA;
			setVetorAgencia(tempVetorAgencia);
			setnAgencia(Nagencia);
	}
	
	/**
	 * Recebe e salva os dados referentes a nova reserva do usuario
	 * @param NCReserva int numero da classe que o se encontra o carro que deseja alugar
	 * @param nconta int numero da conta do usuario que esta fazendo a reserva
	 * @param NAReserva int numero da agencia que o usuario escolheu para efetuar a reserva
	 * @param NCarroR int numero do carro que o usuario deseja alugar
	 */
	public void salvarReserva(int NCReserva, int nconta, int NAReserva, int NCarroR) {
		int numeroReserva =getnReservas();
		reserva[numeroReserva]= new Reserva(NAReserva, NCReserva, NCarroR, nconta);
		templistaReservas=getListaReservas();
		templistaReservas[nconta]=true;
		tempReservas=getReservas();
		tempReservas[numeroReserva]=Integer.toString(nconta);
		setReservas(tempReservas);
		setListaReservas(templistaReservas);
		setnReservas(numeroReserva);
	}
	/**
	 * Da um get no numero do carro que o usuario alugou para poder mostrar informações da reserva ativa para o usuario
	 * @param numeroreserva int numero da reserva para acessar a classe
	 * @return numero do carro alugado referente a reserva ativa do usuario
	 */
	public int ncarroReserva(int numeroreserva) {
		return reserva[numeroreserva].getNumeroCarro();
	}
	/**
	 * Exclui todos os dados referentes a reserva ativa do usuario
	 * @param numeroreserva int numero da reserva do usuario
	 * @param ncontaa int numero da conta do usuario
	 */
	public void excluirReserva(int numeroreserva, int ncontaa) {
		reserva[numeroreserva].excluirreserva();
		templistaReservas=getListaReservas();
		templistaReservas[ncontaa]=false;
		tempReservas=getReservas();
		tempReservas[numeroreserva]=null;
		setReservas(tempReservas);
		setListaReservas(templistaReservas);
	}
	//GETS E SETS
	/**
	 * Da um get no numero da agencia que o usuario alugou para poder mostrar informações da reserva ativa para o usuario
	 * @param numeroreserva int numero da reserva do usuario
	 * @return numero da agencia que o usuario reservou
	 */
	public String agenciaReserva(int numeroreserva) {
		tempAgencia=getVetorAgencia();
		String nomeA = tempAgencia[reserva[numeroreserva].getNumeroAgencia()];
		return nomeA;
	}
	/**
	 * Da um get no nome da classe do carro que o usuario alugou para poder mostrar informações da reserva ativa para o usuario
	 * @param numeroreserva int numero da reserva do usuario
	 * @return nome da classe do carro que o usuario reservou
	 */
	public String classeReserva(int numeroreserva) {
		tempClasse=getVetorclasse();
		String nomeC = tempClasse[0][reserva[numeroreserva].getNumeroClasse()];
		return nomeC;
	}
	/**
	 * Busca o endereço da agencia da reserva ativa do usuario
	 * @param numeroreserva int numero da reserva do usuario
	 * @return o endereço da agencia que o usuario fez a reserva
	 */
	public String enderecoAgencia(int numeroreserva) {
		tempAgencia=getVetorAgencia();
		int numeroA = reserva[numeroreserva].getNumeroAgencia();
		String endereco = agencia[numeroA].getEndereco();
		return endereco;
	}
	public String cidadeAgencia(int numeroreserva) {
		tempAgencia=getVetorAgencia();
		int numeroA = reserva[numeroreserva].getNumeroAgencia();
		String cidade = agencia[numeroA].getCidade();
		return cidade;
	}
	public String TelefoneAgencia(int numeroreserva) {
		tempAgencia=getVetorAgencia();
		int numeroA = reserva[numeroreserva].getNumeroAgencia();
		String telefone = Integer.toString(agencia[numeroA].Numero());
		return telefone;
	}
	//gets e sets	
	
	public int getNconta() {
		return nconta;
	}
	public void setNconta(int nconta) {
		this.nconta = nconta+1;
	}
	public int getNcarro() {
		return ncarro;
	}
	public void setNcarro(int ncarro) {
		this.ncarro = ncarro+1;
	}
	public int getNfuncao() {
		return nfuncao;
	}
	public void setNfuncao(int nfuncao) {
		this.nfuncao = nfuncao+1;
	}
	public String[] getVetorcarro() {
		return vetorcarro;
	}
	public void setVetorcarro(String[] vetorcarros) {
		this.vetorcarro = vetorcarros;
	}
	public String Cnome(int op) {
		return carros[op].getNome();	
	}
	public String Cmarca(int op) {
		return carros[op].getMarca();	
	}
	public String Cplaca(int op) {
		return carros[op].getPlaca();	
	}
	public String Ccapac(int op) {
		return Integer.toString(carros[op].getCapacidade());	
	}
	public String CNportas(int op) {
		return Integer.toString(carros[op].getNumeroPortas());	
	}
	public String CAnomod(int op) {
		return Integer.toString(carros[op].getAno());	
	}
	public String CVDia(int op) {
		return Integer.toString(carros[op].getValor());	
	}
	public String ContaNome(int Nconta) {
		return contas[Nconta].getNome();	
	}
	public String ContaEmail(int Nconta) {
		return contas[Nconta].getEmail();	
	}
	public String ContaCPF(int Nconta) {
		return contas[Nconta].getCPF();	
	}
	public String ContaCNH(int Nconta) {
		return contas[Nconta].getCNH();	
	}
	public String ContaNumero(int Nconta) {
		return Integer.toString(contas[Nconta].Numero(Nconta));
	}
	public String ContaDDD(int Nconta) {
		return Integer.toString(contas[Nconta].DDD(Nconta));
	}
	public String[][] getVetorclasse() {
		return vetorclasse;
	}
	public void setVetorclasse(String[][] vetorclasse) {
		this.vetorclasse = vetorclasse;
	}
	public int getNclasse() {
		return nclasse;
	}
	public void setNclasse(int nclasse) {
		this.nclasse = nclasse+1;
	}
	public String[] getVetorAgencia() {
		return vetorAgencia;
	}
	public void setVetorAgencia(String[] tempVetorAgencia) {
		vetorAgencia = tempVetorAgencia;
	}
	public String Anome(int op) {
		return agencia[op].getNome();	
	}
	public String Acidade(int op) {
		return agencia[op].getCidade();	
	}
	public String Aestado(int op) {
		return agencia[op].getEstado();	
	}
	public String Aendereco(int op) {
		return agencia[op].getEndereco();	
	}
	public String Atelefone(int op) {
		return Integer.toString(agencia[op].Numero());
	}
	public int getnAgencia() {
		return nAgencia;
	}
	public void setnAgencia(int nAgencia) {
		this.nAgencia = nAgencia+1;
	}
	public int[] getVetorContas() {
		return vetorContas;
	}
	public void setVetorContas(int[] tempvetorContas) {
		vetorContas = tempvetorContas;
	}
	public boolean rArCondicionado(int ncarro) {
		return funcoes[ncarro].isArCondicionado();
	}
	public boolean rDirecaoHidraulica(int ncarro) {
		return funcoes[ncarro].isDirecaoHidraulica();
	}
	public boolean rVidroEletrico(int ncarro) {
		return funcoes[ncarro].isVidroEletrico();
	}
	public boolean rTravaEletrica(int ncarro) {
		return funcoes[ncarro].isTravaEletrica();
	}
	public boolean rAirbag(int ncarro) {
		return funcoes[ncarro].isAirbag();
	}
	public boolean rAbs(int ncarro) {
		return funcoes[ncarro].isAbs();
	}
	public int getnReservas() {
		return nReservas;
	}
	public void setnReservas(int nReservas) {
		this.nReservas = nReservas+1;
	}
	public boolean[] getListaReservas() {
		return listaReservas;
	}
	public void setListaReservas(boolean[] listaReservas) {
		this.listaReservas = listaReservas;
	}
	public String[] getReservas() {
		return Reservas;
	}
	public void setReservas(String[] reservas) {
		Reservas = reservas;
	}
	
}
