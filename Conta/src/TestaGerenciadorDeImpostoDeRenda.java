public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda gerenciado = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciado.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciado.adiciona(cc);
		
		System.out.println(gerenciado.getTotal());
		
	}
}
