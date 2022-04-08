 package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

import Controller.ControleDados;
/**
 * Uma classe de cadastro de funçoes 
 * @author Miguel
 * @version 0.1 (Abril 2022)
 */
public class TelaFuncoes implements ActionListener {
	private ControleDados control = new ControleDados();
	private JCheckBox arCondicionado = new JCheckBox("Ar Condicionado");
	private JCheckBox travaEletrica = new JCheckBox("Trava Eletrica");
	private JCheckBox vidroEletrico = new JCheckBox("Vidro Eletrico");
	private JCheckBox direcaoHidraulica = new JCheckBox("Direcao Hidraulica");
	private JCheckBox airbag = new JCheckBox("Airbag");
	private JCheckBox abs = new JCheckBox("Abs");

	private JFrame janela;
	private JButton botaoCadastrar = new JButton("Cadastrar");
	/**
	 * Nesse metodo o usuario tera uma serie de JCheckBox e deve marcar as check box referente as funçoes que o carro possui
	 */
	public void escolherFuncoes() {
		janela = new JFrame ("Escolher funcoes");
		abs.setBounds(0, 0, 60, 25);
		airbag.setBounds(0, 25, 130, 25);
		travaEletrica.setBounds(0, 50, 130, 25);
		vidroEletrico.setBounds(0, 75, 130, 25);
		direcaoHidraulica.setBounds(0, 100, 130, 25);
		arCondicionado.setBounds(0, 125, 130, 25);
		
		botaoCadastrar.setBounds(160, 128, 115, 30);
		
		this.janela.add(abs);
		this.janela.add(airbag);
		this.janela.add(travaEletrica);
		this.janela.add(vidroEletrico);
		this.janela.add(direcaoHidraulica);
		this.janela.add(arCondicionado);
		this.janela.add(botaoCadastrar);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(300, 200);
		this.janela.setVisible(true);
		
		abs.addActionListener(this);
		airbag.addActionListener(this);
		travaEletrica.addActionListener(this);
		vidroEletrico.addActionListener(this);
		direcaoHidraulica.addActionListener(this);
		arCondicionado.addActionListener(this);
		botaoCadastrar.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		boolean abss=false, airbagg=false, travaeletrica=false, vidroeletrico=false, direcaohidraulica=false, arcondicionado=false;
		if(src == botaoCadastrar) {
				if(abs.isSelected()==true) abss=true;
				if(airbag.isSelected()==true) airbagg=true;
				if(travaEletrica.isSelected()==true) travaeletrica=true;
				if(vidroEletrico.isSelected()==true) vidroeletrico=true;
				if(direcaoHidraulica.isSelected()==true) direcaohidraulica=true;
				if(arCondicionado.isSelected()==true) arcondicionado=true;
				control.cadastrarFuncao(abss, airbagg, travaeletrica, vidroeletrico, direcaohidraulica, arcondicionado);
				mensagemSucessoCadastro();
		}
	}
	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Funcoes atribuidas com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	public boolean rArCondicionado(int ncarro) {
		boolean arc;
		return arc=control.rArCondicionado(ncarro);
	}
	public boolean rDirecaoHidraulica(int ncarro) {	
		boolean dh;
		return dh=control.rDirecaoHidraulica(ncarro);
	}
	public boolean rVidroEletrico(int ncarro) {
		boolean ve;
		return ve=control.rVidroEletrico(ncarro);
	}
	public boolean rTravaEletrica(int ncarro) {
		boolean te;		
		return te=control.rTravaEletrica(ncarro);
	}
	public boolean rAirbag(int ncarro) {
		boolean ab;
		return ab=control.rAirbag(ncarro);
	}
	public boolean rAbs(int ncarro) {
		boolean abs;
		return abs=control.rAbs(ncarro);
	}
	public void funcoesCadastradas() {
		control.funcoesCadastradas();
	}
}
