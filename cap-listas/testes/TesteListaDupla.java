package br.com.caelum.ed.lista.testes;

import br.com.caelum.ed.lista.ListaDuplamenteEncadeada;


public class TesteListaDupla {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista3 = new ListaDuplamenteEncadeada();
		lista3.adicionar("Inuyasha");
		lista3.adicionarNaPosicao(0, "Sesshumarou");
		lista3.adicionarNaPosicao(2, "Rin");
		System.out.println(lista3);

		System.out.println("Remover no começo: ");
		lista3.removerNoComeco();
		System.out.println(lista3);
	}

}
