class TestaFuncionario{
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
	
		f1.setNome("Hugo");
		f1.setSalario(100);
		f1.setDepartamento("Administrativo");
		f1.recebeAumento(50);
		f1.setRg("50598349813");
		Data d = new Data(31 ,2 , 2012);
//		d.preencheData(20, 2, 2015);
		f1.setDataEntrada(d);

		f1.mostra();
	}
}
