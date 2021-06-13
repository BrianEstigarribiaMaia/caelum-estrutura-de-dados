public class Aluno {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean equals(Object objeto){
		Aluno outroAluno = (Aluno)objeto;
		return this.nome.equals(outroAluno.nome);
	}
	
	public String toString(){
		return "Nome: "+ this.nome;
	}
}
