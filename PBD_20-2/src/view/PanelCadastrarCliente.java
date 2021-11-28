package view;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCadastrarCliente extends JPanel {
	private JTextField nomeTF;
	private JFormattedTextField cpfTF;
	private JFormattedTextField telefoneTF;
	private JFormattedTextField celularTF;
	private JTextField ruaTF;
	private JTextField numeroTF;
	private JComboBox tipoClienteCB;
	private JFormattedTextField dataSaidaFTF;
	private JFormattedTextField dataEntradaFTF;
	private JFormattedTextField valorFTF;
	private JButton botaoConfirmar;
	
	private NumberFormat numFormat = new DecimalFormat ( "$ # 0,000.00" );
	private NumberFormatter numFormatter = new NumberFormatter (numFormat);
	
	public PanelCadastrarCliente() {
		setBackground(new Color(245, 255, 250));
		setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Cadastrar Cliente:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 193, 29);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(95, 79, 51, 21);
		add(lblNewLabel_1);
		
		nomeTF = new JTextField();
		nomeTF.setFont(new Font("Times New Roman", Font.BOLD, 15));
		nomeTF.setBounds(170, 76, 487, 28);
		add(nomeTF);
		nomeTF.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cpf:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(95, 117, 34, 21);
		add(lblNewLabel_1_1);
		
		try {
			cpfTF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		cpfTF.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cpfTF.setColumns(10);
		cpfTF.setBounds(170, 111, 184, 27);
		add(cpfTF);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(95, 157, 71, 21);
		add(lblNewLabel_2);
		
		try {
			telefoneTF = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
		} catch (ParseException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		telefoneTF.setFont(new Font("Times New Roman", Font.BOLD, 15));
		telefoneTF.setColumns(10);
		telefoneTF.setBounds(170, 149, 153, 29);
		add(telefoneTF);
		
		JLabel lblNewLabel_2_1 = new JLabel("Celular:");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(95, 197, 62, 21);
		add(lblNewLabel_2_1);
		
		try {
			celularTF = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
		} catch (ParseException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		celularTF.setFont(new Font("Times New Roman", Font.BOLD, 15));
		celularTF.setColumns(10);
		celularTF.setBounds(168, 189, 153, 29);
		add(celularTF);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tipo de Cliente:");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(369, 117, 124, 21);
		add(lblNewLabel_2_2);
		
		tipoClienteCB = new JComboBox();
		tipoClienteCB.setModel(new DefaultComboBoxModel(new String[] {"Pagador", "Especial", "Devedor", "Mal Pagador"}));
		tipoClienteCB.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		tipoClienteCB.setBounds(498, 116, 159, 22);
		add(tipoClienteCB);

		JLabel lblNewLabel_2_3 = new JLabel("Endere\u00E7o");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2_3.setBounds(95, 262, 98, 29);
		add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Rua:");
		lblNewLabel_2_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_3_1.setBounds(95, 302, 37, 21);
		add(lblNewLabel_2_3_1);
		
		ruaTF = new JTextField();
		ruaTF.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ruaTF.setColumns(10);
		ruaTF.setBounds(142, 301, 378, 29);
		add(ruaTF);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("N\u00BA");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_1_1.setBounds(553, 302, 19, 21);
		add(lblNewLabel_2_1_1);
		
		numeroTF = new JTextField();
		numeroTF.setFont(new Font("Times New Roman", Font.BOLD, 15));
		numeroTF.setColumns(10);
		numeroTF.setBounds(582, 301, 75, 29);
		add(numeroTF);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Data de Sa\u00EDda:");
		lblNewLabel_2_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_3_2.setBounds(421, 184, 113, 21);
		add(lblNewLabel_2_3_2);
		
		try {
			dataSaidaFTF = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		dataSaidaFTF.setFont(new Font("Times New Roman", Font.BOLD, 15));
		dataSaidaFTF.setBounds(563, 183, 94, 24);
		add(dataSaidaFTF);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("Data de Entrada:");
		lblNewLabel_2_3_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_3_2_1.setBounds(421, 150, 132, 21);
		add(lblNewLabel_2_3_2_1);
		
		try {
			dataEntradaFTF = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		dataEntradaFTF.setFont(new Font("Times New Roman", Font.BOLD, 15));
		dataEntradaFTF.setBounds(563, 149, 94, 24);
		add(dataEntradaFTF);
		
		JLabel lblNewLabel_2_3_2_1_1 = new JLabel("Valor:");
		lblNewLabel_2_3_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2_3_2_1_1.setBounds(504, 218, 49, 21);
		add(lblNewLabel_2_3_2_1_1);
		
		
		try {
			valorFTF = new JFormattedTextField(new MaskFormatter("R$ ###.##"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		valorFTF.setFont(new Font("Times New Roman", Font.BOLD, 15));
		valorFTF.setBounds(563, 216, 94, 24);
		add(valorFTF);
		
		botaoConfirmar = new JButton("Confirmar");
		botaoConfirmar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		botaoConfirmar.setBounds(352, 355, 99, 27);
		add(botaoConfirmar);

	}

	public JTextField getNomeTF() {
		return nomeTF;
	}

	public void setNomeTF(JTextField nomeTF) {
		this.nomeTF = nomeTF;
	}

	public JFormattedTextField getCpfTF() {
		return cpfTF;
	}

	public void setCpfTF(JFormattedTextField cpfTF) {
		this.cpfTF = cpfTF;
	}

	public JFormattedTextField getTelefoneTF() {
		return telefoneTF;
	}

	public void setTelefoneTF(JFormattedTextField telefoneTF) {
		this.telefoneTF = telefoneTF;
	}

	public JFormattedTextField getCelularTF() {
		return celularTF;
	}

	public void setCelularTF(JFormattedTextField celularTF) {
		this.celularTF = celularTF;
	}

	public JTextField getRuaTF() {
		return ruaTF;
	}

	public void setRuaTF(JTextField ruaTF) {
		this.ruaTF = ruaTF;
	}

	public JTextField getNumeroTF() {
		return numeroTF;
	}

	public void setNumeroTF(JTextField numeroTF) {
		this.numeroTF = numeroTF;
	}

	public JComboBox getTipoClienteCB() {
		return tipoClienteCB;
	}

	public void setTipoClienteCB(JComboBox tipoClienteCB) {
		this.tipoClienteCB = tipoClienteCB;
	}

	public JFormattedTextField getDataSaidaFTF() {
		return dataSaidaFTF;
	}

	public void setDataSaidaFTF(JFormattedTextField dataSaidaFTF) {
		this.dataSaidaFTF = dataSaidaFTF;
	}

	public JFormattedTextField getDataEntradaFTF() {
		return dataEntradaFTF;
	}

	public void setDataEntradaFTF(JFormattedTextField dataEntradaFTF) {
		this.dataEntradaFTF = dataEntradaFTF;
	}

	public JFormattedTextField getValorFTF() {
		return valorFTF;
	}

	public void setValorFTF(JFormattedTextField valorFTF) {
		this.valorFTF = valorFTF;
	}

	public JButton getBotaoConfirmar() {
		return botaoConfirmar;
	}

	public void setBotaoConfirmar(JButton botaoConfirmar) {
		this.botaoConfirmar = botaoConfirmar;
	}
}
