public class Nota {
	private double valor;		
	private Aluno aluno;	
	private Disciplina disciplina;	
	
	public void setValor(double valor){
		this.valor=valor;
	}

	public double getValor(){	
		return this.valor;
	}	

	public void setAluno(Aluno aluno){
		this.aluno=aluno;
	}

	public Aluno getAluno(){	
		return this.aluno;
	}	
	
	public void setDisciplina(Disciplina disciplina){
		this.disciplina=disciplina;
	}

	public Disciplina getDisciplina(){	
		return this.disciplina;
	}	
	
}


