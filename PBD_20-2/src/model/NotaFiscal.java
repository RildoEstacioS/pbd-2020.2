package model;

public class NotaFiscal {

	private String valorTotal;
	private String tipoPagamento;
	
	public NotaFiscal(String valorTotal, String tipoPagamento) {
		super();
		this.valorTotal = valorTotal;
		this.tipoPagamento = tipoPagamento;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	
	
	
}
