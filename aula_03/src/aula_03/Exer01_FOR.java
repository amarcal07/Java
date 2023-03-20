package aula_03;

import java.util.Scanner;

public class Exer01_FOR {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int n1;
		int n2;
		
		System.out.print("Digite o primeiro número");
		n1 = leia.nextInt();
		
		System.out.print("Digite o segundo número");
		n2 = leia.nextInt();
		
		if (n1 > n2) {
		System.out.println("Intervalo inválido");
	    System.exit(0);
		
	}                       
		for(int contador = n1; contador <= n2; contador ++) {
		if (contador%3 == 0 && contador%5 == 0)
			System.out.println(contador + " é múltiplo de 5 e 3");
	}
  }
}
