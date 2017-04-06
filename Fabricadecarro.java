private class FabricaDeCarro{
	private static FabricaDeCarro instancia;
	private FabricaDeCarro(){
	}
	protected int fiat;
	protected int ford;
	protected int volks;

	public static FabricaDeCarro getIntancia(){
	if(instancia==null)
		instancia=new FabricaDeCarro();
	return instancia;
	}
}
