package view;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.Color;

public class TelaInicial extends JFrame{

	private PanelCadastrarCliente panelCadastrarCliente;
	private BuscarClientePanel buscarCliente;
	private JPanel contentPanel;
	public CardLayout cardLayout;
	private PanelInicial panelInicial;	

	
	JPanel cardLayoutPanel;
	JMenuBar Menu = new JMenuBar();
	JMenu ClienteMenu = new JMenu("Cliente\r\n");
	JLabel lblNewLabel = new JLabel("S.A.C.O. - Sistema Automatizado de Controle da Oficina");
	JMenuItem clienteCadastrarMenuItem = new JMenuItem("Cadastrar Cliente");
	JMenu funcionarioMenu = new JMenu("Funcionario");
	JMenuItem cadastrarFuncionarioMenuItem = new JMenuItem("Cadastrar Funcionario");
	JMenu veiculoMenu = new JMenu("Veiculo");
	JMenu ItemsMenu = new JMenu("Items");
	JMenuItem cadastrarVeiculoMenuItem = new JMenuItem("Cadastrar Veiculo");
	JMenu notaFiscalMenu = new JMenu("Nota Fiscal");
	JMenu servicoMenu = new JMenu("Servi\u00E7os");
	private final JMenuItem buscarClienteMenuItem = new JMenuItem("Buscar Cliente");


	public TelaInicial() {
		getContentPane().setBackground(new Color(245, 255, 250));
		
		cardLayoutPanel = new JPanel();
		panelCadastrarCliente = new PanelCadastrarCliente();
		buscarCliente = new BuscarClientePanel();
		panelInicial = new PanelInicial();
		panelInicial.setBackground(new Color(245, 255, 250));
		
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 34));
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setVisible(true);	
		
		cardLayout = new CardLayout();
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		
		lblNewLabel.setBounds(10, 44, 796, 40);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		this.getContentPane().add(lblNewLabel);
		
		cardLayoutPanel.setBounds(10, 125, 780, 440);
		this.getContentPane().add(cardLayoutPanel);
		cardLayoutPanel.setLayout(cardLayout);
		
		
		Menu.setBounds(0, 0, 800, 22);
		this.getContentPane().add(Menu);
		ClienteMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		
		Menu.add(ClienteMenu);
		clienteCadastrarMenuItem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		ClienteMenu.add(clienteCadastrarMenuItem);
		buscarClienteMenuItem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		ClienteMenu.add(buscarClienteMenuItem);
		funcionarioMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		Menu.add(funcionarioMenu);
		
		funcionarioMenu.add(cadastrarFuncionarioMenuItem);
		veiculoMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		Menu.add(veiculoMenu);
		
		veiculoMenu.add(cadastrarVeiculoMenuItem);
		ItemsMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		Menu.add(ItemsMenu);
		servicoMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		Menu.add(servicoMenu);
		notaFiscalMenu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		Menu.add(notaFiscalMenu);
		
		
		cardLayoutPanel.add(panelInicial, "panelInicial");
		cardLayoutPanel.add(panelCadastrarCliente, "cadastrarCliente");
		cardLayoutPanel.add(buscarCliente, "buscarCliente");
	}

	public JPanel getPanel() {
		return cardLayoutPanel;
	}

	public void setPanel(JPanel panel) {
		this.cardLayoutPanel = panel;
	}

	public JMenuBar getMenu() {
		return Menu;
	}

	public void setMenu(JMenuBar menu) {
		Menu = menu;
	}

	public JMenu getCliente() {
		return ClienteMenu;
	}

	public void setCliente(JMenu cliente) {
		ClienteMenu = cliente;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JMenuItem getClienteCadastrarMenuItem() {
		return clienteCadastrarMenuItem;
	}

	public void setClienteCadastrarMenuItem(JMenuItem clienteCadastrarMenuItem) {
		this.clienteCadastrarMenuItem = clienteCadastrarMenuItem;
	}

	public JMenu getFuncionarioMenu() {
		return funcionarioMenu;
	}

	public void setFuncionarioMenu(JMenu funcionarioMenu) {
		this.funcionarioMenu = funcionarioMenu;
	}

	public JMenuItem getCadastrarFuncionarioMenuItem() {
		return cadastrarFuncionarioMenuItem;
	}

	public void setCadastrarFuncionarioMenuItem(JMenuItem cadastrarFuncionarioMenuItem) {
		this.cadastrarFuncionarioMenuItem = cadastrarFuncionarioMenuItem;
	}

	public JMenu getVeiculoMenu() {
		return veiculoMenu;
	}

	public void setVeiculoMenu(JMenu veiculoMenu) {
		this.veiculoMenu = veiculoMenu;
	}

	public JMenu getItemsMenu() {
		return ItemsMenu;
	}

	public void setItemsMenu(JMenu itemsMenu) {
		ItemsMenu = itemsMenu;
	}

	public JMenuItem getCadastrarVeiculoMenuItem() {
		return cadastrarVeiculoMenuItem;
	}

	public void setCadastrarVeiculoMenuItem(JMenuItem cadastrarVeiculoMenuItem) {
		this.cadastrarVeiculoMenuItem = cadastrarVeiculoMenuItem;
	}

	public JMenu getNotaFiscalMenu() {
		return notaFiscalMenu;
	}

	public void setNotaFiscalMenu(JMenu notaFiscalMenu) {
		this.notaFiscalMenu = notaFiscalMenu;
	}

	public JMenu getServicoMenu() {
		return servicoMenu;
	}

	public void setServicoMenu(JMenu servicoMenu) {
		this.servicoMenu = servicoMenu;
	}

	public JMenu getClienteMenu() {
		return ClienteMenu;
	}

	public void setClienteMenu(JMenu clienteMenu) {
		ClienteMenu = clienteMenu;
	}

	public JMenuItem getBuscarClienteMenuItem() {
		return buscarClienteMenuItem;
	}

	public PanelCadastrarCliente getPanelCadastrarCliente() {
		return panelCadastrarCliente;
	}

	public void setPanelCadastrarCliente(PanelCadastrarCliente panelCadastrarCliente) {
		this.panelCadastrarCliente = panelCadastrarCliente;
	}

	public JPanel getCardLayoutPanel() {
		return cardLayoutPanel;
	}

	public void setCardLayoutPanel(JPanel cardLayoutPanel) {
		this.cardLayoutPanel = cardLayoutPanel;
	}

	public BuscarClientePanel getBuscarCliente() {
		return buscarCliente;
	}

	public void setBuscarCliente(BuscarClientePanel buscarCliente) {
		this.buscarCliente = buscarCliente;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public void setContentPanel(JPanel contentPanel) {
		this.contentPanel = contentPanel;
	}

	public CardLayout getCardLayout() {
		return cardLayout;
	}

	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}

	public PanelInicial getPanelInicial() {
		return panelInicial;
	}

	public void setPanelInicial(PanelInicial panelInicial) {
		this.panelInicial = panelInicial;
	}
	
	
}
