package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


import Controller.ControleDados;
/**
 *  Nessa classe temos 7 telas distintas, referentes a Carro, classe, agencia e reserva
 *  
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class TelaCadastrarCCA implements ActionListener{
	
	private ControleDados control = new ControleDados();
	private TelaFuncoes funcao = new TelaFuncoes();
	public void dadospre() {//passagem de dados
		control.carrosCadastrados();
	}
	
	
	private JList<String> listaCarrosClasse;
	private JButton botaoExcluirClasse;
	private JLabel labelNomeClasse = new JLabel("Nome da classe: ");
	private JTextField valorClasse;
		
		
	private JTextField valorNomeAgencia;
	private JLabel labelNomeAgencia = new JLabel("Nome da loja: ");
	private JLabel labelCidade= new JLabel("cidade: ");
	private JTextField valorCidade;
	private JLabel labelEstado = new JLabel("Estado: ");
	private JLabel labelDF = new JLabel("Distrito Federal");
	private JLabel labelEndereco= new JLabel("endereco: ");
	private JTextField valorEndereco;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JTextField valorTelefone;
	private JButton botaoCadastrarAgencia = new JButton("Cadastrar");
	private JButton botaoExcluirAgencia = new JButton("Excluir");
	private JLabel labelddd= new JLabel("(61)");

		
	private JTextField valorCarro;
	private JFrame janela;
	private JLabel labelNomeCarro = new JLabel("Nome do carro: ");
	private JTextField valorNome;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelPlaca = new JLabel("Placa: ");
	private JTextField valorPlaca;
	private JLabel labelCapac = new JLabel("Capacidade: ");
	private JTextField valorCapac;
	private JLabel labelNPort = new JLabel("Numero de Portas: ");
	private JTextField valorNPortas;
	private JLabel labelAnoMod = new JLabel("Ano Modelo: ");
	private JTextField valorAnoMod;
	private JLabel labelValorDia = new JLabel("Valor de Aluguel Dia(R$) : ");
	private JTextField valorDia;
	private JButton botaoProximo = new JButton("Proximo");
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoCadastrar = new JButton("Cadastrar");
	private JButton botaoAtribuir = new JButton("Atribuir");
	
	
	private JLabel labelValorAgencia;
	private JLabel labelNomeCidade;
	private JLabel labelendereco;
	private JLabel labelNumeroTelefone;
	private JLabel labelClasse;	
	private JLabel labelValorCarro;
	private JLabel labelDia;
	
	private JLabel labelValorMarca;
	private JLabel labelValorPlaca;
	private JLabel labelValorCapac;
	private JLabel labelValorNPortas;
	private JLabel labelValorAnoMod;
	private JLabel labelValorDiaa;
	private JLabel arCondicionado = new JLabel("Ar Condicionado:");
	private JLabel travaEletrica = new JLabel("Trava Eletrica:");
	private JLabel vidroEletrico = new JLabel("Vidro Eletrico:");
	private JLabel direcaoHidraulica = new JLabel("Direcao Hidraulica:");
	private JLabel airbag = new JLabel("Airbag:");
	private JLabel abs = new JLabel("Abs:");
	private JLabel valorarCondicionado;
	private JLabel valortravaEletrica;
	private JLabel valorvidroEletrico;
	private JLabel valordirecaoHidraulica;
	private JLabel valorairbag;
	private JLabel valorabs;
	
	
	private JButton botaoConfirmarReserva;
	private JButton botaoExcluirReserva;
	private JButton botaoVoltar;
		
	private int opcao, NCarroR, NCReserva, NAReserva, nconta, nreserva;
	
	
	private String classeExcluir;
	private int nclasseExcluir, nclasseatribuir;
	private String[][] listaClasse = new String[999][999];
	public String[][] vetorClasse() {
		return control.vetorClasse();
	}
	
	private String[] listaCarros = new String[999];
	public void funcoesCadastradas() {
		funcao.funcoesCadastradas();
	}
	public String[] vetorCarro() {
		return control.vetorCarro();
	}
	 
	private String[] listaAgencia = new String[999];
	public String[] vetorAgencia() {
		return control.getVetorAgencia();
	}
	public String[] listaAgencias() {
		return listaAgencia=control.getVetorAgencia();
	}
	
	
	
	public boolean testereserva(int nconta) {
		
		boolean testeR = control.testereserva(nconta);
		return testeR;
	}
	public String[] listaReservas() {
		return control.listaReservas();
	}

	/**
	 * esse metodo são duas telas em uma uma tela pra cadastrar um carro novo e outra tela para excluir, visulizar ou
	 * editar um carro existente	
	 * @param op int que é a opção do usuario, se op=0 o usario deseja criar um novo carro ou
	 *  op!+= 0 editar/visulizar um carro existente 
	 */
	public void cadastrarCarro(int op){
		opcao=op;
		if(op==0) janela = new JFrame("Cadastradar novo carro");
		if(op!=0) janela = new JFrame("Detalhe carro");
		if(op==0) {
			valorNome = new JTextField(200);
			valorMarca = new JTextField(200);
			valorPlaca = new JTextField(200);
			valorCapac = new JTextField(200);
			valorNPortas = new JTextField(200);
			valorAnoMod = new JTextField(200);
			valorDia = new JTextField(200);
		}
		if(op!=0) {
			
			valorNome = new JTextField(control.Cnome(op),200);
			valorMarca = new JTextField(control.Cmarca(op),200);
			valorPlaca = new JTextField(control.Cplaca(op),200);
			valorCapac = new JTextField(control.Ccapac(op),200);
			valorNPortas = new JTextField(control.CNportas(op),200);
			valorAnoMod = new JTextField(control.CAnomod(op),200);
			valorDia = new JTextField(control.CVDia(op),200);
			
		}

		labelNomeCarro.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelMarca.setBounds(30, 50, 150, 25);
		valorMarca.setBounds(180, 50, 180, 25);
		labelPlaca.setBounds(30, 80, 180, 25);
		valorPlaca.setBounds(180, 80, 180, 25);		
		labelCapac.setBounds(30, 110, 150, 25);
		valorCapac.setBounds(180, 110, 180, 25);
		labelNPort.setBounds(30, 140, 150, 25);
		valorNPortas.setBounds(180, 140, 180, 25);
		labelAnoMod.setBounds(30, 170, 150, 25);
		valorAnoMod.setBounds(180, 170, 180, 25);
		labelValorDia.setBounds(30, 200, 150, 25);
		valorDia.setBounds(180, 200, 180, 25);
		botaoExcluir.setBounds(100, 255, 115, 30);
		botaoProximo.setBounds(245, 255, 115, 30);
		abs.setBounds(30, 230, 150, 25);
		airbag.setBounds(30, 260, 150, 25);
		travaEletrica.setBounds(30, 290, 150, 25);
		vidroEletrico.setBounds(30, 310, 150, 25);
		direcaoHidraulica.setBounds(30, 340, 150, 25);
		arCondicionado.setBounds(30, 370, 150, 25);
		
		this.janela.add(labelNomeCarro);
		this.janela.add(valorNome);
		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelPlaca);
		this.janela.add(valorPlaca);
		this.janela.add(labelCapac);
		this.janela.add(valorCapac);
		this.janela.add(labelNPort);
		this.janela.add(valorNPortas);
		this.janela.add(labelAnoMod);
		this.janela.add(valorAnoMod);
		this.janela.add(labelValorDia);
		this.janela.add(valorDia);

		
		if(op==0) {
			this.janela.add(botaoProximo);
		}
		if(op!=0) {
			this.janela.add(botaoProximo);
			this.janela.add(botaoExcluir);
		}
		this.janela.setLayout(null);

		this.janela.setSize(400, 350);
		this.janela.setVisible(true);
		botaoExcluir.addActionListener(this);
		botaoProximo.addActionListener(this);
	}
	
	/**
	 * Metodo de cadastrar uma classe novo
	 */
	public void cadastrarClasse(){
		
		janela = new JFrame("Cadastrar Classe");
		valorClasse= new JTextField(3);
		labelNomeClasse.setBounds(5, 20, 250, 25);
		valorClasse.setBounds(5, 20, 250, 25);
		valorClasse.setBounds(5, 50, 150, 25);
		botaoCadastrar.setBounds(170, 50, 100, 30);
		
		this.janela.add(labelNomeClasse);
		this.janela.add(valorClasse);
		this.janela.add(botaoCadastrar);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(300, 130);
		this.janela.setVisible(true);
		botaoCadastrar.addActionListener(this);
		
	}
	/**
	 * metodo de editar uma classe, consegue ver os carros que estão na classe e apagar a classe caso deseje.
	 * @param valorclasse int numero da classe que o usario escolheu para editar
	 */
	public void editarClasse(int valorclasse) {
		nclasseatribuir=valorclasse;
		nclasseExcluir=valorclasse;
		listaClasse=control.vetorClasse();
		for(int x=1; x<99; x++) {
			if(listaClasse[x][valorclasse]!=null) {
				listaCarros[x]=listaClasse[x][valorclasse];
			}else {
				listaCarros[x]=null;
			}
		}
		listaClasse=control.vetorClasse();
		String nomeclasse = listaClasse[0][valorclasse];
		classeExcluir = nomeclasse;
		labelClasse = new JLabel(""+nomeclasse);
		listaCarrosClasse = new JList<String>(listaCarros);
		janela = new JFrame("Classe editar");
		botaoExcluirClasse = new JButton("Excluir");
		
		labelClasse.setFont(new Font("Arial", Font.BOLD, 20));
		labelClasse.setBounds(90, 10, 250, 20);
		botaoExcluirClasse.setBounds(265, 177, 100, 30);

		listaCarrosClasse.setBounds(20, 50, 350, 120);
		listaCarrosClasse.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCarrosClasse.setVisibleRowCount(10);
		
		janela.setLayout(null);
		
		janela.add(labelClasse);
		janela.add(listaCarrosClasse);
		janela.add(botaoExcluirClasse);
		
		janela.setSize(400, 250);
		janela.setVisible(true);
		
		botaoExcluirClasse.addActionListener(this); 
	}
	/**
	 * metodo que pede que o usario digite corretamente o nome do carro e da classe que deseja atribuir ao carro
	 */
	public void atribuirClasse() {
		janela = new JFrame("Atribuir Classe");
		valorClasse= new JTextField(3);
		labelNomeClasse.setBounds(5, 20, 250, 25);
		valorClasse.setBounds(5, 50, 250, 25);
		valorCarro= new JTextField(3);
		labelNomeCarro.setBounds(5, 80, 250, 25);
		valorCarro.setBounds(5, 110, 250, 25);
		botaoAtribuir.setBounds(155, 150, 100, 30);
		
		this.janela.add(labelNomeClasse);
		this.janela.add(valorClasse);
		this.janela.add(botaoAtribuir);
		this.janela.add(valorCarro);
		this.janela.add(labelNomeCarro);
	
		
		this.janela.setLayout(null);
		
		this.janela.setSize(300, 250);
		this.janela.setVisible(true);
		botaoAtribuir.addActionListener(this);
		
	}
	
	/**
	 * 
	 * @param nAgencia int opção do usario caso nAgencia=0 o usario criara uma agencia nova ou
	 *  nAgencia!=0 o numero sera o numero da agencia que o usuario deseja editar/excluir. 
	 */
	public void cadastrarAgencia(int nAgencia) {
		opcao=nAgencia;
		if(nAgencia==0) janela = new JFrame("Cadastradar nova agencia");
		if(nAgencia!=0) janela = new JFrame("Detalhe agencia");
		if(nAgencia==0) {
			valorNomeAgencia = new JTextField(200);
			valorCidade = new JTextField(200);
			valorEndereco = new JTextField(200);
			valorTelefone = new JTextField(200);
		}
		if(nAgencia!=0) {
			
			valorNomeAgencia = new JTextField(control.Anome(nAgencia),200);
			valorCidade = new JTextField(control.Acidade(nAgencia),200);
			valorEndereco = new JTextField(control.Aendereco(nAgencia),200);
			valorTelefone = new JTextField(control.Atelefone(nAgencia),200);
			
		}
		labelNomeAgencia.setBounds(30, 20, 150, 25);
		valorNomeAgencia.setBounds(180, 20, 180, 25);
		labelCidade.setBounds(30, 50, 150, 25);
		valorCidade.setBounds(180, 50, 180, 25);
		labelEstado.setBounds(30, 80, 180, 25);
		labelDF.setBounds(180, 80, 180, 25);		
		labelEndereco.setBounds(30, 110, 150, 25);
		valorEndereco.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		labelddd.setBounds(150,140,50,25);
		valorTelefone.setBounds(180, 140, 180, 25);
		botaoExcluirAgencia.setBounds(115, 255, 115, 30);
		botaoCadastrarAgencia.setBounds(245, 255, 115, 30);
		
		this.janela.add(labelNomeAgencia);
		this.janela.add(valorNomeAgencia);
		this.janela.add(labelCidade);
		this.janela.add(valorCidade);
		this.janela.add(labelEstado);
		this.janela.add(labelDF);
		this.janela.add(labelEndereco);
		this.janela.add(valorEndereco);
		this.janela.add(labelTelefone);
		this.janela.add(labelddd);
		this.janela.add(valorTelefone);
	
		if(nAgencia==0) {
			this.janela.add(botaoCadastrarAgencia);
		}
		if(nAgencia!=0) {
			this.janela.add(botaoCadastrarAgencia);
			this.janela.add(botaoExcluirAgencia);
		}
		this.janela.setLayout(null);

		this.janela.setSize(400, 350);
		this.janela.setVisible(true);
		botaoExcluirAgencia.addActionListener(this);
		botaoCadastrarAgencia.addActionListener(this);
	}

	/**
	 * Esse metodo mostra as especificações do carro que o usuario escolheu para assim o usuario ter uma noção maior se esse carro
	 * que ele realmente deseja alugar
	 * @param ncarror int numero do carro que o usuario escolheu
	 * @param ncr int numero da classe que o usuario escolheu
	 * @param nar int numero da agencia que o usuario
	 * @param nc int numero da conta do usuario
	 * @param nomecarro int nome do carro que o usuario escolheu
	 */
	public void verCarro(int ncarror, int ncr, int nar, int nc, String nomecarro) {
		String[] listaCarro = new String[999];
		listaCarro=control.getVetorcarro();//pega o vetor com o nome de todos os carros
		for(int x=1; x<99; x++) {//compara o nome do carro que o usario escolheu com o vetor para assim pegar o numero do carro na ordem que ele foi cadastrado
			if(nomecarro.equals(listaCarro[x])==true) {
				NCarroR=x;
				x=100;
			}
		}
		NCReserva=ncr;
		NAReserva=nar;
		nconta=nc;
		
		janela = new JFrame("Detalhe carro");
		
		botaoConfirmarReserva = new JButton("Confirmar reserva");
		labelValorCarro = new JLabel(control.Cnome(NCarroR));
		labelValorMarca = new JLabel(control.Cmarca(NCarroR));
		labelValorPlaca = new JLabel(control.Cplaca(NCarroR));
		labelValorCapac = new JLabel(control.Ccapac(NCarroR));
		labelValorNPortas = new JLabel(control.CNportas(NCarroR));
		labelValorAnoMod = new JLabel(control.CAnomod(NCarroR));
		labelValorDiaa = new JLabel(control.CVDia(NCarroR));
		String rac="nao", rte="nao", rve="nao", rdh="nao", rab="nao", rabs="nao";
		if(funcao.rArCondicionado(NCarroR)==true) {
			rac="sim";
		}
		if(funcao.rTravaEletrica(NCarroR)==true){
			rte="sim";
		}
		if(funcao.rVidroEletrico(NCarroR)==true){
			rve="sim";
		}
		if(funcao.rDirecaoHidraulica(NCarroR)==true){
			rdh="sim";
		}
		if(funcao.rAirbag(NCarroR)==true){
			rab="sim";
		}
		if(funcao.rAbs(NCarroR)==true){
			rabs="sim";
		}
	
		valorarCondicionado = new JLabel(rac);
		valortravaEletrica = new JLabel(rte);
		valorvidroEletrico = new JLabel(rve);
		valordirecaoHidraulica = new JLabel(rdh);
		valorairbag = new JLabel(rab);
		valorabs = new JLabel(rabs);
		
		labelNomeCarro.setBounds(30, 20, 150, 25);
		labelValorCarro.setBounds(180, 20, 180, 25);
		labelMarca.setBounds(30, 50, 150, 25);
		labelValorMarca.setBounds(180, 50, 180, 25);
		labelPlaca.setBounds(30, 80, 180, 25);
		labelValorPlaca.setBounds(180, 80, 180, 25);		
		labelCapac.setBounds(30, 110, 150, 25);
		labelValorCapac.setBounds(180, 110, 180, 25);
		labelNPort.setBounds(30, 140, 150, 25);
		labelValorNPortas.setBounds(180, 140, 180, 25);
		labelAnoMod.setBounds(30, 170, 150, 25);
		labelValorAnoMod.setBounds(180, 170, 180, 25);
		labelValorDia.setBounds(30, 200, 150, 25);
		labelValorDiaa.setBounds(180, 200, 180, 25);
		abs.setBounds(30, 230, 150, 25);
		airbag.setBounds(30, 260, 150, 25);
		travaEletrica.setBounds(30, 290, 150, 25);
		vidroEletrico.setBounds(30, 320, 150, 25);
		direcaoHidraulica.setBounds(30, 350, 150, 25);
		arCondicionado.setBounds(30, 380, 150, 25);
		valorabs.setBounds(180, 230, 150, 25);
		valorairbag.setBounds(180, 260, 150, 25);
		valortravaEletrica.setBounds(180, 290, 150, 25);
		valorvidroEletrico.setBounds(180, 320, 150, 25);
		valordirecaoHidraulica.setBounds(180, 350, 150, 25);
		valorarCondicionado.setBounds(180, 380, 150, 25);
		botaoConfirmarReserva.setBounds(200, 420, 150, 25);
		
		this.janela.add(labelNomeCarro);
		this.janela.add(labelValorCarro);
		this.janela.add(labelMarca);
		this.janela.add(labelValorMarca);
		this.janela.add(labelPlaca);
		this.janela.add(labelValorPlaca);
		this.janela.add(labelCapac);
		this.janela.add(labelValorCapac);
		this.janela.add(labelNPort);
		this.janela.add(labelValorNPortas);
		this.janela.add(labelAnoMod);
		this.janela.add(labelValorAnoMod);
		this.janela.add(labelValorDia);
		this.janela.add(labelValorDiaa);
		this.janela.add(abs);
		this.janela.add(airbag);
		this.janela.add(travaEletrica);
		this.janela.add(vidroEletrico);
		this.janela.add(direcaoHidraulica);
		this.janela.add(arCondicionado);
		this.janela.add(valorabs);
		this.janela.add(valorairbag);
		this.janela.add(valortravaEletrica);
		this.janela.add(valorvidroEletrico);
		this.janela.add(valordirecaoHidraulica);
		this.janela.add(valorarCondicionado);
		this.janela.add(botaoConfirmarReserva);
		
		this.janela.setLayout(null);

		this.janela.setSize(400, 500);
		this.janela.setVisible(true);
		botaoConfirmarReserva.addActionListener(this);
	}
	/**
	 * Esse metodo mostra ao usuario as informações de sua reserva ativa e caso ele queria ele aqui ele pode excluir a reserva
	 * @param numeroReserva int numero da reserva do usuario em ordem que as reservas foram feitas
	 * @param nc int numero da conta do usuario
	 */
	public void verReservaAtiva(int numeroReserva, int nc) {
		nreserva=numeroReserva;
		nconta=nc;
		int ncarroreserva = control.ncarroReserva(numeroReserva);//pega o numero do carro que foi reservado pelo usario
		
		janela = new JFrame("Reserva Ativa");
		
		labelValorAgencia = new JLabel(control.agenciaReserva(numeroReserva));
		labelendereco = new JLabel(control.enderecoAgencia(numeroReserva));
		labelClasse = new JLabel(control.classeReserva(numeroReserva));
		labelNomeCidade = new JLabel(control.cidadeAgencia(numeroReserva));
		labelNumeroTelefone= new JLabel(control.TelefoneAgencia(numeroReserva));
		labelValorCarro = new JLabel(control.Cnome(ncarroreserva));
		labelDia = new JLabel(control.CVDia(ncarroreserva));
		
		String rac="nao", rte="nao", rve="nao", rdh="nao", rab="nao", rabs="nao";
		if(funcao.rArCondicionado(ncarroreserva)==true) {
			rac="sim";
		}
		if(funcao.rTravaEletrica(ncarroreserva)==true){
			rte="sim";
		}
		if(funcao.rVidroEletrico(ncarroreserva)==true){
			rve="sim";
		}
		if(funcao.rDirecaoHidraulica(ncarroreserva)==true){
			rdh="sim";
		}
		if(funcao.rAirbag(ncarroreserva)==true){
			rab="sim";
		}
		if(funcao.rAbs(ncarroreserva)==true){
			rabs="sim";
		}
		valorarCondicionado = new JLabel(rac);
		valortravaEletrica = new JLabel(rte);
		valorvidroEletrico = new JLabel(rve);
		valordirecaoHidraulica = new JLabel(rdh);
		valorairbag = new JLabel(rab);
		valorabs = new JLabel(rabs);
		botaoVoltar = new JButton("Voltar");
		botaoExcluirReserva = new JButton("Excluir");
		
		labelNomeAgencia.setBounds(30, 20, 180, 25);
		labelValorAgencia.setBounds(180, 20, 180, 25);
		labelEstado.setBounds(30, 50, 180, 25);
		labelDF.setBounds(180, 50, 180, 25);	
		labelCidade.setBounds(30, 80, 150, 25);
		labelNomeCidade.setBounds(180, 80, 180, 25);
		labelEndereco.setBounds(30, 110, 150, 25);
		labelendereco.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		labelddd.setBounds(150,140,50,25);
		labelNumeroTelefone.setBounds(180, 140, 180, 25);
		labelNomeClasse.setBounds(30, 170, 180, 25);
		labelClasse.setBounds(180, 170, 180, 25);
		labelNomeCarro.setBounds(30, 200, 150, 25);
		labelValorCarro.setBounds(180, 200, 150, 25);
		labelValorDia.setBounds(30, 230, 150, 25);
		labelDia.setBounds(180, 230, 150, 25);
		airbag.setBounds(30, 260, 150, 25);
		valorairbag.setBounds(180, 260, 150, 25);
		travaEletrica.setBounds(30, 290, 290, 25);
		valortravaEletrica.setBounds(180, 290, 150, 25);
		vidroEletrico.setBounds(30, 320, 150, 25);
		valorvidroEletrico.setBounds(180, 320, 150, 25);
		direcaoHidraulica.setBounds(30, 350, 150, 25);
		valordirecaoHidraulica.setBounds(180, 350, 150, 25);
		arCondicionado.setBounds(30, 380, 150, 25);
		valorarCondicionado.setBounds(180, 380, 150, 25);
		abs.setBounds(30, 410, 150, 25);
		valorabs.setBounds(180, 410, 150, 25);
		botaoExcluirReserva.setBounds(180, 450, 100, 25);
		botaoVoltar.setBounds(30, 450, 100, 25);
		
		
		this.janela.add(labelNomeAgencia);
		this.janela.add(labelValorAgencia);
		this.janela.add(labelEstado);
		this.janela.add(labelDF);
		this.janela.add(labelCidade);
		this.janela.add(labelNomeCidade);
		this.janela.add(labelEndereco);
		this.janela.add(labelendereco);
		this.janela.add(labelTelefone);
		this.janela.add(labelddd);
		this.janela.add(labelNumeroTelefone);
		this.janela.add(labelNomeClasse);
		this.janela.add(labelClasse);
		this.janela.add(labelNomeCarro);
		this.janela.add(labelValorCarro);
		this.janela.add(labelValorDia);
		this.janela.add(labelDia);
		this.janela.add(airbag);
		this.janela.add(valorairbag);
		this.janela.add(travaEletrica);
		this.janela.add(valortravaEletrica);
		this.janela.add(vidroEletrico);
		this.janela.add(valorvidroEletrico);
		this.janela.add(direcaoHidraulica);
		this.janela.add(valordirecaoHidraulica);
		this.janela.add(arCondicionado);
		this.janela.add(valorarCondicionado);
		this.janela.add(abs);
		this.janela.add(valorabs);
		this.janela.add(botaoExcluirReserva);
		this.janela.add(botaoVoltar);
		
		this.janela.setLayout(null);

		this.janela.setSize(400, 530);
		this.janela.setVisible(true);
		
		botaoExcluirReserva.addActionListener(this);
		botaoVoltar.addActionListener(this);
	}
	//Captura ações referente aos botões
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoProximo) {
			try {
				if(opcao==0) {
						String nome = valorNome.getText();
						String marca = valorMarca.getText();
						String placa = valorPlaca.getText();
						if (testeplaca(placa)==true) {	
						int capacidade = Integer.parseInt(valorCapac.getText());				
						int nportas = Integer.parseInt(valorNPortas.getText());
						int anomod = Integer.parseInt(valorAnoMod.getText());
						int valordia = Integer.parseInt(valorDia.getText());
						control.cadastrarCarro(marca, nome, null, placa, capacidade, nportas, anomod, valordia);
						mensagemSucessoCadastro();
						funcao.escolherFuncoes();
						}else mensagemErroCadastro();

				}else{
						String nome = valorNome.getText();
						String marca = valorMarca.getText();
						String placa = valorPlaca.getText();
						if (testeplaca(placa)==true) {
							int capacidade = Integer.parseInt(valorCapac.getText());				
							int nportas = Integer.parseInt(valorNPortas.getText());
							int anomod = Integer.parseInt(valorAnoMod.getText());
							int valordia = Integer.parseInt(valorDia.getText());
							control.editarCarro(marca, nome, null, placa, capacidade, nportas, anomod, valordia, opcao);
							mensagemSucessoeditar();
							funcao.escolherFuncoes();
						}else mensagemErroCadastro();
				}	
			}catch (NullPointerException exc1) {
				mensagemErroCadastro();
			}catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}	
		}
		if(src == botaoExcluirClasse) {
			control.excluirClasse(classeExcluir, nclasseExcluir);
			mensagemSucessoExclusao();
		}
		if(src == botaoExcluir) {
			control.removerCarro(opcao);
			mensagemSucessoExclusao();
		}
		if(src == botaoCadastrar) {
			String nomeclasse = valorClasse.getText();
			control.cadastrarClasse(nomeclasse);
			mensagemSucessoClasse();
		}
		if(src == botaoAtribuir) {
			boolean teste=false;
			try {
				String classe = valorClasse.getText();
				String carro = valorCarro.getText();
				teste = control.atribuirClasse(carro, classe);
				if(teste==false)mensagemErroAtribuirr();
				if(teste==true)mensagemSucessoAtribuir();
			}catch (NullPointerException exc1) {
				mensagemErroAtribuir();
			}catch (NumberFormatException exc2) {
				mensagemErroAtribuir();
			}
		}
		if(src == botaoCadastrarAgencia ) {
			try {
				if(opcao==0) {
					String nomeA = valorNomeAgencia.getText();
					String cidade = valorCidade.getText();
					String endereco = valorEndereco.getText();
					int telefone = Integer.parseInt(valorTelefone.getText());				
					control.cadastrarAgencia(cidade, "Distrito Federal", endereco, nomeA, 61, telefone);
					mensagemSucessoCadastroAgencia();
				}else{
					String nomeA = valorNomeAgencia.getText();
					String cidade = valorCidade.getText();
					String endereco = valorEndereco.getText();
					int telefone = Integer.parseInt(valorTelefone.getText());
					control.editarAgencia(cidade, endereco, nomeA, telefone, opcao);						
					mensagemSucessoeditarAgencia();
				}	
			}catch (NullPointerException exc1) {
				mensagemErroCadastroAgencia();
			}catch (NumberFormatException exc2) {
				mensagemErroCadastroAgencia();
			}
		}
		if(src == botaoExcluirAgencia) {
			control.removerAgencia(opcao);
			mensagemSucessoExclusao();
		}
		if(src == botaoConfirmarReserva){
			control.salvarReserva(NCReserva, nconta, NAReserva, NCarroR);
			mensagemSucessoReserva();
		}
		if(src ==botaoVoltar) {
			janela.dispose();
		}
		if(src == botaoExcluirReserva) {
			control.excluirReserva(nreserva, nconta);
			mensagemSucessoExclusao();
		}
	}
	/**
	 * realiza um teste com o numero da plca que o usario digitou para ver ser a placa e valida
	 * @param placa String placa do carro que o usuario digitou
	 * @return true se passar no teste da placa, se tiver exatamente 7 caracteres, e false se não passar no teste, não tiver exatamente 7 caracteres
	 */
	public boolean testeplaca(String placa) {
		boolean teste=false;
		if (placa.length()==7) {
			teste=true;
		}
		return teste;
	}
	//mensagens de erro e sucesso
	public void mensagemErroCadastro() {
		
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. Capacidade, Numero de Portas, Ano modelo e Valor dia podem nao conter apenas numeros", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!\n Agora escolha as funcoes que seu carro possui", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	public void mensagemSucessoeditar() {
		JOptionPane.showMessageDialog(null, "Carro editado com sucesso!\n Agora edite as funcoes caso deseje.", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	public void mensagemSucessoReserva() {
		JOptionPane.showMessageDialog(null, "         Reserva confirmada!\n Obrigado por escolher a Me Acha", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	public void mensagemSucessoClasse() {
		JOptionPane.showMessageDialog(null, "Classe cadastrada com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	public void mensagemErroAtribuir() {
		
		JOptionPane.showMessageDialog(null,"ERRO AO ATRIBUIR A CLASSE!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. Verifique se o nome do carro e da classe estão escritos de maneira correta", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	public void mensagemErroAtribuirr() {
		
		JOptionPane.showMessageDialog(null,"ERRO AO ATRIBUIR A CLASSE!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Carro nao cadastrado(verifique as letras maiusculas e minusculas) \n"
				+ "2. Classe nao cadastrada(verifique as letras maiusculas e minusculas)", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	public void mensagemSucessoAtribuir() {
		JOptionPane.showMessageDialog(null, "Classe atribuida com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	public void mensagemErroCadastroAgencia() {
		
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1.Nem todos os campos foram preenchidos \n"
				+ "2.Telefone pode nao conter apenas numeros", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	public void mensagemSucessoCadastroAgencia() {
		JOptionPane.showMessageDialog(null, "Agencia cadastrado com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	public void mensagemSucessoeditarAgencia() {
		JOptionPane.showMessageDialog(null, "Agencia editada com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
}

