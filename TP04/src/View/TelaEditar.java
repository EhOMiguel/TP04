package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * Classe referente a editar conta caso o usuario aperte esse botão no menu da conta
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class TelaEditar implements ActionListener {
	
	private TelaCadastrarPessoa cpessoa = new TelaCadastrarPessoa();
	private JLabel labelNumero = new JLabel("Numero da conta\n que deseja editar: ");
	private JTextField valorNumero;
	private JButton botaoproximo = new JButton("Proximo");
	private JFrame janela;
	public void dadospre() {
		cpessoa.pessoasCadastradas();	
	}
	public void cadastrarPessoa() {
		cpessoa.cadastrarPessoa();
	}
	public void excluirPessoa() {
		cpessoa.excluirPessoa();
	}
	public boolean testeConta(int nconta) {
		boolean teste=cpessoa.testeConta(nconta);
		return teste;
	}
	/**
	 * Cria a interface que o usuario deve inserir o numero da conta que deseja editar
	 */
	public void editarPessoa() {
		
		janela = new JFrame("Editar Conta");
		valorNumero= new JTextField(3);
		labelNumero.setBounds(5, 20, 250, 25);
		valorNumero.setBounds(5, 50, 150, 25);
		botaoproximo.setBounds(170, 50, 75, 30);
		
		this.janela.add(labelNumero);
		this.janela.add(valorNumero);
		this.janela.add(botaoproximo);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(280, 130);
		this.janela.setVisible(true);
		botaoproximo.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Object escolha = e.getSource();
		if(escolha== botaoproximo) {
			int nconta = Integer.parseInt(valorNumero.getText());
			cpessoa.editarPessoa(nconta);
		}
	}
}
