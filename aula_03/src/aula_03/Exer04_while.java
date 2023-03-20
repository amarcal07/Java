package aula_03;

import java.util.Scanner;

public class Exer04_while {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int sexo;
		int categoria;
	    int mMaiores40Mobile = 0;
	    int fMenores30Fullstack = 0;
	    int totalFrontend = 0;
	    int totalBackend = 0;
		int contador = 0;
		
		char continua = 'S';
		
		while(continua == 'S') {

			System.out.println("Digite a sua idade: ");
			idade =  leia.nextInt();
			
			System.out.println("Digite o sexo (1-M/2-F/3-O): ");
			sexo =  leia.nextInt();
	       
			System.out.println("Digite a categoria(1-Back/2-Front/3-Mbl/4-FullS): ");
			categoria=  leia.nextInt();
			
			while(sexo >= 1 && sexo <= 3) {
				
			if (idade > 40 && sexo == 1 && categoria == 3) {
				mMaiores40Mobile ++;
			}
			if (idade < 30 && sexo == 2 && categoria == 4) {
				fMenores30Fullstack ++;
			}
			if (categoria == 1) {
				totalBackend ++;
			}
			if (sexo == 2 && categoria == 2) {
				totalFrontend ++;
			}	
			
			System.out.println("Deseja continuar (S/N)? ");
			continua = leia.next().toUpperCase().charAt(0);
			
			contador++;
			
			System.out.println("Fichas preenchidas: " + contador);
			System.out.println("Total de pessoas da categoria Frontend: " + totalFrontend);
			System.out.println("Total de pessoas da categoria Backend: " + totalBackend );
			System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + mMaiores40Mobile);
			System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + fMenores30Fullstack);
			}
		}
	}
}
