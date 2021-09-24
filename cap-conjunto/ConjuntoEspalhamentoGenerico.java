package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamentoGenerico {
    
    private List<List<Object>> tabela = new ArrayList<List<Object>>();
    
    private int tamanho = 0;
    
    public ConjuntoEspalhamentoGenerico(){
        for(int i = 0; i < 26; i++){
            LinkedList<Object> lista = new LinkedList<Object>();
            tabela.add(lista);
        }
    }
    
    private int calculaIndiceDaTabela(Object objeto){
        int codigoDeEspalhamento = objeto.hashCode();
        codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
        return codigoDeEspalhamento % tabela.size();
    }
    
      
    private void redimensionaTabela(int novaCapacidade){
        List<Object> objetos = this.pegaTodas();
        this.tabela.clear();
        
        for (int i = 0; i < novaCapacidade; i++){
            this.tabela.add(new LinkedList<Object>());
        }
        
        for (Object objeto : objetos){
            this.adiciona(objeto);
        }
    }
    
    private void verificaCarga(){
        int capacidade = this.tabela.size();
        double carga = (double) this.tamanho / capacidade;
        
        if (carga > 0.75){
            this.redimensionaTabela(capacidade * 2);
        }else if(carga < 0.25){
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }
    }
    
    public boolean contem(Object objeto){
        int indice = this.calculaIndiceDaTabela(objeto);
        List<Object> lista = this.tabela.get(indice);
        
        return lista.contains(objeto);
    }
    
    public void adiciona(Object objeto){
        if(!this.contem(objeto)){
            this.verificaCarga();
            int indice = this.calculaIndiceDaTabela(objeto);
            List<Object> lista = this.tabela.get(indice);
            lista.add(objeto);
            this.tamanho++;
        }
    }
    
    public void remove(Object objeto){
        if(this.contem(objeto)){
            this.verificaCarga();
            int indice = this.calculaIndiceDaTabela(objeto);
            List<Object> lista = this.tabela.get(indice);
            lista.remove(objeto);
            this.tamanho--;
        }
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    
    public void imprimeTabela(){
        for (List<Object> lista : this.tabela){
            System.out.print("[");
            for (int i = 0; i < lista.size(); i++){
                System.out.print("*");
            }
            System.out.println("]");
        }
    }
    
    public List<Object> pegaTodas(){
        List<Object> palavras = new ArrayList<Object>();
        
        for(int i = 0; i < this.tabela.size(); i++){
            palavras.addAll(this.tabela.get(i));
        }
        
        return palavras;
    }
    
}
