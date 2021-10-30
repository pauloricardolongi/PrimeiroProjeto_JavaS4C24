
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x !=0) {
			soma = soma + x; /* exemplo: soma= 0 + 5-> soma =5
			4 e 0 total 9 */
			x = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();
	}
}