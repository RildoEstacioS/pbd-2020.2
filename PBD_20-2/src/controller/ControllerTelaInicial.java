package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import facade.Facade;
import model.Cliente;
import view.PanelCadastrarCliente;
import view.TelaInicial;

public class ControllerTelaInicial implements ActionListener{

	TelaInicial telaInicial;
	PanelCadastrarCliente panelCadastrarCliente;
	Facade facade;
	

	
	public ControllerTelaInicial(TelaInicial telaInicial, PanelCadastrarCliente panelCadastrarCliente, Facade facade) {
		super();
		this.telaInicial = telaInicial;
		this.facade = facade;
		control();
		
	}
	
	public void control() {
		telaInicial.getClienteCadastrarMenuItem().addActionListener(this);
		telaInicial.getBuscarClienteMenuItem().addActionListener(this);
		telaInicial.getBuscarCliente().getBotaoConfirmarBusca().addActionListener(this);
		telaInicial.getPanelCadastrarCliente().getBotaoConfirmar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource().equals(telaInicial.getPanelCadastrarCliente().getBotaoConfirmar())) {
			try {
				
				System.out.println((Double.parseDouble((telaInicial.getPanelCadastrarCliente().getValorFTF().getText()).substring(3)) + 12));


				facade.salvarCliente(new Cliente(telaInicial.getPanelCadastrarCliente().getNomeTF().getText(),
												 telaInicial.getPanelCadastrarCliente().getCpfTF().getText(),
												 telaInicial.getPanelCadastrarCliente().getTelefoneTF().getText(),
												 telaInicial.getPanelCadastrarCliente().getCelularTF().getText(),
												 String.valueOf(telaInicial.getPanelCadastrarCliente().getTipoClienteCB().getSelectedItem()) ,
												 telaInicial.getPanelCadastrarCliente().getRuaTF().getText() + "" + telaInicial.getPanelCadastrarCliente().getNumeroTF().getText(),
												 telaInicial.getPanelCadastrarCliente().getDataEntradaFTF().getText(),
												 telaInicial.getPanelCadastrarCliente().getDataSaidaFTF().getText(),
												 Double.parseDouble((telaInicial.getPanelCadastrarCliente().getValorFTF().getText()).substring(3))));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if (e.getSource().equals(telaInicial.getClienteCadastrarMenuItem())) {
			telaInicial.cardLayout.show(telaInicial.getCardLayoutPanel(), "cadastrarCliente");
		}
		
		if (e.getSource().equals(telaInicial.getBuscarClienteMenuItem())) {
			telaInicial.cardLayout.show(telaInicial.getCardLayoutPanel(), "buscarCliente");
		}
		
		if (e.getSource().equals(telaInicial.getBuscarCliente().getBotaoConfirmarBusca())) {
			
			Cliente c = null;
			
			try {
				System.out.println(telaInicial.getBuscarCliente().getBuscarCpfTF().getText().isEmpty());
				if (telaInicial.getBuscarCliente().getBuscarCpfTF().getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Campos em branco");
					return ;
				}else{
					c = this.facade.buscarCliente(telaInicial.getBuscarCliente().getBuscarCpfTF().getText());
					System.out.println(this.facade.buscarCliente(telaInicial.getBuscarCliente().getBuscarCpfTF().getText()));
					if (c == null) {
						JOptionPane.showMessageDialog(null, "Cliente não encontrado");
						return;
					}else {
						telaInicial.getBuscarCliente().inserirDados(c.getNome(), c.getCpf_cnpj(), c.getTelefone(), c.getCelular(), c.getTipoCliente(), c.getEndereco(), c.getDataEntrada(), c.getDataSaida(), c.getValor());
						telaInicial.getBuscarCliente().ativarCampos();					
					}
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		
	}
	
	
}
