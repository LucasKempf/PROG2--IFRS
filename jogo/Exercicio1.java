package jogo;

import java.util.Scanner;

import jogo.equipamentos.Bola;
import jogo.equipamentos.Campo;
import jogo.pessoas.Jogador;
import jogo.pessoas.Juiz;
import jogo.pessoas.Treinador;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Marca da bola: ");
		Bola b = new Bola(leitor.nextLine());

		System.out.print("Largura do campo: ");
		int largura = Integer.parseInt(leitor.nextLine());
		System.out.print("Comprimento do campo: ");
		int comprimento = Integer.parseInt(leitor.nextLine());
		Campo c = new Campo(largura, comprimento);

		System.out.print("Nome do juiz: ");
		Juiz j = new Juiz(leitor.nextLine());

		// Equipe A
		System.out.println("\n=== Equipe A ===");
		System.out.print("Nome do treinador: ");
		Treinador tA = new Treinador(leitor.nextLine());
		System.out.print("Nome do goleiro: ");
		Jogador goleiroA = new Jogador(leitor.nextLine());
		System.out.print("Nome do fixo: ");
		Jogador fixoA = new Jogador(leitor.nextLine());
		System.out.print("Nome da ala direita: ");
		Jogador alaDA = new Jogador(leitor.nextLine());
		System.out.print("Nome da ala esquerda: ");
		Jogador alaEA = new Jogador(leitor.nextLine());
		System.out.print("Nome do pivô: ");
		Jogador pivoA = new Jogador(leitor.nextLine());
		Equipe eA = new Equipe(tA, goleiroA, fixoA, alaDA, alaEA, pivoA);

		// Equipe B
		System.out.println("\n=== Equipe B ===");
		System.out.print("Nome do treinador: ");
		Treinador tB = new Treinador(leitor.nextLine());
		System.out.print("Nome do goleiro: ");
		Jogador goleiroB = new Jogador(leitor.nextLine());
		System.out.print("Nome do fixo: ");
		Jogador fixoB = new Jogador(leitor.nextLine());
		System.out.print("Nome da ala direita: ");
		Jogador alaDB = new Jogador(leitor.nextLine());
		System.out.print("Nome da ala esquerda: ");
		Jogador alaEB = new Jogador(leitor.nextLine());
		System.out.print("Nome do pivô: ");
		Jogador pivoB = new Jogador(leitor.nextLine());
		Equipe eB = new Equipe(tB, goleiroB, fixoB, alaDB, alaEB, pivoB);
		Futebol f = new Futebol(eA, eB, j, c, b);

		f.imprimir();// ou utilizar o comentario abaixo para imprimir sem o método.
		
		/*
		System.out.println("=== Equipe A ===");
		System.out.println("Treinador: " + f.getEquipeA().getTreinador().getNome());
		System.out.println("Goleiro: " + f.getEquipeA().getGoleiro().getNome());
		System.out.println("Fixo: " + f.getEquipeA().getFixo().getNome());
		System.out.println("Ala direita: " + f.getEquipeA().getAlaD().getNome());
		System.out.println("Ala esquerda: " + f.getEquipeA().getAlaE().getNome());
		System.out.println("Pivô: " + f.getEquipeA().getPivo().getNome());

		System.out.println();
		System.out.println("=== Equipe B ===");
		System.out.println("Treinador: " + f.getEquipeb().getTreinador().getNome());
		System.out.println("Goleiro: " + f.getEquipeb().getGoleiro().getNome());
		System.out.println("Fixo: " + f.getEquipeb().getFixo().getNome());
		System.out.println("Ala direita: " + f.getEquipeb().getAlaD().getNome());
		System.out.println("Ala esquerda: " + f.getEquipeb().getAlaE().getNome());
		System.out.println("Pivô: " + f.getEquipeb().getPivo().getNome());

		System.out.println();
		System.out.println("Juiz: " + f.getJuiz().getNome());
		System.out.println("Campo: " + f.getCampo().getLargura() + "m x " + f.getCampo().getComprimento() + "m");
		System.out.println("Bola: " + f.getBola().getMarca());
		*/
		
		leitor.close();
	}

}
