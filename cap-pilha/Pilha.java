package br.com.caelum.ed.pilha;

import java.util.LinkedList;
import java.util.List;

import br.com.caelum.ed.objetos.Aluno;

public class Pilha {
	private List<Aluno> alunos = new LinkedList<Aluno>();

	public void inserir(Aluno aluno){
		this.alunos.add(aluno);
	}
	
	public Aluno remover(){
		return this.alunos.remove(this.alunos.size() - 1);
	}
	
	public boolean vazia(){
		return this.alunos.size() == 0;
	}
}
