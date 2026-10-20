package Atividade01;

public class Smartphone {

	public String marca;
	public double preco;
	public int armazenamento;
	
	public void comparaPreco (Smartphone outro) {
		if (this.preco < outro.preco) {
			System.out.println(this.marca + " é mais barato que " + outro.marca + ".");
		}else if(this.preco==outro.preco){
			System.out.println("Os dois celulares tem o memso preço.");
		}else {
			System.out.println(outro.marca + " é mais barato que " + this.marca + ".");
		}
	}
	
	public void imprimir() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Preço: "+this.preco);
		System.out.println("Armazenamento: "+this.armazenamento);
	}
	
}
