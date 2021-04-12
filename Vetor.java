package br.com.caelum.ed;

public class Vetor {

	private Object [] objetos = new Object [100];
	
	private int totalDeObjetos = 0;
	
	public void adicionar(Object objeto){
		this.garantirEspaco();
		this.objetos[this.totalDeObjetos] = objeto;
		this.totalDeObjetos++;
	}
	
	public void adicionarNaPosicao(int posicao, Aluno aluno){
		this.garantirEspaco();
		if(!this.posicaoValida(posicao)){
			throw new IllegalArgumentException("Posição Invalida");
		}
		for(int i = this.totalDeObjetos - 1; i >= posicao; i --){
			this.objetos[i + 1] = this.objetos[i];
		}
		this.objetos[posicao] = aluno;
		this.totalDeObjetos++;
	}
	
	public Object pegar(int posicao){
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição Invalida");
		}
		return this.objetos[posicao];
	}
	
	public void remover(int posicao){
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição Invalida");
		}
		
		for(int i = posicao; i < this.totalDeObjetos - 1; i++){
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totalDeObjetos--;
	}
	
	public boolean contem(Aluno aluno){
		for(int i = 0; i < this.totalDeObjetos; i++){
			if(aluno.equals(this.objetos[i])){
				return true;
			}
		}
		return false;
	}
	
	public int tamanho(){
		return this.totalDeObjetos;
	}
	
	private void garantirEspaco(){
		if(this.totalDeObjetos == this.objetos.length){
			Object [] novoArray = new Object[this.objetos.length * 2];
			for(int i = 0; i < this.objetos.length; i++){
				novoArray[i] = this.objetos[i];
			}
			this.objetos = novoArray;
		}
	}
	
	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.totalDeObjetos;
	}
	
	private boolean posicaoValida(int posicao){
		return posicao >= 0 && posicao <= this.totalDeObjetos;
	}
	
	public String toString(){
		if(this.totalDeObjetos == 0){
			return "[]";
		}
		
		StringBuilder construir = new StringBuilder();
		construir.append("[");
		
		for(int i = 0; i < this.totalDeObjetos -1; i++){
			construir.append(this.objetos[i]);
			construir.append(", ");
		}
		
		construir.append(this.objetos[this.totalDeObjetos - 1]);
		construir.append("]");
		
		return construir.toString();
	}
}
