public class Principal{
	public static void main(String[] args){
		FabricaDeCarro f1= FabricaDeCarro.getInstance();  
		FabricaDeCarro f2= FabricaDeCarro.getInstance();
		FabricaDeCarro f3= FabricaDeCarro.getInstance();
		FabricaDeCarro f4= FabricaDeCarro.getInstance();
		f2.fiat = 89;
		
		systen.ou.println(f2.fiat);
	}

}
