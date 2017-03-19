import java.util.Arrays;
public class Nota implements Comparable<Notas>{
	private double valor;		
	private Aluno aluno;	
	private Disciplina disciplina;	
	
	public Notas( double valor ,Aluno aluno,Disciplina disciplina){
		this.valor = valor;
		this.aluno = aluno;
		this.disciplina = disciplina;
	}
	public void setAluno(Aluno aluno){
		this.aluno=aluno;
	}

	public Aluno getAluno(){	
		return this.aluno;
	}	
	public void setValor(double valor){
		this.valor=valor;
	}

	public double getValor(){	
		return this.valor;
	}	

	public void setDisciplina(Disciplina disciplina){
		this.disciplina=disciplina;
	}

	public Disciplina getDisciplina(){	
		return this.disciplina;
	}
	public int compareTo(Notas outro){
	if(this.valor < outro.getValor()){
		return 1;
	}else if (this.valor > outro.getValor()){
		return -1;
	}else{
		return 0;
	}
}
	
}


