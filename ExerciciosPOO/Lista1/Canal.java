package Atividade01;

public class Canal {

	public String nome;
	public String nicho;
	public int inscritos;
	
	public void placa() {
		if (this.inscritos >= 100000 && this.inscritos < 1000000) {
			System.out.println("Parabéns pela placa de 100k de inscritos!");
		} else if (this.inscritos >= 1000000) {
			System.out.println("Parabéns pela placa de 1M de inscritos!");
		}else { System.out.println("Você ainda não tem nenhuma placa de inscritos.");
		}
	}
	
	public void imprimir() {
		System.out.println("Nome do Canal: "+this.nome);
		System.out.println("Nicho do canal: "+this.nicho);
		System.out.println("Quantidade de Inscritos: "+this.inscritos);
	}
	
}