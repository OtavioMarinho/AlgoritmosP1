import java.util.Scanner;

public class divisao {
	public static void main(String[] args) {
		int a, b;
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número da divisão.");
		a = sc.nextInt();
		System.out.println("Digite o segundo número da divisão.");
		b = sc.nextInt();
		x = a/b;
		System.out.println("A divisão dos dois números é: "+ x);
}
	}