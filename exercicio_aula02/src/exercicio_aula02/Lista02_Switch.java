package exercicio_aula02;

import java.util.Scanner;

public class Lista02_Switch {

	public static void main(String[] args) {
		
Scanner leia = new Scanner (System.in);
		
		int operacao;
		float v1, v2, resultado;
		
		//cria a tabela
	    System.out.println("Operações");
		System.out.println("1\tSoma");
        System.out.println("2\tSubtração");
        System.out.println("3\tMultiplicação");
        System.out.println("4\tDivisão");
       
        System.out.println("Escolha a operação");
        operacao = leia.nextInt();
        
        System.out.println("Digite o primeiro valor");
        v1 = leia.nextFloat();
        System.out.println("Digite o segundo valor");
        v2 = leia.nextFloat();

        switch(operacao) {
        	case 1:
        		System.out.println(v1 + " + " + v2 + " = " + ( v1 + v2));
        	break;	
        	
        	case 2:
        		System.out.println(v1 + " - " + v2 + " = " + ( v1 - v2));
            	break;
            	
        	case 3:
        		System.out.println(v1 + " * " + v2 + " = " + ( v1 * v2));
            	break;
            	
        	case 4:
        		System.out.println(v1 + " / " + v2 + " = " + ( v1 / v2));
            	break;
           
            default:
            	System.out.println("Operação inválida!");
            	
            	leia.close();

	}
 }
}