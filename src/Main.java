import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	
		/*concatenar vários elementos:
		 %f= ponto flutuante - 4000.0
		 %d= inteiro- 31 anos
		 %s = texto - Maria
		 %n= quebra de linha
		 */
		String nome= "Maria";
		int idade= 31;
		double renda= 4000.0;
		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n",nome, idade, renda);
		
		
		
		
		


	}

}
