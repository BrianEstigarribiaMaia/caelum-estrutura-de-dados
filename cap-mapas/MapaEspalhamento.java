package br.com.caelum.ed.mapas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspalhamento {

	private List<List<Associacao>> tabela = new ArrayList<List<Associacao>>();

	public MapaEspalhamento() {
		for (int i = 0; i < 100; i++) {
			this.tabela.add(new LinkedList<Associacao>());
		}
	}

	private int calcularIndiceDaTabela(String placa) {
		return Math.abs(placa.hashCode()) % this.tabela.size();
	}

	public boolean contemChave(String placa) {
		int indice = this.calcularIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);

		for (int i = 0; i < lista.size(); i++) {
			Associacao associacao = (Associacao) lista.get(i);

			if (associacao.getPlaca().equals(placa)) {
				return true;
			}
		}

		return false;
	}

	public void remove(String placa) {
		int indice = this.calcularIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);

		for (int i = 0; i < lista.size(); i++) {
			Associacao associacao = (Associacao) lista.get(i);

			if (associacao.getPlaca().equals(placa)) {
				lista.remove(i);
				break;
			}
		}

		throw new IllegalArgumentException("A chave não existe!");
	}

	public void adiciona(String placa, Carro carro) {
		if (this.contemChave(placa)) {
			this.remove(placa);
		}

		int indice = this.calcularIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);
		lista.add(new Associacao(placa, carro));
	}

	public Object pega(String placa) {
		int indice = this.calcularIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);

		for (int i = 0; i < lista.size(); i++) {
			Associacao associacao = (Associacao) lista.get(i);
			if (associacao.getPlaca().equals(placa)) {
				return associacao.getCarro();
			}
		}
		throw new IllegalArgumentException("A chave não existe");
	}
}
