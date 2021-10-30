
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/* while - enquanto for verdadeiro pula fora
		  e volta
		 */
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x !=0) {
			x = sc.nextInt();
		}
		sc.close();
	}
}