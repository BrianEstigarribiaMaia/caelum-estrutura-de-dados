package br.com.caelum.ed.lista;

public class ListaDuplamenteEncadeada {
	
	private Celula primeira, ultima;
	private int totalDeElementos;

	public Celula getPrimeira() {
		return primeira;
	}

	public void setPrimeira(Celula primeira) {
		this.primeira = primeira;
	}

	public Celula getUltima() {
		return ultima;
	}

	public void setUltima(Celula ultima) {
		this.ultima = ultima;
	}

	public int getTotalDeElementos() {
		return totalDeElementos;
	}

	public void setTotalDeElementos(int totalDeElementos) {
		this.totalDeElementos = totalDeElementos;
	}

	public void adicionar(Object elemento){
		if(this.totalDeElementos == 0){
			this.adicionarNoComeco(elemento);
		}else{
			Celula nova = new Celula(elemento);
			this.ultima.setProximo(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}

	public void adicionarNaPosicao(int posicao, Object elemento){
		if(posicao == 0){ 
			this.adicionarNoComeco(elemento);
		}else if(posicao == this.totalDeElementos){ 
			this.adicionar(elemento);
		}else{
			Celula anterior = this.pegarCelula(posicao -1);
			Celula proxima = anterior.getProximo();
			Celula nova = new Celula(anterior.getProximo(), elemento);
			
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			proxima.setAnterior(proxima);
			
			this.totalDeElementos++;
		}
	}

	public void adicionarNoComeco(Object elemento){
		if(this.totalDeElementos == 0){
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		}else{
			Celula nova = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		
		this.totalDeElementos++;
	}

	public void remover(int posicao){
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição não existe!");
		}
		if(posicao == 0){
			this.removerNoComeco();
		}else if(posicao == this.totalDeElementos - 1){
			this.removerNoFim();
		}else{
			Celula anterior = this.pegarCelula(posicao - 1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			this.totalDeElementos--;
		}
	}

	public void removerNoComeco(){
		if(!this.posicaoOcupada(0)){
			throw new IllegalArgumentException("Posição não existe!");
		}

		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;

		if(this.totalDeElementos == 0){
			this.ultima = null;
		}
	}

	public void removerNoFim(){
		if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		if(this.totalDeElementos == 1){
			this.removerNoComeco();
		}else{
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}

	public Object pegar(int posicao){
		return this.pegarCelula(posicao).getElemento();
	}

	public int tamanho(){
		return this.totalDeElementos;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	public boolean contem(Object elemento){
		Celula atual = this.primeira;
		while(atual != null){
			if(atual.getElemento().equals(elemento)){
				return true;
			}
			atual = atual.getProximo();
		}
		
		return false;
	}

	private Celula pegarCelula(int posicao) {
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição não existe");
		}
		
		Celula atual = primeira;
		for(int i = 0; i < posicao; i++){
			atual = atual.getProximo();
		}
		return atual;
	}

	public String toString() {
        
        if(this.totalDeElementos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
       
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();
        }
       
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
}


