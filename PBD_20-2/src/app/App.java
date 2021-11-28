package app;

import java.sql.Date;

import javax.swing.UIManager;

import controller.ControllerTelaInicial;
import dao.DAOCliente;
import facade.Facade;
import model.Cliente;
import view.PanelCadastrarCliente;
import view.TelaInicial;

public class App {
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

		
		java.util.Date date = new Date(2020-01-11);
		Facade facade = new Facade();
//		DAOCliente cliente = new DAOCliente();
//		cliente.salvarCliente(new Cliente("Rildo", "111.111.111-11", "111111", "1111", "Pagador", "Sei lá", "20/12/2021", "12/08/2020", 200.00 ));
		TelaInicial telainicial = new TelaInicial();
		PanelCadastrarCliente panelCadastrarCliente = new PanelCadastrarCliente();
		new ControllerTelaInicial(telainicial, panelCadastrarCliente, facade);
	}
}
