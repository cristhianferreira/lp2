import java.util.Arrays;
public class Aluno implements Comparable<Aluno>{
	private String nome;	
	private int idade=0;			
	
	public void setIdade(int idade){
		this.idade=idade;
	}

	public int getIdade(){	
		return this.idade;
	}	
	public void setNome(String nome){
		this.nome=nome;
	}

	public String getNome(){	
		return this.nome;
	}	
	
	
}
