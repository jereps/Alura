package br.com.empresa.conta;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(double saldo) {
		super(saldo);
	}
	
	public ContaCorrente() {
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
}
