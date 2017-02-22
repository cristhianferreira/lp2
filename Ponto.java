public class Ponto{
	private double x,y;
	public void setX(double x){
    	this.x = x;
	}
	public double getX(){
		return x;
	}
	public void setY(double y){
    	this.y = y;
	}
	public double getY(){
		return y;
	}
	public static void main(String [] args){
		Ponto  p1 = new Ponto();
		p1.setX(10);
		p1.setY(20); 
		Ponto  p2 = new Ponto();		
        Ponto  p4 = new Ponto();
		p4.setX(70);
		p4.setY(80);
        System.out.println("Altura p4= "+p4.getY() + "Largura p4= "+ p4.getX());
		System.out.println("Altura p1= "+p1.getY() + "Largura p1= "+ p1.getX());
        double al= p4.getY()- p1.getY();
        double lar= p4.getX()- p1.getX();
		System.out.println("Distancia entre as alturas= "+ al);
        System.out.println("Distancia entre as larguras= "+ lar);
        double dis1= al*al+ lar*lar;
        double dis2 = Math.sqrt(dis1);
        System.out.println("Distancia entre as p4 e p1= "+ dis2);
	}
}
