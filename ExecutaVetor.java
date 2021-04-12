package br.com.caelum.ed;

public class ExecutaVetor {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.setNome("Marcos");
		aluno2.setNome("Rogério");
		aluno3.setNome("Clemer");
		
		Vetor lista = new Vetor();
		lista.adicionar(aluno1);
		lista.adicionar(aluno2);
		
		System.out.println("Lista de alunos:  "+lista);
		System.out.println("Quantidade de Alunos na lista "+lista.tamanho());
		System.out.println("Aluno Marcos está na lista ? : "+lista.contem(aluno1));
		System.out.println("Mostrando aluno na primeira posição: "+lista.pegar(0));
		
		lista.adicionarNaPosicao(0, aluno3);
		System.out.println("Aluno Clemer adicionado na primeira posição: "+lista);
		System.out.println("Quantidade de Alunos na lista "+lista.tamanho());
		System.out.println("Mostrando aluno na primeira posição: "+lista.pegar(0));
		lista.remover(2);
		System.out.println("Remover aluno Rogerio da lista: "+lista);
		
	}

}
