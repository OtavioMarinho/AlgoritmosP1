import java.util.Scanner;

public class restoDivisao {
	public static void main(String[] args) {
		int a, b;
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero da divis�o.");
		a = sc.nextInt();
		System.out.println("Digite o segundo n�mero da divis�o.");
		b = sc.nextInt();
		x = a%b;
		System.out.println("O resto da divis�o dos dois n�meros �: "+ x);
}
	}
