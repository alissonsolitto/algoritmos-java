import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int op = 0;
		
		int ano, num_eixo = 0;
		String modelo, marca, placa;
		
		double valor_auto2Eixos;
		double valor_autoEixoExtra;
		double valor_caminhao2Eixos;
		double valor_caminhaoEixoExtra;
		double valor_motocicleta;	
		
		CabinePedagio cp;
		Automovel a = null;
		Caminhao c = null;
		Motocicleta m = null;
		
		//Criando cabine
		System.out.println("Digite o valor de automovel 2 eixos");
		valor_auto2Eixos = sc.nextDouble(); sc.nextLine();
		
		System.out.println("Digite o valor de automovel eixo extra");
		valor_autoEixoExtra = sc.nextDouble(); sc.nextLine();
		
		System.out.println("Digite o valor de caminhao 2 eixos");
		valor_caminhao2Eixos = sc.nextDouble(); sc.nextLine();
		
		System.out.println("Digite o valor de caminhao eixo extra");
		valor_caminhaoEixoExtra = sc.nextDouble(); sc.nextLine();	
		
		System.out.println("Digite o valor para motocicleta");
		valor_motocicleta = sc.nextDouble(); sc.nextLine();
		
		
		cp = new CabinePedagio(valor_auto2Eixos, 
				               valor_autoEixoExtra, 
				               valor_caminhao2Eixos, 
				               valor_caminhaoEixoExtra, 
				               valor_motocicleta);	
		
		//Criando veiculos
		for(int i = 0; i < 3; i++)
		{
			switch(i)
			{
			  case 0: System.out.println("Criando automovel"); break;
			  case 1: System.out.println("Criando caminhao"); break;
			  case 2: System.out.println("Criando uma motocicleta"); break;
			}
			
			System.out.println("Digite o ano");
			ano = sc.nextInt(); sc.nextLine();
			
			System.out.println("Digite o modelo");
			modelo = sc.nextLine();
			
			System.out.println("Digite o marca");
			marca = sc.nextLine();
			
			System.out.println("Digite o placa");
			placa = sc.nextLine();
			
			if(i != 2)
			{
				System.out.println("Digite o numero de eixos");
				num_eixo = sc.nextInt(); sc.nextLine();
			}
			
			switch(i)
			{
			  case 0: a = new Automovel(ano, modelo, marca, placa, num_eixo); break;
			  case 1: c = new Caminhao(ano, modelo, marca, placa, num_eixo); break;
			  case 2: m = new Motocicleta(ano, modelo, marca, placa); break;
			}
		}
	
		do
		{			
			System.out.println("Qual veiculo vai passar na cabine: ");
			System.out.println("1 - Automovel");
			System.out.println("2 - Caminhao");
			System.out.println("3 - Motocicleta");
			System.out.println("0 - Sair");
			op = sc.nextInt();sc.nextLine();
			
			switch(op)
			{
			  case 1: cp.EntraCabine(a); break;
			  case 2: cp.EntraCabine(c); break;
			  case 3: cp.EntraCabine(m); break;
			  default: op = 0; break;
			}
			
		}while (op != 0);	
		
		System.out.println("Valor total da cabine: " + cp.getValor_total());
		System.out.println("Quantidade de veiculos que passou na cabine: " + cp.getQtd_veiculos());
		

	}

}
