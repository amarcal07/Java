package aula_03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner (System.in);
		 
		 int idade, sexo, esporte, contador = 0, futebolFeminino = 0, maiores18Voleibol = 0;
		 char continua = 'S';
		 
		 while(continua == 'S') {
			 
		 System.out.println("Digite a sua idade: ");
		 idade = leia.nextInt();
		 
		 System.out.println("Digite o seu esporte favorito (1-Futebol/2-Voleibol/3-Basquete/4-Games: ");
		 esporte = leia.nextInt();
		 
		 contador ++;
		 
		 //faça alguma coisa (do)
		 do {
			 
			 System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
			 sexo = leia.nextInt();
			 
		 if(sexo == 2 && esporte == 1)
			 futebolFeminino ++;
		 
		 }while(sexo < 1 || sexo > 4);
		 
		 if(idade >= 18 && esporte == 2)
			 maiores18Voleibol ++;
		 
		 System.out.println("Deseja continuar (S/N)");
		 continua = leia.next().toUpperCase().charAt(0);
	 }
		 
		 System.out.println("Fichas preenchidas: " + contador);
		 System.out.println("Total de pessoas do sexo feminino que gostam de Futebol: " + futebolFeminino);
		 System.out.println("Total de pessoas maiores de 18 anos que gostam de Voleibol: " + maiores18Voleibol);

		
	}

}
