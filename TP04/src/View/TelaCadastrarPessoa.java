 package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.ControleDados;
/**
 * Nessa classe o usario vai fazer o cadastro da sua conta ou editar a sua conta ou excluir a sua conta
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class TelaCadastrarPessoa implements ActionListener {
	private  ControleDados control = new ControleDados();
	private int numeroconta, ncontaeditar;
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelEmail = new JLabel("Email: ");
	private JTextField valorEmail;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelCNH = new JLabel("CNH: ");
	private JTextField valorCNH;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorDDD;
	private JTextField valorTelefone;
	private JButton botaoSalvar = new JButton("Salvar");
	private JButton botaoSalvar2 = new JButton("Salvar");
	private JLabel labelNumero = new JLabel("Numero da conta\n que deseja excluir: ");
	private JTextField valorNumero;
	private JButton botaoExcluir = new JButton("Excluir");
	public void pessoasCadastradas() {
		control.pessoasCadastradas();
	}
	public boolean testeConta(int nconta) {
		boolean teste=control.testeConta(nconta);
		return teste;
	}
	/**
	 * Nesse metodo se cria uma interface que o usuario pode ver os dados da sua conta e editar caso queira
	 * @param Nconta int numero da conta que o usuario vai editar
	 */
	public void editarPessoa(int Nconta) {
		janela = new JFrame("Cadastradar novo usuario");
		valorNome = new JTextField(control.ContaNome(Nconta),200);
		valorEmail = new JTextField(control.ContaEmail(Nconta),200);
		valorCPF = new JTextField(control.ContaCPF(Nconta),200);
		valorCNH = new JTextField(control.ContaCNH(Nconta),200);
		valorDDD = new JTextField(control.ContaDDD(Nconta),3);
		valorTelefone = new JTextField(control.ContaNumero(Nconta),10);
		ncontaeditar= Nconta;
		
		botaoSalvar2.setBounds(245, 175, 115, 30);
		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEmail.setBounds(30, 50, 180, 25);
		valorEmail.setBounds(180, 50, 180, 25);		
		labelCPF.setBounds(30, 80, 150, 25);
		valorCPF.setBounds(180, 80, 180, 25);
		labelCNH.setBounds(30, 110, 150, 25);
		valorCNH.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 155, 25);
		valorDDD.setBounds(180, 140, 28, 25);
		valorTelefone.setBounds(210, 140, 65, 25);
		
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEmail);
		this.janela.add(valorEmail);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelCNH);
		this.janela.add(valorCNH);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar2);

		this.janela.setLayout(null);

		this.janela.setSize(400, 350);
		this.janela.setVisible(true);

		botaoSalvar2.addActionListener(this);
		}
	/**
	 * Nesse metodo se cria uma interface que o usuario deve digitar o numero da conta que deseja excluir
	 */
	public void excluirPessoa(){
		janela = new JFrame("Excluir conta");
		valorNumero= new JTextField(3);
		labelNumero.setBounds(5, 20, 250, 25);
		valorNumero.setBounds(5, 50, 150, 25);
		botaoExcluir.setBounds(170, 50, 75, 30);
		
		this.janela.add(labelNumero);
		this.janela.add(valorNumero);
		this.janela.add(botaoExcluir);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(280, 130);
		this.janela.setVisible(true);
		botaoExcluir.addActionListener(this);
	}
	/**
	 * Nesse metodo se cria a interface de cadastro onde o usuario deve preencher os JTextFields com os seus dados
	 */
	public void cadastrarPessoa(){
	
	janela = new JFrame("Cadastradar novo usuario");
	valorNome = new JTextField(200);
	valorEmail = new JTextField(200);
	valorCPF = new JTextField(200);
	valorCNH = new JTextField(200);
	valorDDD = new JTextField(3);
	valorTelefone = new JTextField(10);

	botaoSalvar.setBounds(245, 175, 115, 30);
	

	labelNome.setBounds(30, 20, 150, 25);
	valorNome.setBounds(180, 20, 180, 25);
	labelEmail.setBounds(30, 50, 180, 25);
	valorEmail.setBounds(180, 50, 180, 25);		
	labelCPF.setBounds(30, 80, 150, 25);
	valorCPF.setBounds(180, 80, 180, 25);
	labelCNH.setBounds(30, 110, 150, 25);
	valorCNH.setBounds(180, 110, 180, 25);
	labelTelefone.setBounds(30, 140, 155, 25);
	valorDDD.setBounds(180, 140, 28, 25);
	valorTelefone.setBounds(210, 140, 65, 25);

	botaoSalvar.setBounds(245, 255, 115, 30);
	
	this.janela.add(labelNome);
	this.janela.add(valorNome);
	this.janela.add(labelEmail);
	this.janela.add(valorEmail);
	this.janela.add(labelCPF);
	this.janela.add(valorCPF);
	this.janela.add(labelCNH);
	this.janela.add(valorCNH);
	this.janela.add(labelTelefone);
	this.janela.add(valorDDD);
	this.janela.add(valorTelefone);
	this.janela.add(botaoSalvar);

	this.janela.setLayout(null);

	this.janela.setSize(400, 350);
	this.janela.setVisible(true);

	botaoSalvar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
					String nome = valorNome.getText();
					String email = valorEmail.getText();
					String cpf = valorCPF.getText();
					String cnh = valorCNH.getText();
					int nteste = testes(email, cnh, cpf);
					if(nteste==3) {
						int ddd = Integer.parseInt(valorDDD.getText());
						int telefone = Integer.parseInt(valorTelefone.getText());
						int nconta = control.cadastrarPessoa(cpf, nome, email, ddd, telefone, cnh);
						numeroconta= nconta;
						mensagemSucessoCadastro();
					}else mensagemErroCadastro();
			}catch (NullPointerException exc1) {
				mensagemErroCadastro();
			}catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}	
		}
		if(src == botaoExcluir) {
			try {
				boolean tentativa=false;
				int nconta = Integer.parseInt(valorNumero.getText());
				tentativa = control.excluirpessoa(nconta);
				if(tentativa == true )mensagemSucessoExcluir();
				if(tentativa != true )mensagemErroExcluir();
			}catch (NullPointerException exc1) {
				mensagemErroExcluir();
			}catch (NumberFormatException exc2) {
				mensagemErroExcluir();
			}
		}
		if(src == botaoSalvar2) {
			
			String nome = valorNome.getText();
			String email = valorEmail.getText();
			String cpf = valorCPF.getText();
			String cnh = valorCNH.getText();
			int nteste = testes(email, cnh, cpf);
			if(nteste==3) {
				int ddd = Integer.parseInt(valorDDD.getText());
				int telefone = Integer.parseInt(valorTelefone.getText());
				control.editarConta(cpf, nome, email, ddd, telefone, cnh, ncontaeditar );
				mensagemSucessoeditar();
			}else mensagemErroCadastro();
		}
	}
	/**
	 * Nesse metodo uma serie de testes sera realizado para validar o email, a CNH e o CPF do usuario
	 * @param email String email de cadastro do usuario
	 * @param CNH String numero de CNH do usuario
	 * @param cpf String CPF do usuario
	 * @return um int que soma um total de 3 pontos, 1 ponto para cada teste aprovado, caso passe nos 3 testes
	 */
	public int testes( String email, String CNH, String cpf) {
		int teste=0;
		if(email.contains("@")) teste=teste+1;
		if(email.startsWith("@")) teste=teste-1;
		if(CNH.length()==11) teste=teste+1;
		if(cpf.length()==11) teste=teste+1;
		return teste;
	}
	public void mensagemErroCadastro() {
		
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos 3 erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. Telefone pode nao conter apenas numeros\n"
				+ "3. Nem todos os campos podem estar preenchidos corretamente\n", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!\n O numero da sua conta e: "+numeroconta, null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	public void mensagemErroExcluir() {
		
		JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR OS DADOS!\n "
				+ "Pode ter ocorrido o erros a seguir:  \n"
				+ "1. Verifique se o numero da conta está correto \n", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	public void mensagemSucessoExcluir() {
		JOptionPane.showMessageDialog(null, "Conta excluida com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	public void mensagemSucessoeditar() {
		JOptionPane.showMessageDialog(null, "Conta editada com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}



}
