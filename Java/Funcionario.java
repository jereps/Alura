class Funcionario{
	private String nome;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;

	public Funcionario(String nome){
		this.nome = nome;
	}

	public Funcionario(){
	
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

class Empresa{
	private String nome;
	private int cnpj;
	private Funcionario[] funcionarios;
	private int livre = 0;

	public Empresa(int tamanho){
		funcionarios = new Funcionario[tamanho];
	}

	public void setNomeEmpresa(String nome){
		this.nome = nome;
	}

	public void setCnpj(int cnpj){
		this.cnpj = cnpj;
	}

	public Funcionario getFuncionario (int posicao){
		return this.funcionarios[posicao];
	}

	public void adiciona(Funcionario f) {
		this.funcionarios[this.livre] = f;
		this.livre++;
	}

	public void mostraTodasAsInformacoes(){
		for(int i = 0; i < this.livre; i++){
			this.funcionarios[i].mostra();
		}
	}

	public void mostraEmpregados(){
		for(int i = 0; i < this.livre; i++){
			System.out.println("Funcionario: " + this.funcionarios[i].getNome() + " Salario: " + this.funcionarios[i].getSalario());
		}
	}

	public boolean contem(Funcionario f){
		for(int i = 0; i < this.livre; i++){
			if(this.funcionarios[i] == f){
				 return true;
			}
		}
		return false;
	}
}
