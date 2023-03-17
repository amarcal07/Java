package exercicio_aula02;

import java.util.Scanner;

public class Lista01_IF {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

        int valorA, valorB, valorC, resultado;
        
        
        System.out.println("Digite o valor A: ");
        valorA  = leia.nextInt();
        
        System.out.println("Digite o valor B: ");
        valorB  = leia.nextInt();
        
        System.out.println("Digite o valor C: ");
        valorC  = leia.nextInt();
        
        resultado = ( valorA + valorB);
        System.out.println("\nTotal A e B: " + resultado);
        
        if (resultado > valorC)
        System.out.println("\nA e B é maior que C");
        else if (resultado < valorC)
		System.out.println("\nA e B é menor que C");
        else if (resultado == valorC)
    	System.out.println("\nA e B é igual a C");
      
        leia.close();
        
	}

}
