import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//ler um caracter
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char x;
		x= sc.next().charAt(0);
		System.out.println("Voc� digitou:" +  x);
		
		sc.close();
		
	}

}
