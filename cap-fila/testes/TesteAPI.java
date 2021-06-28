package br.com.caelum.ed.fila.testes;

import java.util.LinkedList;
import java.util.Queue;

import br.com.caelum.ed.objetos.Aluno;
public class TesteAPI {

	public static void main(String[] args) {
		Queue<Aluno> fila = new LinkedList<Aluno>();
		Aluno alunoA = new Aluno();
		
		fila.offer(alunoA);
		fila.poll();
		
		if(fila.isEmpty()){
			System.out.println("A fila está vazia");
		}else{
			System.out.println("A fila contem elementos");
		}
		
	}

}
