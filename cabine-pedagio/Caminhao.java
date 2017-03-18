
public class Caminhao extends Veiculos{
	
	private int num_eixo;

	public Caminhao(int ano, String modelo, String marca, String placa,
			int num_eixo) {
		super(ano, modelo, marca, placa);
		this.num_eixo = num_eixo;
	}

	public int getNum_eixo() {
		return num_eixo;
	}

	public void setNum_eixo(int num_eixo) {
		this.num_eixo = num_eixo;
	}


}
