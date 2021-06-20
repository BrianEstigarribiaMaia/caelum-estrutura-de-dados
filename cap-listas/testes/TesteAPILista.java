package br.com.caelum.ed.lista.testes;

import java.util.LinkedList;

import br.com.caelum.ed.lista.AlunoLista;


public class TesteAPILista {

	public static void main(String[] args) {
		AlunoLista aluno1 = new AlunoLista();
		aluno1.setNome("Juquinha");
		AlunoLista aluno2 = new AlunoLista();
		aluno2.setNome("Mariazinha");
		LinkedList<AlunoLista> nomes = new LinkedList<AlunoLista>();
		nomes.add(aluno1);
		nomes.add(aluno2);
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno2.getNome());
	}
}
