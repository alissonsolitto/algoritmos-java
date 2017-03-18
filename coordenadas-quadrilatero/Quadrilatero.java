
public class Quadrilatero {
	
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	public Quadrilatero(Point a, Point b, Point c, Point d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public String getCoordenadas()
	{
		return "\nA: " + this.a.getCoordenada() +
			   "\nB: " + this.b.getCoordenada() +
			   "\nC: " + this.c.getCoordenada() +
			   "\nD: " + this.d.getCoordenada();				
	}

}
