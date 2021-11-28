package view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class PanelInicial extends JPanel{
	
	
	public PanelInicial() {
		setBackground(new Color(224, 255, 255));
		this.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		add(lblNewLabel);
		lblNewLabel.setBounds(0, 2, 451, 298);
		lblNewLabel.setIcon(new ImageIcon("/res/logo2.png"));

	}
}
