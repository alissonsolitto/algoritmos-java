
public class Retangulo {
	
	double comprimento, largura;
	
	public Retangulo(double comprimento, double largura)
	{
		this.comprimento = comprimento;
		this.largura     = largura;		
	}
	
	public double area()
	{
		return (this.comprimento * this.largura);
	}
	
	public double perimeto()
	{
		return (this.comprimento + this.largura) * 2;
	}

}
