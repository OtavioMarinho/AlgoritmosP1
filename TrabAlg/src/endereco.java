import java.util.Scanner;

public class endereco {
	public static void main(String[] args) {
		String a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome.");
		a = sc.next();
		System.out.println("Boas vindas," + a);
		System.out.println("Digite sua idade e cidade onde mora.");
		b = sc.next();
		c = sc.next();
		System.out.println(a + " de " + b + " anos, morador de " + c);
}
	}
