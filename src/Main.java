import java.util.Locale;
import java.util.Scanner;

public class Main {
	/* */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a largura do terreno");
		double largura = sc.nextDouble();
		System.out.println("digite o comprimento do terreno");
		double comprimento = sc.nextDouble();
		System.out.println("digite o valor do metro quadrado");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO TOTAL = %.2f%n", preco);
		sc.close();
	}
}