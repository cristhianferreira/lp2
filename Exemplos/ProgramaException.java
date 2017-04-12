public class ProgramaException{
	private int variavel;

	public static void main(String [] args){
		testeException1();
	} 
	public static void testeException1(){
		int[] vetor1= new int[5];
		System.out.println("Teste exception");
		try{
			vetor1[6] = 10;	
			System.out.println("Teste exception - Apos o erro");
		}
		catch(Exception e){
			System.out.println("Um erro ocorre erro foi:");
			e.printStackTrace();	
		}
	}	



}
