package View;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 * Aqui o usuario começa a criar uma nova reserva escolhendo primeiro a agencia que deseja buscar seu carro
 * 
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class TelaReservaAgencia implements ListSelectionListener {
	private TelaReservaClasse trc = new TelaReservaClasse();
	private int nconta;//numero da conta do usuario
	private String[] listaAgencias = new String[999];//vetor com o nome das agencias cadastradas
	/**
	 * metodo que busca o vetor na classe controleDados, vetor que contem a lista de agencias cadastradas  
	 * @return
	 */
	public String[] vetorAgencias() {
		return listaAgencias=trc.vetorAgencia();	
	}
	public String[] listaReservas() {//passagem de dados para outra classe
		return trc.listaReservas();
	}
	
	private JFrame janela;
	private JLabel titulo;
	private JList<String> listaAgenciasCadastradas;
	
	
	/**
	 * interface que contem a lista de agencias cadastradas para assim o usuario escolher a agencia que deseja
	 * @param nc int numero da conta do usuario esta fazendo uma nova reserva
	 */
	public void verAgenciasReserva(int nc) {
		nconta=nc;
		listaAgencias=vetorAgencias();
		listaAgenciasCadastradas = new JList<String>(listaAgencias);
		janela = new JFrame("Reserva");
		titulo = new JLabel("Escolha uma agencia para buscar o carro:");
	
		titulo.setFont(new Font("Arial", Font.BOLD, 15));
		titulo.setBounds(30, 10, 300, 35);
		listaAgenciasCadastradas.setBounds(20, 51, 350, 120);
		listaAgenciasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaAgenciasCadastradas.setVisibleRowCount(10);
	
		janela.setLayout(null);
	
		janela.add(titulo);
		janela.add(listaAgenciasCadastradas);
	
		janela.setSize(400, 250);
		janela.setVisible(true);
	
		listaAgenciasCadastradas.addListSelectionListener(this);
	}
	

	//recebe eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if(e.getValueIsAdjusting() && src == listaAgenciasCadastradas) {
			trc.reservaClasses(listaAgenciasCadastradas.getSelectedIndex(), nconta);
			fecharjanela();
		}
	}
	public void verReservaAtiva(int numeroReserva, int nconta) {//passagem de dados
		trc.verReservaAtiva(numeroReserva, nconta);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//passagem de dados	
	public boolean testeConta(int nconta) {
		boolean teste=trc.testeConta(nconta);
		return teste;
	}
	public void verTelaConta() {
		trc.verTelaConta();
	}
	public void verCarros() {
		trc.verCarros();
	}
	public void verClasse() {
		trc.verClasse();
	}
	public void verAgencia() {
		trc.verAgencia();;
	}
	public void dadospreCCA() {
		trc.dadospreCCA();
	}
	public void dadospreConta() {
		trc.dadospreConta();
	}
	public void funcoesCadastradas() {
		trc.funcoesCadastradas();
	}
	public boolean testereserva(int nconta) {
		
		boolean testeR = trc.testereserva(nconta);
		return testeR;
	}
	public void fecharjanela() {
		janela.dispose();
	}
}
