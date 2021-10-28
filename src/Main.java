import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* Problema exemplo:
		 Uma operadora de telefonia cobra R$50,00 por um plano b�sico que d� direito a 100 minutos de telefone.
		 Cada minuto que exceder  a franquia de 100 minutos custa R$2,00.Fazer um programa para ler a quantidade
		 de minutos que uma pessoa consumiu, da� mostrar o valor a ser pago.
		 ENTRADA                                     SA�DA
		 22MINUTOS                                 VALOR A PAGAR R$50,00
		 103 MINUTOS                               VALOR A PAGAR R$ R$56,00*/
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		int minutos= sc.nextInt(); //quantidade de minutos consumido
		
		double conta = 50.0; //valor da conta
		if(minutos > 100) {
			conta = conta + (minutos - 100)* 2.0; //calcular o excedente e multiplicar por 2.0
		}
		 System.out.printf("Valor da conta = R$ %.2f%n",conta );
		
		sc.close();
	}
}