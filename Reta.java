public class Reta{
	private Ponto p1,p2,p4;

	public void setP1(Ponto p){
		this.p1=p;
	}
	public void setP2(Ponto p){
		this.p2=p;
	}
	public void setP4(Ponto p){
		this.p4=p;
	}
	public Ponto getP1(){
		return this.p1;
	}
	public Ponto getP2(){
		return this.p2;
	}
	public Ponto getP4(){
		return this.p4;
	}
	public double Trapezio(){
		double altura= (p4.getX()-p1.getX());
		double bases= (p4.getY()+p1.getY());
		double area= (bases*altura)*0.5;
		return area;
	}
}
