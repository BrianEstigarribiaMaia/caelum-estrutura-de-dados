package br.com.caelum.ed.lista.testes;

import br.com.caelum.ed.lista.ListaEncadeada;

public class TesteRemover {

	public static void main(String[] args) {
		ListaEncadeada lista1 = new ListaEncadeada();
		lista1.adicionarNoComeco("Brian");
		lista1.adicionarNoComeco("Kévin");
		System.out.println(lista1);
		System.out.println("Remover no começo: ");
		lista1.removerNoComeco();
		System.out.println(lista1);
		
		/*ListaEncadeada lista2 = new ListaEncadeada();
		lista2.adicionar("Monica");
		lista2.adicionar("Cebolinha");
		lista2.adicionar("Cascão");
		System.out.println(lista2);
		System.out.println("Remover no fim: ");
		lista2.removerNoFim();
		System.out.println(lista2);*/
		
		ListaEncadeada lista3 = new ListaEncadeada();
		lista3.adicionar("Inuyasha");
		lista3.adicionarNaPosicao(0, "Sesshumarou");
		lista3.adicionarNaPosicao(2, "Rin");
		System.out.println(lista3);
		System.out.println("Remover na posição: ");
		lista3.remover(1);
		System.out.println(lista3);

	}

}
