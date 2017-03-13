import java.util.ArrayList;	
import java.util.Collections;
import java.util.Arrays;
public class Principal{
	public static void main(){
	ArrayList< Aluno> alunos = new ArrayList< Aluno >();

	Aluno alunoa = new Aluno();	
	alunoa.setNome("Joaozinho");	
	alunoa.setIdade(15);	
	alunos.add (alunoa);

	Aluno alunob = new Aluno();	
	alunob.setNome("Joaozinho");	
	alunob.setIdade(15);	
	alunos.add (alunob);

	Aluno alunoc = new Aluno();	
	alunoc.setNome("cleuso");	
	alunoc.setIdade(15);	
	alunos.add (alunoc);

	Aluno alunod = new Aluno();	
	alunod.setNome("margot");	
	alunod.setIdade(15);	
	alunos.add (alunod);

	Aluno alunoe = new Aluno();	
	alunoe.setNome("luene");	
	alunoe.setIdade(15);	
	alunos.add (alunoe);

	

	
	Collections.sort(alunos);/*ordenando...*/	

	
	for(int i = 0; i < 5; i++){
                        System.out.println(alunos.get(i).getIdade() +"--"+ alunos.get(i).getNome());
       }
	

	}
}
