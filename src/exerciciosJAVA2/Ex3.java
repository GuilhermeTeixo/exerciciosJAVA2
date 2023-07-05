package exerciciosJAVA2;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
	
public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor < 0  <= 25) {
			System.out.println("Intervalo (0,25)");
		}
		else if (valor >= 25.01) {
			System.out.println("Intervalo (25,50)");
		}
				
		sc.close();
	}
}
