package aula_03;

import java.util.Scanner;

public class TabuadaV2_While {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner (System.in);
			
			int numero, contador = 1;
			
			System.out.println("Mostre a tabuada do número: ");
			numero = leia.nextInt();

			while(contador <= 10) {
				System.out.println(numero + " x " + contador + " = " + (numero * contador));
				contador ++;
			}				
	}

}
