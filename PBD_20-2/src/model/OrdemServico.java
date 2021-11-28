package model;

import java.util.Date;

public class OrdemServico {
	
	private String status;
	private Date dataEntrada, dataSaida;
	
	public OrdemServico(String status, Date dataEntrada, Date dataSaida) {
		super();
		this.status = status;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	

}
