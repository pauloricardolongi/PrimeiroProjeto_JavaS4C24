import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	
		int y=32;
		double x= 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);//virgula portugu�s
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);//ingles
		System.out.println("resultado = " + x + " metros");//concatenar
		System.out.printf("resultado = %.2f metros %n", x);
		
		
		
		


	}

}
