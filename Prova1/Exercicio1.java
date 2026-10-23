package ex1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Projeto p1 = new Projeto();
        p1.pesquisador = new Pesquisador();
        p1.instituicao = new Instituicao();

        System.out.print("Nome do projeto: ");
        p1.nome = leitor.nextLine();

        System.out.print("Nome do pesquisador: ");
        p1.pesquisador.nome = leitor.nextLine();
        
        System.out.print("Area de especialidade: ");
        p1.pesquisador.area = leitor.nextLine();
        
        System.out.print("Nome da instituicao: ");
        p1.instituicao.nome = leitor.nextLine();
        
        System.out.print("Cidade da instituicao: ");
        p1.instituicao.cidade = leitor.nextLine();
        
        p1.imprimir();

        leitor.close();
    }
}