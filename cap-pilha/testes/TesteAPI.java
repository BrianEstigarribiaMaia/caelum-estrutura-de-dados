package br.com.caelum.ed.pilha.testes;

import java.util.Stack;

import br.com.caelum.ed.objetos.Aluno;

public class TesteAPI {

	public static void main(String[] args) {
		Stack<Aluno> pilha = new Stack<Aluno>();
		Aluno alunoA = new Aluno();
		Aluno alunoB = new Aluno();
		
		pilha.push(alunoA);
		pilha.push(alunoB);
		pilha.pop();
		
		if(pilha.isEmpty()){
			System.out.println("A pilha está vazia");
		}else{
			System.out.println("A pilha contem elementos");
		}
		
	}

}
