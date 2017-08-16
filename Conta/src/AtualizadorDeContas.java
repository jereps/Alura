class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println("Saldo atualizado: " + c.getSaldo());
		saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

}
