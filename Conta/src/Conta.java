
public abstract class Conta {

	protected double saldo;

	void deposita(double valor) throws ValorInvalidoException {
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
