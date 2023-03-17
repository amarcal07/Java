package aula_01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Passo 2: entrada de dados no sistema (pelo teclado)= System.in
		Scanner leia = new Scanner (System.in);
		
		//Passso 1: declarando variável do tipo real (pode ser FLOAT ou DOUBLE)
        float salarioBruto, adicionalNoturno, horasExtras, descontos;
        
      //Passo 3: saída de dados no console = método println()
        System.out.println("Digite o salário bruto: ");
        
       //Passo 4: ler a variável Float = leia.nextFloat() 
        salarioBruto = leia.nextFloat();

        System.out.print("Digite o adicional noturno: ");
        adicionalNoturno = leia.nextFloat();

        System.out.print("Digite as horas extras: ");
        horasExtras = leia.nextFloat();

        System.out.print("Digite os descontos: ");
        descontos = leia.nextFloat();
        
        //Passo 5: ex. de fórmula que gera o resultado no console
        System.out.println("Salário Líquido: " + (salarioBruto + adicionalNoturno + (horasExtras *5) - descontos));

        leia.close();

	}

}
