package br.com.caelum.ed.mapas;

import java.util.ArrayList;
import java.util.List;

public class MapaLista {

	private List<Associacao> associacoes = new ArrayList<Associacao>();

	public void adiciona(String placa, Carro carro) {
		if (!this.contemChave(placa)) {
			Associacao associacao = new Associacao(placa, carro);
			this.associacoes.add(associacao);
		}
	}

	public Carro pega(String placa) {
		for (Associacao associacao : this.associacoes) {
			if (placa.equals(associacao.getPlaca())) {
				return (Carro) associacao.getCarro();
			}
		}
		throw new IllegalArgumentException("Chave não existe");
	}

	public void remove(String placa) {
		if (this.contemChave(placa)) {
			for (int i = 0; i < this.associacoes.size(); i++) {
				Associacao associacao = this.associacoes.get(i);
				if (placa.equals(associacao.getPlaca())) {
					this.associacoes.remove(i);
					break;
				}
			}
		} else {
			throw new IllegalArgumentException("Chave não existe");
		}
	}

	public boolean contemChave(String placa) {
		for (Associacao associacao : this.associacoes) {
			if (placa.equals(associacao.getPlaca())) {
				return true;
			}
		}
		return false;
	}
}
