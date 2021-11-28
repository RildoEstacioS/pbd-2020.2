package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa{
	private int id;
	private String celular;
	private String tipoCliente;
	private String endereco;
	private String dataEntrada;
	private String dataSaida;
	private double valor;
	
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	Date data1;
	Date data2;
	java.sql.Date dataSql;
	
	public Cliente(String nome, String cpf_cnpj, String telefone, String celular, String tipoCliente, String endereco,
			String dataEntrada, String dataSaida, double valor) {
		super(nome, cpf_cnpj, telefone);
		this.celular = celular;
		this.tipoCliente = tipoCliente;
		this.endereco = endereco;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.valor = valor;
	}
	
	public java.sql.Date dataEntrada() throws ParseException {
		data1 = formato.parse(dataEntrada);
		java.sql.Date dataSql = new java.sql.Date(data1.getTime());
		return dataSql;

	}
	
	public java.sql.Date dataSaida() throws ParseException {
		data2 = formato.parse(dataSaida);
		java.sql.Date dataSql = new java.sql.Date(data2.getTime());
		return dataSql;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDatSaida() {
		return dataSaida;
	}

	public void setDatSaida(String datSaida) {
		this.dataSaida = datSaida;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [id=" + id + ", celular=" + celular + ", tipoCliente=" + tipoCliente + ", endereco=" + endereco
				+ ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", valor=" + valor + ", toString()="
				+ "]";
	}
	
	
	
	
	

}
