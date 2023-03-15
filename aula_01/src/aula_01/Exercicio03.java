package aula_01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner (System.in);

        float salarioBruto, adicionalNoturno, horasExtras, descontos;

        System.out.println("Digite o salário bruto: ");
        salarioBruto = leia.nextFloat();

        System.out.print("Digite o adicional noturno: ");
        adicionalNoturno = leia.nextFloat();

        System.out.print("Digite as horas extras: ");
        horasExtras = leia.nextFloat();

        System.out.print("Digite os descontos: ");
        descontos = leia.nextFloat();
        
        System.out.println("Salário Líquido: " + (salarioBruto + adicionalNoturno + (horasExtras *5) - descontos));

        leia.close();

	}

}
