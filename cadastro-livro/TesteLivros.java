import java.util.Scanner;


public class TesteLivros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome,
	           autor,
	           editora;	
	    
		int ano,
		    qtd = 0;
		
		
		System.out.println("Digite quantos livros deseja cadastrar:");
		qtd = sc.nextInt();sc.nextLine();
		
		Livro livro[] = new Livro[qtd];
	
		for(int i = 0; i < qtd; i++)
		{	
		
			System.out.println("Digite o nome do livro:");
			nome = sc.nextLine();
			
			System.out.println("Digite o autor do livro:");
			autor = sc.nextLine();
			
			System.out.println("Digite a editora do livro:");
			editora = sc.nextLine();
			
			System.out.println("Digite o ano do livro:");
			ano = sc.nextInt();sc.nextLine();
			
			livro[i] = new Livro(nome, autor, editora, ano);
		
		}
		
		for(int i = 0; i < 20; i++)
		  System.out.print("-");
		
		System.out.print("Lista de livros cadastrados");
		
		for(int i = 0; i < 20; i++)
			  System.out.print("-");
		
		for (Livro aux : livro) {
			
			System.out.println("Nome do livro:" + aux.nome);
			System.out.println("Nome do autor:" + aux.autor);
			System.out.println("Nome da editora:" + aux.editora);
			System.out.println("Ano do livro:" + aux.ano + "\n");
			
		}	

	}

}
