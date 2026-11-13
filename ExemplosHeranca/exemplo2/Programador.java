package exemplo3;

public class Programador extends Funcionario{

	private String linguagem;
	private String nivelExperiencia;
	
	public Programador(String name, double salario, String dataAdmissao, String linguagem, String nivelExperiencia) {
		super(name, salario, dataAdmissao);
		this.linguagem = linguagem;
		this.nivelExperiencia = nivelExperiencia;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public String getNivelExperiencia() {
		return nivelExperiencia;
	}

	public void setNivelExperiencia(String nivelExperiencia) {
		this.nivelExperiencia = nivelExperiencia;
	}
	
}