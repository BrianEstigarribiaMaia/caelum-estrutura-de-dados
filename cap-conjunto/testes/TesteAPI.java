package br.com.caelum.ed.conjuntos.testes;

import java.util.HashSet;

public class TesteAPI {

	public static void main(String[] args) {
		HashSet<Object> conjunto = new HashSet<Object>();
		
		conjunto.add("Brian");
		conjunto.add("Brian");
		conjunto.add("Juca");
		conjunto.add("Kiko");
		
		System.out.println(conjunto);
	}
}
