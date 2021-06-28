package br.com.caelum.ed.fila.testes;

import br.com.caelum.ed.fila.Fila;
import br.com.caelum.ed.objetos.Aluno;

public class TesteFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Aluno alunoA = new Aluno();
		Aluno alunoB = new Aluno();
		
		fila.inserir(alunoA);
		fila.inserir(alunoB);
		
		fila.remover();
		
		if(fila.vazia()){
			System.out.println("A fila está vazia");
		}else{
			System.out.println("A fila contem elementos");
		}
	}

}
