package br.com.softblue.sbpay;

public enum StatusPagamento {
	
	Autorizado("Autorizado"), 
	NaoAutorizado("N�o Autorizado pela institui��o financeira"), 
	CartaoInvalido("Cart�o Inv�lido ou bloqueado");
	
	String descricao;
	
	StatusPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
