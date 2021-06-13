package br.com.caelum.ed.lista;

public class AlunoLista {

	private String nome;
	private int idade;
	private AlunoLista proximo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public AlunoLista getProximo() {
		return proximo;
	}
	
	public void setProximo(AlunoLista proximo) {
		this.proximo = proximo;
	}
}
