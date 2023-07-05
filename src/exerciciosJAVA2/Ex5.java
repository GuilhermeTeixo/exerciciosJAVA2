package exerciciosJAVA2;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	
public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
				
		if (A%B == 0){
			System.out.println("SAO MUTIPLOS");
		} else if (B%A == 0){
			System.out.println("SAO MUTIPLOS");
		} else {
			System.out.println("NAO SAO MUTIPLOS");
		}
		
		sc.close();
	}
}
