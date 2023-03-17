package aula_03;

import java.util.Scanner;

public class Exer02_FOR {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int numero, par = 0, impar = 0;
		
		
		for(int i = 0 ; i < 10; i++) {
				
		System.out.printf("Digite o %dº número (maior ou igual a 0 e menor que 10): ", i + 1);
	    numero = leia.nextInt();
	    
	    if(numero % 2 == 0) 
	    	par ++;
	    
	    else if (numero % 2 != 0)
	    	impar ++;
	    	
	  }
		
	 	System.out.println("Total de números pares: " + par);
	 	System.out.println("Total de números impares: " + impar);
	 	
		}
	}


	