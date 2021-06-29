package br.com.caelum.ed.pilha;

import java.util.LinkedList;
import java.util.List;

public class PilhaGenerica {
	private List<Object> objetos = new LinkedList<Object>();

	public void inserir(Object objeto){
		this.objetos.add(objeto);
	}
	
	public Object remover(){
		return this.objetos.remove(this.objetos.size() - 1);
	}
	
	public boolean vazia(){
		return this.objetos.size() == 0;
	}
}
