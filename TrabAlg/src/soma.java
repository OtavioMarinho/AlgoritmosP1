import java.util.Scanner;
public class soma {
	public static void main(String[] args) {
		int a, b;
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero da soma.");
		a = sc.nextInt();
		System.out.println("Digite o segundo n�mero da soma.");
		b = sc.nextInt();
		x = a+b;
		System.out.println("A soma dos dois n�meros �: "+ x);

	}
}
