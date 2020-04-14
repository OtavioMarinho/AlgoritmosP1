import java.util.Scanner;

public class multiplicacao {
	public static void main(String[] args) {
		int a, b;
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número da multiplicação.");
		a = sc.nextInt();
		System.out.println("Digite o segundo número da multiplicação.");
		b = sc.nextInt();
		x = a*b;
		System.out.println("A multiplicação dos dois números é: "+ x);
}
	}
