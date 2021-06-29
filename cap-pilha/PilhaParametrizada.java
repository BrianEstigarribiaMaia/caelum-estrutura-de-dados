package br.com.caelum.ed.pilha;

import java.util.LinkedList;
import java.util.List;

public class PilhaParametrizada<T> {
	private List<T> objetos = new LinkedList<T>();

	public void inserir(T t){
		this.objetos.add(t);
	}
	
	public T remover(){
		return this.objetos.remove(this.objetos.size() - 1);
	}
	
	public boolean vazia(){
		return this.objetos.size() == 0;
	}
}
