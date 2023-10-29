package model;

public class Barra {
	public double comprimento;
	public double largura;
	public double altura;
	public double volume;
	
	public Barra() {
		super();
	}

	public Barra(double comprimento, double largura, double altura) {
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
		this.volume = comprimento * altura * largura;
	}

	@Override
	public String toString() {
		return "Barra [comprimento=" + comprimento + ", largura=" + largura + ", altura=" + altura + ", volume="
				+ volume + "]";
	}
	
	

}
