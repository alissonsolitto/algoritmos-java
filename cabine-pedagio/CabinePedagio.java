
public class CabinePedagio {
	
	private double valor_auto2Eixos;
	private double valor_autoEixoExtra;
	private double valor_caminhao2Eixos;
	private double valor_caminhaoEixoExtra;
	private double valor_motocicleta;
	
	private double valor_total;	
	private static int qtd_veiculos;

	public CabinePedagio(double valor_auto2Eixos, double valor_autoEixoExtra,
			double valor_caminhao2Eixos, double valor_caminhaoEixoExtra,
			double valor_motocicleta) 
	{		
		this.valor_auto2Eixos = valor_auto2Eixos;
		this.valor_autoEixoExtra = valor_autoEixoExtra;
		this.valor_caminhao2Eixos = valor_caminhao2Eixos;
		this.valor_caminhaoEixoExtra = valor_caminhaoEixoExtra;
		this.valor_motocicleta = valor_motocicleta;
		this.valor_total = 0.0;
	}

	public double getValor_auto2Eixos() {
		return valor_auto2Eixos;
	}

	public double getValor_autoEixoExtra() {
		return valor_autoEixoExtra;
	}

	public double getValor_caminhao2Eixos() {
		return valor_caminhao2Eixos;
	}

	public double getValor_caminhaoEixoExtra() {
		return valor_caminhaoEixoExtra;
	}

	public double getValor_motocicleta() {
		return valor_motocicleta;
	}

	public double getValor_total() {
		return valor_total;
	}	

	public static int getQtd_veiculos() {
		return qtd_veiculos;
	}	
	
	public int EntraCabine(Veiculos v)
	{
		if(!(v instanceof Veiculos))
		  return 0;
		else
		{
			if(v instanceof Automovel)
			{
				Automovel a = (Automovel)v;
				if(a.getNum_eixo() > 2)
				  this.valor_total += this.valor_autoEixoExtra;
				else
				  this.valor_total += this.valor_auto2Eixos;				  
			}
			else if(v instanceof Caminhao)
			{
				Caminhao c = (Caminhao)v;
				if(c.getNum_eixo() > 2)
				  this.valor_total += this.valor_caminhaoEixoExtra;
				else
				  this.valor_total += this.valor_caminhao2Eixos;				  
			}
			else if(v instanceof Motocicleta)
			{
				Motocicleta a = (Motocicleta)v;
			    this.valor_total += this.valor_motocicleta;				  
			}
			
			this.qtd_veiculos++;
			return 1;
		}
	}
	
	
	
	

}
