package br.com.caelum.ed.conjuntos.testes;

import java.util.List;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteConjunto {

	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adicionar("Brian");
		conjunto.adicionar("Carolina");
		conjunto.adicionar("Kevin");
		
		List<String> palavras = conjunto.pegarTodas();

		System.out.println(conjunto.tamanho());
		
		for(String palavra: palavras){
			System.out.println(palavra);
		}
		
		System.out.println("-------------------------");
		
		conjunto.remover("Carolina");
		
		palavras = conjunto.pegarTodas();
		
		System.out.println("Depois de Remover: ");
		for(String palavra : palavras){
			System.out.println(palavra);
		}
		System.out.println(conjunto.tamanho());
		System.out.println("-------------------------");
		
		/*for(int i = 0; i < 100; i++){
			conjunto.adicionar(""+i);
		}
		
		conjunto.imprimirTabela();*/
	}

}
