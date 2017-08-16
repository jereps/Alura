class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	private static int identificador = 0;


	public Funcionario(String nome){
		this.nome = nome;
		Funcionario.identificador = Funcionario.identificador + 1;
	}

	public Funcionario(){
		this(null);
	}

	public static int getIdentificador(){
		return Funcionario.identificador;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}

	public void setDataEntrada(Data dataEntrada){
		this.dataEntrada = dataEntrada;
	}

	public void setRg(String rg){
		this.rg = rg;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public double getSalario(){
		return this.salario;
	}

	public void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	public double getGanhoAnual(){
		return this.salario * 12;
	}

	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamenot: " + this.departamento);
		System.out.println("Salario Atual: R$ " + this.salario);
		System.out.println("Data de Entrada: " + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho Anual: R$ " + getGanhoAnual());
	}
}
