package exemplos1;

public class Casa {

	private String endereco;
	private int area;
	
	public Casa(String endereco, int area) {
		super();
		this.endereco = endereco;
		this.area = area;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}	
	
}