import java.util.Scanner;


public class TesteFatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Fatura f;
		
		String num_fatura,
               descricao;
        int quantidade;
        double preco;
		
		System.out.println("Digite o numero da fatura");
		num_fatura = sc.nextLine();
		
		System.out.println("Digite a descricao da fatura");
		descricao = sc.nextLine();
		
		System.out.println("Digite o preco unitario");
		quantidade = sc.nextInt();sc.nextLine();
		
		System.out.println("Digite a quantidade");
		preco = sc.nextDouble();sc.nextLine();
		
		f = new Fatura(num_fatura, descricao, quantidade, preco);
		
		System.out.println("Total da fatura e R$" + f.calculaTotalFatura());		

	}

}
