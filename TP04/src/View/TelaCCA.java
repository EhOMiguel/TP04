package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 * Temos nessa classe 4 telas distintas, o usuario que selecionou o botão 'Classe', 'Carro' ou 'Agencia' veio pra ca 'direto'
 * e o usario que está fazendo a reserva veio pra ca de pois de passar pelas outras classes.
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */


public class TelaCCA implements ActionListener, ListSelectionListener{
	private TelaCadastrarCCA cadastrarCCA = new TelaCadastrarCCA();
	private JFrame janela;
	private JLabel titulo;
	//passagem de dados
	public void dadospre() {
		cadastrarCCA.dadospre();
	}
	
	
	private JButton cadastroCarro;
	private JButton refreshCarro;
	private JList<String> listaCarrosCadastrados;
	private String[][] templistaCarros = new String[999][999];
	private String[] listaCarros = new String[999];
	private String[] listaCarross = new String[999];
	public void funcoesCadastradas() {//passagem de dados
		cadastrarCCA.funcoesCadastradas();
	}
	
	
	private JButton cadastroClasse;
	private JButton refreshClasse;
	private JButton atribuirClasse;
	private JList<String> listaClassesCadastradas;
	private String[][] listaClasses = new String[999][999];
	private String[] listaClasse = new String[999];
	/**
	 * Chama o vetor classe, e separa as classes dos carros
	 * @return String[] que contem somente as classes cadastradas
	 */
	public String[] vetorClasse() {
		listaClasses=cadastrarCCA.vetorClasse();
		for(int x=0; x<100; x++) {
		listaClasse[x]=listaClasses[0][x];
		}
		return listaClasse;
	}
	/**
	 * Chama o vetor classe, e separa os carros de uma classe especifica
	 * @return String[] que contem somente os carros cadastrados em uma classe
	 */
	public String[] separarCarrosClasse() {
		templistaCarros=cadastrarCCA.vetorClasse();
		for(int x=1; x<100; x++) {
			listaCarross[x]=templistaCarros[x][NCReserva];
		}
		return listaCarross;
	}
	
	
	private JButton cadastraAgencia;
	private JButton refreshAgencia;
	private JList<String> listaAgenciasCadastradas;
	private String[] listaAgencia= new String[999];
	public String[] vetorAgencia() {//passagem de dados
		return listaAgencia=cadastrarCCA.vetorAgencia();
	}
	
	
	private JList<String> listaCarrosReserva;
	private int NCReserva, NAReserva, nconta;
	public String[] listaReservas() {
		return cadastrarCCA.listaReservas();//passagem de dados
	}
	public boolean testereserva(int nconta) {
		
		boolean testeR = cadastrarCCA.testereserva(nconta);
		return testeR;
	}
	public void verReservaAtiva(int numeroReserva, int nconta) {
		cadastrarCCA.verReservaAtiva(numeroReserva, nconta);
	}

	/**
	 * metodo que mostra uma interface com um JList das classes cadastradas e 3 botoes
	 * [1]botao cadastrar para o usuario cadastrar uma nova classe
	 * [2]botao refresh para recarregar o JList
	 * [3]botao atribuir para atribuir uma classe a um carro
	 * [4]JList se o usario clicar ele ira para uma outra tela de especificação da classe
	 */
	public void verClasse(){
		listaClasses=cadastrarCCA.vetorClasse();
		for(int x=1; x<100; x++) {//so transforma a String[][] em String[]
			if(listaClasses[0][x]!=null) {
				listaClasse[x]=listaClasses[0][x];				
			}		
		}
		listaClassesCadastradas = new JList<String>(listaClasse);
		janela = new JFrame("Classes");
		titulo = new JLabel("Classes Cadastradas");
		cadastroClasse = new JButton("Cadastrar");
		refreshClasse = new JButton("Refresh");
		atribuirClasse = new JButton("Atribuir");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 20);
		listaClassesCadastradas.setBounds(20, 50, 350, 120);
		listaClassesCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaClassesCadastradas.setVisibleRowCount(10);

		cadastroClasse.setBounds(20, 177, 100, 30);
		refreshClasse.setBounds(240, 177, 100, 30);
		atribuirClasse.setBounds(130, 177, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaClassesCadastradas);
		janela.add(cadastroClasse);
		janela.add(atribuirClasse);
		janela.add(refreshClasse);

		janela.setSize(400, 250);
		janela.setVisible(true);

		atribuirClasse.addActionListener(this);
		cadastroClasse.addActionListener(this);
		refreshClasse.addActionListener(this);
		listaClassesCadastradas.addListSelectionListener(this);
	}
	
	/**
	 * metodo que mostra uma interface com um JList dos carros cadastradas e 2 botoes
	 * [1]botao cadastrar para o usuario cadastrar um novo carro
	 * [2]botao refresh para recarregar o JList
	 * [3]JList se o usario clicar ele ira para uma outra tela de especificação do Carro
	 */
	public void verCarros(){
			listaCarros=cadastrarCCA.vetorCarro();//vetor com o nome dos carros cadastrados
			listaCarrosCadastrados = new JList<String>(listaCarros);
			janela = new JFrame("Carros");
			titulo = new JLabel("Carros Cadastrados");
			cadastroCarro = new JButton("Cadastrar");
			refreshCarro = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 20);
			listaCarrosCadastrados.setBounds(20, 50, 350, 120);
			listaCarrosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaCarrosCadastrados.setVisibleRowCount(10);

			cadastroCarro.setBounds(70, 177, 100, 30);
			refreshCarro.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaCarrosCadastrados);
			janela.add(cadastroCarro);
			janela.add(refreshCarro);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroCarro.addActionListener(this);
			refreshCarro.addActionListener(this);
			listaCarrosCadastrados.addListSelectionListener(this);
		}
	
	/**
	 *  metodo que mostra uma interface com um JList das agencias cadastradas e 2 botoes
	 * [1]botao cadastrar para o usuario cadastrar uma nova agencia
	 * [2]botao refresh para recarregar o JList
	 * [3]JList se o usario clicar ele ira para uma outra tela de especificação da agencia
	 */
	public void verAgencia(){
		listaAgencia=cadastrarCCA.vetorAgencia();//vetor com o nome das agencias cadastradas
		listaAgenciasCadastradas = new JList<String>(listaAgencia);
		janela = new JFrame("Agencia");
		titulo = new JLabel("Agencias Cadastradas - DF");
		cadastraAgencia = new JButton("Cadastrar");
		refreshAgencia = new JButton("Refresh");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(70, 10, 260, 35);
		listaAgenciasCadastradas.setBounds(20, 51, 350, 120);
		listaAgenciasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaAgenciasCadastradas.setVisibleRowCount(10);

		cadastraAgencia.setBounds(70, 177, 100, 30);
		refreshAgencia.setBounds(200, 177, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaAgenciasCadastradas);
		janela.add(cadastraAgencia);
		janela.add(refreshAgencia);

		janela.setSize(400, 250);
		janela.setVisible(true);

		cadastraAgencia.addActionListener(this);
		refreshAgencia.addActionListener(this);
		listaAgenciasCadastradas.addListSelectionListener(this);
	}
	/**
	 * O usuario deve escolher um carro para alugar, da classe que ele escolheu
	 * @param ncr int com o numero da classe que o usuario escolheu
	 * @param nar int com o numero da agencia que o usuario escolheu
	 * @param nc int com o numero da conta do usuario
	 */
	public void escolherCarro(int ncr,int nar, int nc) {
		NCReserva=ncr;
		NAReserva=nar;
		nconta=nc;
		listaCarross=separarCarrosClasse();
		listaCarrosReserva = new JList<String>(listaCarross);
		janela = new JFrame("Reserva");
		titulo = new JLabel("Escolha o carro que deseja alugar:");
	
		titulo.setFont(new Font("Arial", Font.BOLD, 15));
		titulo.setBounds(30, 10, 300, 35);
		listaCarrosReserva.setBounds(20, 51, 350, 120);
		listaCarrosReserva.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCarrosReserva.setVisibleRowCount(10);
	
		janela.setLayout(null);
	
		janela.add(titulo);
		janela.add(listaCarrosReserva);
	
		janela.setSize(400, 250);
		janela.setVisible(true);
	
		listaCarrosReserva.addListSelectionListener(this);
	}	
	
	//Captura eventos relacionados aos botoes
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == cadastroCarro) {
			cadastrarCCA.cadastrarCarro(0);
		}
		if(src == refreshCarro) {
			listaCarrosCadastrados.setListData(listaCarros=cadastrarCCA.vetorCarro());			
			listaCarrosCadastrados.updateUI();	
		}
		if(src == cadastroClasse) {
			cadastrarCCA.cadastrarClasse();
		}
		if(src == refreshClasse) {
			listaClasses=cadastrarCCA.vetorClasse();
			for(int x=1; x<100; x++) {
				if(listaClasses[0][x]!=null) {
					listaClasse[x]=listaClasses[0][x];				
				}else{
					listaClasse[x]=null;
				}
			}
			listaClassesCadastradas.setListData(listaClasse);			
			listaClassesCadastradas.updateUI();
		}
		if(src == atribuirClasse) {
			cadastrarCCA.atribuirClasse();
			
		}
		if(src == cadastraAgencia) {
			cadastrarCCA.cadastrarAgencia(0);
		}
		if(src == refreshAgencia) {
			listaAgenciasCadastradas.setListData(listaAgencia=cadastrarCCA.vetorAgencia());			
			listaAgenciasCadastradas.updateUI();	
		}
	}
	//Captura eventos relacionados aos JLists
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if(e.getValueIsAdjusting() && src == listaCarrosCadastrados) {
			cadastrarCCA.cadastrarCarro(listaCarrosCadastrados.getSelectedIndex()); 
		}
		if(e.getValueIsAdjusting() && src == listaClassesCadastradas) {
			cadastrarCCA.editarClasse(listaClassesCadastradas.getSelectedIndex());
		}
		if(e.getValueIsAdjusting() && src == listaAgenciasCadastradas) {
			cadastrarCCA.cadastrarAgencia(listaAgenciasCadastradas.getSelectedIndex());
		}
		if(e.getValueIsAdjusting() && src == listaCarrosReserva) {
			int ncarro = listaCarrosReserva.getSelectedIndex();
			String nomecarro= listaCarross[ncarro]; 
			cadastrarCCA.verCarro(listaCarrosReserva.getSelectedIndex(), NCReserva, NAReserva, nconta, nomecarro);
			fecharjanela();
		}
	}
	public void fecharjanela() {
		janela.dispose();
	}
}
