public class Disciplina{
	private String nome;	
	private String professor;			
	
	public Disciplina(String nome , String professor ){
	this.nome = nome;
	this.professor = professor ;   
	} 
	
	public void setProf(String professor){
		this.professor=professor;
	}

	public String getProf(){	
		return this.professor;
	}	

	public void setNome(String nome){
		this.nome=nome;
	}

	public String getNome(){	
		return this.nome;
	}	
}



