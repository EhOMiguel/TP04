package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**Nessa classe o usario entra em outro menu, referente a conta
 * 
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class TelaConta implements ActionListener {
	private TelaEditar teditar = new TelaEditar();
	private static JFrame janela;
	private static JLabel titulo = new JLabel ("Conta");
	private static JButton cadastrar = new JButton ("Cadastrar");
	private static JButton editar = new JButton ("Editar");
	private static JButton excluir= new JButton ("Excluir");
	private static JButton voltar = new JButton ("Voltar");
	public void dadospre() {
		teditar.dadospre();	
	}
	/**
	 * Chama um metodo para vereficar se o numero da conta que o usuario digitou é valido
	 * @param nconta int numero da conta que o usuario digitou
	 * @return true se o numero for de uma conta existente e false se for de uma conta inexistente
	 */
	public boolean testeConta(int nconta) {
			boolean teste=teditar.testeConta(nconta);
			return teste;
	}
	/**
	 * Cria a interface com o menu da conta, possui 4 botões cadastrar, editar, excluir e voltar
	 */
	public void verTelaConta() {
		
		int escolhap=0;
		
		janela = new JFrame("Conta");
		titulo.setFont(new Font("arial", Font.BOLD, 20));
		titulo.setBounds(100, 10, 160, 20);
		cadastrar.setBounds(20, 50, 100, 40);
		editar.setBounds(20, 100, 100, 40);
		excluir.setBounds(140, 50, 100, 40);
		voltar.setBounds(140, 100, 100, 40);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(cadastrar);
		janela.add(editar);
		janela.add(excluir);
		janela.add(voltar);
		
		janela.setSize(300, 200);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
		janela.setVisible(true);
		
		cadastrar.addActionListener(this);
		editar.addActionListener(this);
		excluir.addActionListener(this);
		voltar.addActionListener(this);	
	}
	//Recebe as ações dos botões
	public void actionPerformed(ActionEvent e) {
		Object escolha = e.getSource();
	
		if(escolha == cadastrar) {
			teditar.cadastrarPessoa();
		}
		if(escolha == editar) {
			
			teditar.editarPessoa();
		}
		if(escolha == excluir) {
			teditar.excluirPessoa();
		}
		if(escolha == voltar) {
			janela.dispose();
		}
	}
}
