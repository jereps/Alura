
public abstract class Conta {
	
	protected double saldo;

	void deposita(double valor) {
		this.saldo = valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void saca(double valor) {
		this.saldo += valor;
	}
	
	public abstract void atualiza(double taxa);
	
}
