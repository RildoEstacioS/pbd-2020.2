package view;

import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class BuscarClientePanel extends JPanel {

	private JFormattedTextField buscarCpfTF;
	private JButton botaoConfirmarBusca;
	private JLabel nomeLabel, telefoneLabel, celularLabel, tipoClienteLabel, enderecoLabel, dataEntradaLabel, dataSaidaLabel, valorLabel;
	
	/**
	 * Create the panel.
	 */
	public BuscarClientePanel() {
		setBackground(new Color(245, 255, 250));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar Cliente:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 160, 29);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o CPF do cliente:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 96, 201, 24);
		add(lblNewLabel_1);
		
		try {
			buscarCpfTF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buscarCpfTF.setFont(new Font("Times New Roman", Font.BOLD, 20));
		buscarCpfTF.setBounds(221, 93, 160, 30);
		add(buscarCpfTF);
		
		botaoConfirmarBusca = new JButton("Confirmar");
		botaoConfirmarBusca.setFont(new Font("Times New Roman", Font.BOLD, 20));
		botaoConfirmarBusca.setBounds(513, 92, 129, 33);
		add(botaoConfirmarBusca);
		
		nomeLabel = new JLabel("Nome: ");
		nomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		nomeLabel.setBounds(10, 164, 411, 29);
		add(nomeLabel);
		
		telefoneLabel = new JLabel("Telefone:");
		telefoneLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		telefoneLabel.setBounds(10, 204, 411, 29);
		add(telefoneLabel);
		
		celularLabel = new JLabel("Celular:");
		celularLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		celularLabel.setBounds(10, 244, 411, 29);
		add(celularLabel);
		
		tipoClienteLabel = new JLabel("Tipo de Cliente:");
		tipoClienteLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		tipoClienteLabel.setBounds(10, 284, 411, 29);
		add(tipoClienteLabel);
		
		enderecoLabel = new JLabel("Endere\u00E7o: ");
		enderecoLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		enderecoLabel.setBounds(10, 324, 744, 29);
		add(enderecoLabel);
		
		dataEntradaLabel = new JLabel("Data de Entrada:");
		dataEntradaLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		dataEntradaLabel.setBounds(512, 164, 242, 29);
		add(dataEntradaLabel);
		
		dataSaidaLabel = new JLabel("Data de Saida:");
		dataSaidaLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		dataSaidaLabel.setBounds(512, 204, 242, 29);
		add(dataSaidaLabel);
		
		valorLabel = new JLabel("Valor:");
		valorLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		valorLabel.setBounds(512, 253, 242, 29);
		add(valorLabel);

		desativarCampos();
		
	}
	
	public void desativarCampos() {
		nomeLabel.setVisible(false);
		telefoneLabel.setVisible(false);
		celularLabel.setVisible(false);
		tipoClienteLabel.setVisible(false);
		enderecoLabel.setVisible(false);
		dataEntradaLabel.setVisible(false);
		dataSaidaLabel.setVisible(false);
		valorLabel.setVisible(false);
		
		nomeLabel.setText("Nome: ");
		telefoneLabel.setText("Telefone: ");
		celularLabel.setText("Celular: ");
		tipoClienteLabel.setText("Tipo de Cliente: ");
		enderecoLabel.setText("Endereço: ");
		dataEntradaLabel.setText("Data de Entrada: ");
		dataSaidaLabel.setText("Data de Saida: ");
		valorLabel.setText("Valor: ");
		
	}
	
	public void ativarCampos() {
		nomeLabel.setVisible(true);
		telefoneLabel.setVisible(true);
		celularLabel.setVisible(true);
		tipoClienteLabel.setVisible(true);
		enderecoLabel.setVisible(true);
		dataEntradaLabel.setVisible(true); 
		dataSaidaLabel.setVisible(true); 
		valorLabel.setVisible(true);
	}

	
	public void inserirDados(String nome, String cpf_cnpj, String telefone, String celular, String tipoCliente,
			String endereco, String dataEntrada, String dataSaida, double valor) {
		nomeLabel.setText(" " + nomeLabel.getText() + nome);
		telefoneLabel.setText(" " + telefoneLabel.getText() + telefone);
		celularLabel.setText(" " + celularLabel.getText() + celular);
		tipoClienteLabel.setText(" " + tipoClienteLabel.getText() + tipoCliente);
		enderecoLabel.setText(" " +  enderecoLabel.getText() + endereco);
		dataEntradaLabel.setText(" " +  dataEntradaLabel.getText() + dataEntrada);
		dataSaidaLabel.setText(" " + dataSaidaLabel.getText() +  dataSaida);
		valorLabel.setText(" " + valorLabel.getText() + valor + "");
	}
	public JFormattedTextField getBuscarCpfTF() {
		return buscarCpfTF;
	}

	public void setBuscarCpfTF(JFormattedTextField buscarCpfTF) {
		this.buscarCpfTF = buscarCpfTF;
	}

	public JButton getBotaoConfirmarBusca() {
		return botaoConfirmarBusca;
	}

	public void setBotaoConfirmarBusca(JButton botaoConfirmarBusca) {
		this.botaoConfirmarBusca = botaoConfirmarBusca;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public void setNomeLabel(JLabel nomeLabel) {
		this.nomeLabel = nomeLabel;
	}

	public JLabel getTelefoneLabel() {
		return telefoneLabel;
	}

	public void setTelefoneLabel(JLabel telefoneLabel) {
		this.telefoneLabel = telefoneLabel;
	}

	public JLabel getCelularLabel() {
		return celularLabel;
	}

	public void setCelularLabel(JLabel celularLabel) {
		this.celularLabel = celularLabel;
	}

	public JLabel getTipoClienteLabel() {
		return tipoClienteLabel;
	}

	public void setTipoClienteLabel(JLabel tipoClienteLabel) {
		this.tipoClienteLabel = tipoClienteLabel;
	}

	public JLabel getEnderecoLabel() {
		return enderecoLabel;
	}

	public void setEnderecoLabel(JLabel enderecoLabel) {
		this.enderecoLabel = enderecoLabel;
	}

	public JLabel getDataEntradaLabel() {
		return dataEntradaLabel;
	}

	public void setDataEntradaLabel(JLabel dataEntradaLabel) {
		this.dataEntradaLabel = dataEntradaLabel;
	}

	public JLabel getDataSaidaLabel() {
		return dataSaidaLabel;
	}

	public void setDataSaidaLabel(JLabel dataSaidaLabel) {
		this.dataSaidaLabel = dataSaidaLabel;
	}

	public JLabel getValorLabel() {
		return valorLabel;
	}

	public void setValorLabel(JLabel valorLabel) {
		this.valorLabel = valorLabel;
	}
	
	
}
