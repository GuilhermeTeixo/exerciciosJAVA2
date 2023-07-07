package exerciciosJAVA2;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
	
public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double porcentagem;
		double abatimento;
		double imposto;
		
		if (salario == 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if (salario >= 2000.01 && salario <= 3000.00) {
			porcentagem = 8;
			imposto = (salario/100)*porcentagem;
			System.out.printf("R$ %.2f", imposto);
		}
		else if (salario >= 3000.01 && salario <= 4500.00) {
			abatimento = salario - 1000;
			porcentagem = 8;
			imposto = (abatimento/100)*porcentagem;
			System.out.printf("R$ %.2f", imposto);
		}
				
		sc.close();
	}
}
