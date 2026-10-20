package Atividade01;

public class Curso {
	
	public String curso;
	public int duracao;
	public String instituicao;
	
	public void imprimir () {
		System.out.println("Seu curso é "+this.curso+" com duração de "+this.duracao+" semestres da Instituição de Ensino "+this.instituicao);
	}

}
