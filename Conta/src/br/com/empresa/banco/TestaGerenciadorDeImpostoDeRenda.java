package br.com.empresa.banco;
import br.com.empresa.conta.ContaCorrente;
import br.com.empresa.conta.GerenciadorDeImpostoDeRenda;
import br.com.empresa.conta.SeguroDeVida;

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
