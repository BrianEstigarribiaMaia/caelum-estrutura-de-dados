package br.com.k19poo.orientacaoaobjetos;

public class Agencia {

	private int numero;

	public Agencia(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Agencia [número: " + numero + "]";
	}
	
	
}
