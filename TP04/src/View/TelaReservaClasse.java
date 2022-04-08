package View;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 * Usuario deve escolher a classe referente ao carro que deseja escolher
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class TelaReservaClasse implements ListSelectionListener {
	private TelaCCA tcca = new TelaCCA();
	private TelaConta tconta = new TelaConta();

	private int nAgenciaReserva, nconta;
	private JFrame janela;
	private JLabel titulo;
	private JList<String> listaClassesCadastradas;

	private String[] listaClasse = new String[999];
	
	public String[] listaReservas() {//passagem de dados
		return tcca.listaReservas();
	}
	public String[] vetorAgencia() {//passagem de dados
		return tcca.vetorAgencia();	
	}
	/**
	 * interface com lista das classes cadastradas, usuario deve escolher uma
	 * @param nar int com o numero da agencia que o usuario escolheu
	 * @param nc int com o numero da conta do usuario
	 */
	public void reservaClasses(int nar, int nc) {
			nconta=nc;
			nAgenciaReserva=nar;
			listaClasse=tcca.vetorClasse();//chama o vetor com as classes cadastradas
			listaClassesCadastradas = new JList<String>(listaClasse);
			janela = new JFrame("Reserva");
			titulo = new JLabel("Escolha a classe do carro:");
		
			titulo.setFont(new Font("Arial", Font.BOLD, 15));
			titulo.setBounds(30, 10, 300, 35);
			listaClassesCadastradas.setBounds(20, 51, 350, 120);
			listaClassesCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClassesCadastradas.setVisibleRowCount(10);
		
			janela.setLayout(null);
		
			janela.add(titulo);
			janela.add(listaClassesCadastradas);
		
			janela.setSize(400, 250);
			janela.setVisible(true);
		
			listaClassesCadastradas.addListSelectionListener(this);
		}
		

		//recebe as açoes referentes ao JList
	public void valueChanged(ListSelectionEvent e) {
			Object src = e.getSource();
			if(e.getValueIsAdjusting() && src == listaClassesCadastradas) {
				tcca.escolherCarro (listaClassesCadastradas.getSelectedIndex(), nAgenciaReserva, nconta);
			}
		}
			
	//passagem de dados
	public void verReservaAtiva(int numeroReserva, int nconta) {
		tcca.verReservaAtiva(numeroReserva, nconta);
	}
	
	
	public boolean testeConta(int nconta) {
		boolean teste=tconta.testeConta(nconta);
		return teste;
	}
	public void verTelaConta() {
		tconta.verTelaConta();
	}
	public void verCarros() {
		tcca.verCarros();
	}
	public void verClasse() {
		tcca.verClasse();
	}
	public void verAgencia() {
		tcca.verAgencia();;
	}
	public void dadospreCCA() {
		tcca.dadospre();
	}
	public void dadospreConta() {
		tconta.dadospre();
	}
	public void funcoesCadastradas() {
		tcca.funcoesCadastradas();
	}
	public boolean testereserva(int nconta) {
		
		boolean testeR = tcca.testereserva(nconta);
		return testeR;
	}
}
