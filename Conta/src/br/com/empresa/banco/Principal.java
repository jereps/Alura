package br.com.empresa.banco;
import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaCorrente;

public class Principal {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.deposita(100.0);
		
		Conta conta2 = new ContaCorrente();
		conta2.deposita(100.5);

		System.out.printf("O saldo é: %.2f", conta.getSaldo());
		System.out.printf("O saldo é: %.2f", conta2.getSaldo());
	}
}