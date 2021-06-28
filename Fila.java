package br.com.caelum.ed.fila;

import java.util.LinkedList;
import java.util.List;
import br.com.caelum.ed.objetos.Aluno;

public class Fila {
	private List<Aluno> alunos = new LinkedList<Aluno>();

	public void inserir(Aluno aluno){
		this.alunos.add(aluno);
	}
	
	public Aluno remover(){
		return this.alunos.remove(0);
	}
	
	public boolean vazia(){
		return this.alunos.size() == 0;
	}

}
