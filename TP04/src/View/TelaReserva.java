package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * Cria a interface que o usuario deve digitar um numero valido da sua conta para prosseguir,
 * e tambem passa dados adiante por questão de logistica
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class TelaReserva implements ActionListener{
	private TelaVerReserva tVerReserva= new TelaVerReserva();
	private JFrame janela;
	private JLabel labelNumero = new JLabel("Digite o numero da sua conta: ");
	private JTextField valorNumero;
	private JButton botaoproximo = new JButton("Proximo");
	
	/**
	 * Constroe a interface
	 */
	public void verTelaReserva() {
		
		janela = new JFrame("Reserva");
		valorNumero= new JTextField(3);
		labelNumero.setBounds(5, 20, 250, 25);
		valorNumero.setBounds(5, 50, 150, 25);
		botaoproximo.setBounds(170, 50, 75, 30);
		
		janela.add(labelNumero);
		janela.add(valorNumero);
		janela.add(botaoproximo);
		
		janela.setLayout(null);
		
		janela.setSize(280, 130);
		janela.setVisible(true);
		botaoproximo.addActionListener(this);
		
	}
	/**
	 * metodo que recebe a ação do usuario, quando ele aperta o botão
	 */
	public void actionPerformed(ActionEvent e) {
		Object escolha = e.getSource();
		if(escolha== botaoproximo) {
			int nconta = Integer.parseInt(valorNumero.getText());
			if(tVerReserva.testeConta(nconta)==true) {//teste para ver se a conta existe
				tVerReserva.reserva(nconta);
				
			}else mensagemErroConta();
		}
	}
	/**
	 * Uma mensagem de erro se o usuario digitar um numero de uma conta inexistente
	 */
	public void mensagemErroConta() {
		
		JOptionPane.showMessageDialog(null,"ERRO, CONTA INEXISTENTE!\n ", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//passagem de dados
	public void verTelaConta() {
		tVerReserva.verTelaConta();
	}
	public void verCarros() {
		tVerReserva.verCarros();
	}
	public void verClasse() {
		tVerReserva.verClasse();
	}
	public void verAgencia() {
		tVerReserva.verAgencia();;
	}
	public void dadospreCCA() {
		tVerReserva.dadospreCCA();
	}
	public void dadospreConta() {
		tVerReserva.dadospreConta();
	}
	public void funcoesCadastradas() {
		tVerReserva.funcoesCadastradas();
	}
}
