package br.com.empresa.sistema;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteIO {

	public static void main(String[] args) throws IOException {

//		InputStream is = new FileInputStream("arquivo.txt");
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream("arquivo.txt")));

		Scanner sc = new Scanner(System.in);
		
		PrintStream saida = new PrintStream(new FileOutputStream("saida.txt"));
		
		System.out.println("Digite Alguma coisa: ");

//		String line = br.readLine();

		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
			saida.println(sc.nextLine());
//			line = br.readLine();
		}

		sc.close();
		saida.close();
//		br.close();
	}

}
