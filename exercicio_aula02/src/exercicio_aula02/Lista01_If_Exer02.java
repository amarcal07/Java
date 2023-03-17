package exercicio_aula02;

import java.util.Scanner;

public class Lista01_If_Exer02 {

	public static void main(String[] args) {
		
	
		Scanner leia = new Scanner (System.in);

		int numero;
		
		 System.out.println("Digite um número:");
	     numero = leia.nextInt();
	     
	     if (numero %2 == 0 && numero > 0)
	     System.out.println("Este número: " + numero + " é par e positivo");
	     else if (numero %2 == 0 && numero < 0)
	     System.out.println("Este número: " + numero + " é par e negativo");
	     else if (numero %2 != 0 && numero > 0)
		 System.out.println("Este número: " + numero + " é ímpar e positivo");
		 else if (numero %2 != 0 && numero < 0)
		 System.out.println("Este número: " + numero + " é ímpar e negativo");
			 
	     
	     // para verificar um número ímpar: != 0 
	     // para verificar um número par: %2
	     
	}

}
