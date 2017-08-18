
public class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaCorrente();
		try {
		cp.deposita(-100);
		} catch (IllegalArgumentException e) {
			System.out.println("Valor negativo não é permitido: " + e);
		}
	}
}
