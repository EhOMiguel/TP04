package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Começo do codigo, classe que tem a main do codigo,
 * tela menu porque aqui que o menu é criado. e aqui ja criamos um novo objeto para a TelaReserva.
 * @author Miguel Moreira
 * @version 0.1 (Abril 2022)
 *
 */

public class TelaMenu implements ActionListener {
		private static TelaReserva tReserva = new TelaReserva();
		private static JFrame janela = new JFrame ("Aluguel de Carros");
		private static JLabel titulo = new JLabel ("Menu Principal");
		private static JButton conta = new JButton ("Conta");
		private static JButton reserva = new JButton ("Reserva");
		private static JButton carro= new JButton ("Carro");
		private static JButton classe = new JButton ("Classe");
		private static JButton agencia = new JButton ("Agencia");
		/**
		 * Construtor da tela menu, constroe a interface inteira do Menu com todas as opções que o usuario pode escolher.
		 */
		public TelaMenu() {
			titulo.setFont(new Font("arial", Font.BOLD, 20));
			titulo.setBounds(60, 10, 160, 20);
			conta.setBounds(80, 50, 100, 40);
			reserva.setBounds(80, 100, 100, 40);
			carro.setBounds(80, 150, 100, 40);
			classe.setBounds(80, 200, 100, 40);
			agencia.setBounds(80, 250, 100, 40);
			
			janela.setLayout(null);
			
			janela.add(titulo);
			janela.add(conta);
			janela.add(reserva);
			janela.add(carro);
			janela.add(classe);
			janela.add(agencia);
			
			janela.setSize(280, 350);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);
		}
		/**Main do código:
		 * (tcca)Cadastra os dados pre cadastrados referente a Carro, Classe e Agência.
		 * (tconta)Cadastra os dados pre cadastrados referente a Conta. 
		 * adiciona um ouvinte de ação para cada botão da tela menu.
		 * @param args
		 */
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();//instancia a Tela menu
		tReserva.funcoesCadastradas();//chama o metodo com os dados pre cadastrados
		tReserva.dadospreCCA();//chama o metodo com os dados pre cadastrados
		tReserva.dadospreConta();//chama o metodo com os dados pre cadastrados
		conta.addActionListener(menu); 
		reserva.addActionListener(menu);
		carro.addActionListener(menu);
		classe.addActionListener(menu);
		agencia.addActionListener(menu);
	}
	/**
	 * Classe que coleta as açoes dos botões da tela menu e realiza as determinadas açoes,
	 * como se o usario apertar o botão 'conta' essa classe invoca a tela conta.
	 */
	public void actionPerformed(ActionEvent e) {
		Object escolha = e.getSource();

		if(escolha == conta) {
			tReserva.verTelaConta();
		}
		if(escolha == reserva) {
			tReserva.verTelaReserva();
		}
		if(escolha == carro) {
			tReserva.verCarros();
		}
		if(escolha == classe) {
			tReserva.verClasse();
		} 
		if(escolha == agencia) {
			tReserva.verAgencia();
		}
		
	}

}
