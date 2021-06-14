package br.com.caelum.ed.lista.testes;

import br.com.caelum.ed.lista.ListaEncadeada;

public class TesteAdicionar {

	public static void main(String[] args) {
		ListaEncadeada lista1 = new ListaEncadeada();
		lista1.adicionarNoComeco("Brian");
		lista1.adicionarNoComeco("Kévin");
		System.out.println("Adicionar no começo: ");
		System.out.println(lista1);
		
		ListaEncadeada lista2 = new ListaEncadeada();
		lista2.adicionar("Monica");
		lista2.adicionar("Cebolinha");
		System.out.println("Adicionar no fim: ");
		System.out.println(lista2);
		
		ListaEncadeada lista3 = new ListaEncadeada();
		lista3.adicionar("Inuyasha");
		lista3.adicionarNaPosicao(0, "Sesshumarou");
		lista3.adicionarNaPosicao(2, "Rin");
		System.out.println("Adicionar na posição: ");
		System.out.println(lista3);

	}

}
