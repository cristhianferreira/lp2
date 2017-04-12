public class ProgramaException3{
	private int variavel;

	public static void main(String [] args){
			testeException3();
	} 
	public static void testeException3(){
		int[] vetor1= new int[5];
		System.out.println("Teste exception 2");
		try{
			vetor1[6] = 10;	
			System.out.println("Teste exception - Apos o erro");
		}
		catch(NullPointerException e){
			System.out.println("Um erro ocorre erro foi:");				
		}
		finally{
			System.out.println("Teste exception 3-apos o catch");
		}
	}	



}
