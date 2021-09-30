package br.com.caelum.ed.mapas;

public class AssociacaoParametrizada<C, V> {
	private C chave;
	private V valor;

	public AssociacaoParametrizada(C chave, V valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}

	public C getChave() {
		return chave;
	}

	public V getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "{ " + chave + " -> " + valor + " }";
	}

}
