package br.com.caelum.ed.mapas.testes;

import br.com.caelum.ed.mapas.Carro;
import br.com.caelum.ed.mapas.MapaLista;

public class TesteTempoMapa {

	public static void main(String[] args) {
		MapaLista mapaLista = new MapaLista();
		int numeroDeElementos = 15000;

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.adiciona("" + i, new Carro("c" + i));
		}

		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.pega("" + i);
		}

		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.contemChave("" + i);
		}

		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.remove("" + i);
		}

		long fim = System.currentTimeMillis();

		System.out.println("Tempo: " + (fim - inicio) / 1000.0);

	}

}
