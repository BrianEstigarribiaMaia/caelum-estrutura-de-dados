package br.com.caelum.ed.pilha.testes;

import br.com.caelum.ed.objetos.Aluno;
import br.com.caelum.ed.pilha.PilhaParametrizada;

public class TestePilha {

	public static void main(String[] args) {
		PilhaParametrizada<Aluno> pilha = new PilhaParametrizada<Aluno>();
		Aluno alunoA = new Aluno();
		Aluno alunoB = new Aluno();
		
		pilha.inserir(alunoA);
		pilha.inserir(alunoB);
		
		pilha.remover();
		pilha.remover();
		
		if(pilha.vazia()){
			System.out.println("A pilha está vazia");
		}else{
			System.out.println("A pilha contem elementos");
		}
		

	}

}
