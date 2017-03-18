
public class Fatura {
	
	private String num_fatura,
	               descricao;
	private int quantidade;
	private double preco;

	/*CONSTRUTOR*/
	public Fatura(String num_fatura, String descricao, int quantidade, double preco) 
	{
		this.num_fatura = num_fatura;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	/*GET*/
	public String getNum_fatura() {
		return num_fatura;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}
	
	/*METODOS*/
	public double calculaTotalFatura()
	{
		return this.quantidade * this.preco;
	}
	
}
