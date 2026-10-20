package Atividade01;

public class Casa {

	public String cor;
	public int andar;
	public boolean garagem;
	
	public void imprimir() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Andar: "+this.andar);
		if(garagem == true) {
			System.out.println("Garagem: Sim.");
		}else {System.out.println("Garagem: Não.");}
	}
	
	
}