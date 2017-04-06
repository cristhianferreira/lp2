Public class Singleton{
	private static Singleton  instancia;
	private Singleton(){
	}
	public static synchronized singleton getInstancia(){
		if(instancia == null ){
			instancia= new singleton(); 
		}
		return instancia;
	}


}
