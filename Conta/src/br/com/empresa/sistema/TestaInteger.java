package br.com.empresa.sistema;

import br.com.empresa.conta.Conta;
import br.com.empresa.conta.ContaCorrente;

public class TestaInteger {
	
	public void trazfrente(String nome) {
	for (int i = nome.length() -1; i >= 0; i--) {
		System.out.print(nome.charAt(i));
	}
	}
	
	public void frasecontraria(String nome) {
		String string[] = nome.split(" ");
		
		for (int i = string.length -1; i >= 0; i--) {
			System.out.print(string[i] + " ");
		}
	}
	
    public void inverteComStringBuilder(String texto) {
        StringBuilder invertido = new StringBuilder(texto).reverse();
        System.out.println(invertido);
    }

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		Conta conta = new ContaCorrente();
		Conta conta2 = new ContaCorrente();
		
		TestaInteger testa = new TestaInteger();
		
		conta.setNumero(1234);
		conta.setNome("conta");
		conta2.setNumero(1234);
		conta2.setNome("conta");
		
		if (x1.equals(x2)) {
			System.out.println("igual");
		}else {
			System.out.println("diferente");
		}
		
		System.out.println(x1);
		
		String string = "Socorram-me, subi no ônibus em Marrocos";
		testa.inverteComStringBuilder(string);
		
		System.out.println(conta == conta2);
		System.out.println(conta.equals(conta2));
		
		
	}

}
