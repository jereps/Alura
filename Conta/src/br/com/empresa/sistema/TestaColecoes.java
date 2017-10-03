package br.com.empresa.sistema;

import java.util.ArrayList;

import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaCorrente;

public class TestaColecoes {
	
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Guilherme");
		nomes.add("Mauricio");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Guilherme"));
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new ContaCorrente(500.00);
		Conta c2 = new ContaCorrente(700.00);
		
		contas.add(c1);
		contas.add(c2);
		
		System.out.println(contas.get(1));
		
	}
	
}
