package br.com.caelum.ed.fila;

import java.util.LinkedList;
import java.util.List;

public class FilaGenerica {
	private List<Object> objetos = new LinkedList<Object>();

	public void inserir(Object objeto){
		this.objetos.add(objeto);
	}
	
	public Object remover(){
		return this.objetos.remove(0);
	}
	
	public boolean vazia(){
		return this.objetos.size() == 0;
	}
}
