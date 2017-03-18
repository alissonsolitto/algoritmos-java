import java.util.Scanner;


public class Teste {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		Quadrilatero q;
		Point a,b,c,d;
		int x,y;
		
		/*Atribuindo a coordenada do ponto A*/
		System.out.println("Digite o coordenada do ponto A");
		System.out.print("X: ");
		x = sc.nextInt();sc.nextLine();
		System.out.print("Y: ");
		y = sc.nextInt();sc.nextLine();
		
		a = new Point(x, y);
		
		/*Atribuindo a coordenada do ponto B*/
		System.out.println("Digite o coordenada do ponto B");
		System.out.print("X: ");
		x = sc.nextInt();sc.nextLine();
		System.out.print("Y: ");
		y = sc.nextInt();sc.nextLine();
		
		b = new Point(x, y);
		
		/*Atribuindo a coordenada do ponto C*/
		System.out.println("Digite o coordenada do ponto C");
		System.out.print("X: ");
		x = sc.nextInt();sc.nextLine();
		System.out.print("Y: ");
		y = sc.nextInt();sc.nextLine();
		
		c = new Point(x, y);
		
		/*Atribuindo a coordenada do ponto D*/
		System.out.println("Digite o coordenada do ponto D");
		System.out.print("X: ");
		x = sc.nextInt();sc.nextLine();
		System.out.print("Y: ");
		y = sc.nextInt();sc.nextLine();
		
		d = new Point(x, y);
		
		/*Criando o quadrilatero*/
		q = new Quadrilatero(a, b, c, d);
		
		System.out.println(q.getCoordenadas());

	}

}
