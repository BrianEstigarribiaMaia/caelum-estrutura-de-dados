package br.com.caelum.ed.mapas;

public class Associacao {
	private String placa;
	private Carro carro;
	
	public Associacao(String placa, Carro carro) {
		super();
		this.placa = placa;
		this.carro = carro;
	}
	
	public Object getPlaca(){
        return placa;
    }
    
    public Object getCarro(){
        return carro;
    }
	
}
