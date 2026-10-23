package ex1;

public class Projeto {
	  String nome;
	    Pesquisador pesquisador; //associação de classes
	    Instituicao instituicao;
	    
	    public void imprimir() {
	        System.out.println("Nome do Projeto: " + this.nome);
	        
	        if (this.pesquisador != null) { //apenas para validar n precisaria
	            this.pesquisador.imprimir();
	        }
	        if (this.instituicao != null) {
	            this.instituicao.imprimir();
	        }
	    } 
}
