import java.util.Scanner;


public class TesteRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo r;
		double comprimento, largura;
		int op = 0;
		
		System.out.println("Digite o comprimento do retangulo:");
		comprimento = sc.nextInt(); sc.nextLine();
		
		System.out.println("Digite a largura do retangulo:");
		largura = sc.nextInt(); sc.nextLine();
		
		r = new Retangulo(comprimento, largura);
		
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("1 - Calcular a area do retangulo");
		System.out.println("2 - Calcular o perimetro do retangulo");
		op = sc.nextInt(); sc.nextLine();
		
		switch(op)
		{
			case 1: System.out.println("Area = " + r.area()); break;
			case 2: System.out.println("Perimetro = " + r.perimeto()); break;
		    default: break;
		}
					

	}

}
