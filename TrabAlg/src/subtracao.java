import java.util.Scanner;

public class subtracao {
	public static void main(String[] args) {
		int a, b;
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número da subtração.");
		a = sc.nextInt();
		System.out.println("Digite o segundo número da subtração.");
		b = sc.nextInt();
		x = a-b;
		System.out.println("A subtração dos dois números é: "+ x);
}
}