package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 * Cria a interface que contem im JList com a reseva ativa do ususario caso ele possua,
 * ou da a opção do usuario criar uma nova reserva e recarregar a lista de reservas ativas.
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class TelaVerReserva implements ActionListener, ListSelectionListener {
	private TelaReservaAgencia tra = new TelaReservaAgencia();
	//atributos
	private String temp;
	private int nconta;
	private JFrame janela;
	private JLabel titulo;
	private JButton novaReserva;
	private JButton refreshReserva;
	private JList<String> listaReservaAtiva;

	private String[] templistaReservas = new String[100];//Vetor auxiliar para o vetor listaReserva
	private String[] listaReserva = new String[100];// Vetor que vai receber o vetor reservas lá da classe de controle dados
	/**
	 * metodo que recebe um vetor com as contas que possuem reservas ativas,
	 * e assim filtra, para saber se o usuario que esta tentando criar uma nova reserva, ja possue alguma reserva ativa
	 * @return Vetor que volta com o numero da reserva ativa do usuario caso ele possua, se não possuir ele volta vazio
	 */
	public String[] listaReservas() {
		templistaReservas= tra.listaReservas();
		for(int x=1;x<100;x++) {
		temp=templistaReservas[x];//vetor templistaReservas passa para a String temp o numero da conta de quem tem reserva ativa
			if(temp!=null) {//caso não tenha numero ele não entra
				if(temp.equals(Integer.toString(nconta))==true) {//se tiver numero ele entra e compara com o numero da conta do usario
					listaReserva[x]="Reserva ativa";//se for igual ele salva no vetor que o usario ja possue uma reseva ativa
					x=100;//encerra o for
				}else listaReserva[x]=null;
			}else listaReserva[x]=null;
		}
		return listaReserva;
	}
	/**
	 * interface que o usario deve decidir se quer criar uma nova reserva ou se que ver a reserva ja ativa, 
	 * cada usario so pode ter uma reserva ativa de cada vez
	 * @param nc
	 */
	public void reserva(int nc) {
		nconta=nc;
		listaReserva=listaReservas();
		listaReservaAtiva = new JList<String>(listaReserva);
		janela = new JFrame("Reservas");
		titulo = new JLabel("Reserva Ativa");
		novaReserva = new JButton("Nova reserva");
		refreshReserva = new JButton("Refresh");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(125, 10, 260, 35);
		listaReservaAtiva.setBounds(20, 51, 350, 20);
		listaReservaAtiva.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaReservaAtiva.setVisibleRowCount(1);

		novaReserva.setBounds(60, 80, 120, 30);
		refreshReserva.setBounds(200, 80, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaReservaAtiva);
		janela.add(novaReserva);
		janela.add(refreshReserva);

		janela.setSize(400, 180);
		janela.setVisible(true);

		refreshReserva.addActionListener(this);
		novaReserva.addActionListener(this);
		listaReservaAtiva.addListSelectionListener(this);	
	}
	/*
	 * recebe eventos relacionados aos botões da interface
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == novaReserva) {
			boolean teste=false;
			teste = tra.testereserva(nconta);
			if(teste==false) {
				tra.verAgenciasReserva(nconta);
			}else mensagemReservaAtiva();
				
			
		}
		if(src == refreshReserva) {
			listaReservaAtiva.setListData(listaReserva=listaReservas());			
			listaReservaAtiva.updateUI();	
		}
		
	}
	//recebe eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		if(e.getValueIsAdjusting() && src == listaReservaAtiva) {
			tra.verReservaAtiva(listaReservaAtiva.getSelectedIndex(), nconta); 
		}
	}
	

	
	
	
	
	
	/*
	 *mensagem caso o usario tente criar uma reserva nova mas ja tendo uma ativa 
	 */
	public void mensagemReservaAtiva() {
		JOptionPane.showMessageDialog(null, "Voce ja possui uma reserva ativa", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//passagem de dados
	public boolean testeConta(int nconta) {
		boolean teste=tra.testeConta(nconta);
		return teste;
	}
	public void verTelaConta() {
		tra.verTelaConta();
	}
	public void verCarros() {
		tra.verCarros();
	}
	public void verClasse() {
		tra.verClasse();
	}
	public void verAgencia() {
		tra.verAgencia();;
	}
	public void dadospreCCA() {
		tra.dadospreCCA();
	}
	public void dadospreConta() {
		tra.dadospreConta();
	}
	public void funcoesCadastradas() {
		tra.funcoesCadastradas();
	}
}
