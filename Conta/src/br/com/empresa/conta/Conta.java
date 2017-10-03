package br.com.empresa.conta;

/**
 * Classe responsavel por moldar as Contas do Banco
 * 
 * @author Jeremias Ponciano da Silva
 *
 */

public abstract class Conta {

	protected double saldo;
	private int numero;
	private String nome;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta() {
		
	}
	
	/**
	 * Metodo que incrementa o saldo.
	 * @param valor.
	 */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);
	
	@Override
	public String toString() {
		return "esse objeto é uma conta com saldo R$: " +  this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.nome.equals(outraConta.nome) ;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
