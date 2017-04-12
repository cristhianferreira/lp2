public class ProgramaException2{
	private int variavel;

	public static void main(String [] args){
		testeException2();
	} 
	public static void testeException2(){
		int[] vetor1= new int[5];
		System.out.println("Teste exception 2");
		try{
			vetor1[6] = 10;	
			System.out.println("Teste exception - Apos o erro");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Um erro ocorre erro foi:");				
		}
	}	



}
