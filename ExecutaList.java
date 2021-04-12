package br.com.caelum.ed;

import java.util.ArrayList;
import java.util.Iterator;

public class ExecutaList {

	public static void main(String[] args) {
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno brian = new Aluno();
		Aluno carolina = new Aluno();
		Aluno eduardo = new Aluno();
		Aluno juca = new Aluno();
		
		brian.setNome("Brian");
		carolina.setNome("Carolina");
		eduardo.setNome("Eduardo");
		juca.setNome("Juca");
		
		lista.add(brian);
		lista.add(carolina);
		lista.add(juca);
		
		System.out.println("Lista de alunos:  ");
		
		Iterator<Aluno> it = lista.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("Quantidade de Alunos na lista "+lista.size());
		System.out.println("Aluno Brian está na lista ? : "+lista.contains(brian));
		System.out.println("Mostrando aluno na primeira posição: "+lista.get(0));
		
		lista.add(0, eduardo);
		
		System.out.println("Remover aluno Juca da lista: "+lista.remove(3));
		System.out.println("Lista de alunos:  "+lista);
		
	
	}
}
