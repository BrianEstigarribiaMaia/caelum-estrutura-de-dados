package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {

	private List<List<String>> tabela = new ArrayList<List<String>>();
	private int tamanho = 0;
	
	public ConjuntoEspalhamento(){
		for (int i = 0; i < 26; i++) {
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);
		}
	}
	
	private int calcularCodigoDeEspalhamento(String palavra){
		int codigo = 1;
		
		for(int i = 0; i < palavra.length(); i++){
			codigo = 31 * codigo + palavra.charAt(i);		
			}
		
		return codigo;
	}
	
	private int calcularIndiceDaTabela(String palavra){
		int codigoDeEspalhamento = this.calcularCodigoDeEspalhamento(palavra);
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % this.tabela.size();
	}
	
	public void adicionar(String palavra){
		if(!this.contem(palavra)){
			this.verificarCarga();
			int indice = this.calcularIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.add(palavra);
			this.tamanho++;
		}
	}

	public void remover(String palavra){
		if(this.contem(palavra)){
			int indice = this.calcularIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
			this.tamanho--;
			this.verificarCarga();
		}
	}

	public boolean contem(String palavra){
		int indice = this.calcularIndiceDaTabela(palavra);
		List<String> lista = this.tabela.get(indice);
		
		return lista.contains(palavra);
	}
	
	public List<String> pegarTodas(){
		List<String> palavras = new ArrayList<String>();
		
		for (int i = 0; i < this.tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		
		return palavras;
	}
	
	public void imprimirTabela(){
		for(List<String> lista : this.tabela){
			System.out.print("[");
			for(int i = 0; i < lista.size(); i++){
				System.out.print("*");
			}
			System.out.print("]");
		}
	}
	
	public void redimensionarTabela(int novaCapacidade){
		List<String> palavras = this.pegarTodas();
		this.tabela.clear();
		
		for(int i = 0; i < novaCapacidade; i++){
			this.tabela.add(new LinkedList<String>());
		}
		
		for(String palavra: palavras){
			this.adicionar(palavra);
		}
	}
	
	private void verificarCarga(){
		int capacidade = this.tabela.size();
		double carga = (double)this.tamanho / capacidade;
		
		if(carga > 0.75){
			this.redimensionarTabela(capacidade * 2);
		}else if (carga < 0.25) {
			this.redimensionarTabela(Math.max(capacidade / 2, 10));
		}
	}
	
	public int tamanho(){
        return this.tamanho;
    }
}
