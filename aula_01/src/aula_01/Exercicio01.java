package aula_01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float salario, abono;
		String nome;
	     System.out.println("Digite e sobrenome nome do funcionário: ");
	        nome = leia.nextLine();
	        
		System.out.println("Digite o salário: \nR$ ");
			salario = leia.nextFloat();
			
		System.out.println("Digite o abono: \nR$ ");	
			abono = leia.nextFloat();

			
		System.out.println("Novo salário: R$ " + (salario + abono));
		
		leia.close();
		
	}

}
