package Atividade01;

public class Rodovia {

	public String nome;
	public String estadoFim;
	public String estadoInicio;
	
	public void imprimir() {
		System.out.println("A Rodovia "+this.nome+" começa no estado "+this.estadoInicio+" e termina no estado "+this.estadoFim);
	}
}
