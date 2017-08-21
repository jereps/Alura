package br.com.empresa.conta;

/**
 * Classe responsavel por moldar as Contas do Banco
 * 
 * @author Jeremias Ponciano da Silva
 *
 */

public abstract class Conta {

	protected double saldo;

	
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

}
