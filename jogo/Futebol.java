package jogo;

import jogo.equipamentos.Bola;
import jogo.equipamentos.Campo;
import jogo.pessoas.Juiz;

public class Futebol {

	private Equipe equipeA;
	private Equipe equipeB;
	private Juiz juiz;
	private Campo campo;
	private Bola bola;
	
	public Futebol(Equipe equipeA, Equipe equipeB, Juiz juiz, Campo campo, Bola bola) {
		super();
		this.equipeA = equipeA;
		this.equipeB = equipeB;
		this.juiz = juiz;
		this.campo = campo;
		this.bola = bola;
	}
	
	public Equipe getEquipeA() {
		return equipeA;
	}
	public void setEquipeA(Equipe equipeA) {
		this.equipeA = equipeA;
	}
	public Equipe getEquipeb() {
		return equipeB;
	}
	public void setEquipeb(Equipe equipeB) {
		this.equipeB = equipeB;
	}
	public Juiz getJuiz() {
		return juiz;
	}
	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}
	public Campo getCampo() {
		return campo;
	}
	public void setCampo(Campo campo) {
		this.campo = campo;
	}
	public Bola getBola() {
		return bola;
	}
	public void setBola(Bola bola) {
		this.bola = bola;
	}
	
	public void imprimir() {
	    System.out.println("=== Equipe A ===");
	    imprimirEquipe(equipeA);

	    System.out.println();
	    System.out.println("=== Equipe B ===");
	    imprimirEquipe(equipeB);

	    System.out.println();
	    System.out.println("Juiz: " + juiz.getNome());
	    System.out.println("Campo: " + campo.getLargura() + "m x " + campo.getComprimento() + "m");
	    System.out.println("Bola: " + bola.getMarca());
	}

	private void imprimirEquipe(Equipe e) {
	    System.out.println("Treinador: " + e.getTreinador().getNome());
	    System.out.println("Goleiro: " + e.getGoleiro().getNome());
	    System.out.println("Fixo: " + e.getFixo().getNome());
	    System.out.println("Ala direita: " + e.getAlaD().getNome());
	    System.out.println("Ala esquerda: " + e.getAlaE().getNome());
	    System.out.println("Pivô: " + e.getPivo().getNome());
	}
	
}