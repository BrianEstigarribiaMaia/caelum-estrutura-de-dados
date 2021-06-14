package br.com.caelum.ed.lista.testes;

import br.com.caelum.ed.lista.ListaEncadeada;

public class TesteOutrasFuncoes {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
        lista.adicionar("Michael Scott");
        lista.adicionar("Jim");
        lista.adicionar("Pam");
        System.out.println(lista.tamanho());
        System.out.println(lista.pegar(0));
        System.out.println(lista.contem("Stanley"));
        System.out.println(lista.contem("Pam"));

	}

}
