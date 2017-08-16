class TestaEmpresa{
	public static void main(String[] args){
		Empresa empresa = new Empresa();
		
		Funcionario f1 = new Funcionario();
		f1.setNome("João");
		f1.setSalario(1000);
		empresa.adiciona(f1);

		Funcionario f2 = new Funcionario();
		f2.setNome("Paulo");
		f2.setSalario(1200);
		empresa.adiciona(f2);

		//empresa.mostraEmpregados();
		empresa.mostraTodasAsInformacoes();

	}
}
