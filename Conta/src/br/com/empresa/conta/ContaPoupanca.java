package br.com.empresa.conta;

public class ContaPoupanca extends Conta {

	
	
	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	public ContaPoupanca() {
	}
	
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
}
 