public class Principal {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100.0);
		
		Conta conta2 = new Conta();
		conta2.deposita(100.5);

		System.out.println(conta.getSaldo());
		System.out.println(conta2.getSaldo());
	}
}