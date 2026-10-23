package ex1;

public class Projeto {
	  String nome;
	    Pesquisador pesquisador;
	    Instituicao instituicao;
	    
	    public void imprimir() {
	        System.out.println("Nome do Projeto: " + this.nome);
	        
	        if (this.pesquisador != null) {
	            this.pesquisador.imprimir();
	        }
	        if (this.instituicao != null) {
	            this.instituicao.imprimir();
	        }
	    } 
}
