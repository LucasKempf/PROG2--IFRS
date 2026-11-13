package exemplo3;

public class Funcionario {

	private String name;
	private double salario;
	private String dataAdmissao;
	
	public Funcionario(String name, double salario, String dataAdmissao) {
		super();
		this.name = name;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
}