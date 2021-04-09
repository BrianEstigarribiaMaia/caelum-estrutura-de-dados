package br.com.caelum.ed;

public class VetorAlunos {

	private Aluno [] alunos = new Aluno [100];
	
	private int totalDeAlunos = 0;
	
	public void adicionarNoFim(Aluno aluno){
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	public void adicionarNaPosicao(int posicao, Aluno aluno){
		if(!this.verificarPosicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição Invalida");
		}
		for(int i = this.totalDeAlunos - 1; i >= posicao; i -= 1){
			this.alunos[i + 1] = this.alunos[i];
		}
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}
	
	public Aluno mostrarAlunoNaPosicao(int posicao){
		if(!this.verificarPosicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição Invalida");
		}
		return this.alunos[posicao];
	}
	
	private boolean verificarPosicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.totalDeAlunos;
	}
	
	
	public void removerAluno(int posicao){
		if(!this.verificarPosicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição Invalida");
		}
		
		for(int i = posicao; i < this.totalDeAlunos - 1; i++){
			this.alunos[i] = this.alunos[i + 1];
		}
		this.totalDeAlunos--;
	}
	
	public boolean contemAlunoNaLista(Aluno aluno){
		for(int i = 0; i < this.totalDeAlunos; i++){
			if(aluno.equals(this.alunos[i])){
				return true;
			}
		}
		return false;
	}
	
	public int QuantidadeDeAlunos(){
		return this.totalDeAlunos;
	}
	
	public String toString(){
		if(this.totalDeAlunos == 0){
			return "[]";
		}
		
		StringBuilder construir = new StringBuilder();
		construir.append("[");
		
		for(int i = 0; i < this.totalDeAlunos -1; i++){
			construir.append(this.alunos[i]);
			construir.append(", ");
		}
		
		construir.append(this.alunos[this.totalDeAlunos - 1]);
		construir.append("]");
		
		return construir.toString();
	}
}
