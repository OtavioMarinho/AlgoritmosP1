import java.util.Scanner;

public class multiplicacao {
	public static void main(String[] args) {
		int a, b;
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero da multiplica��o.");
		a = sc.nextInt();
		System.out.println("Digite o segundo n�mero da multiplica��o.");
		b = sc.nextInt();
		x = a*b;
		System.out.println("A multiplica��o dos dois n�meros �: "+ x);
}
	}
