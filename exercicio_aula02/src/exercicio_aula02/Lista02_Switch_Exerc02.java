package exercicio_aula02;

import java.util.Scanner;

public class Lista02_Switch_Exerc02 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner (System.in);
		
		int codigoProduto, quantidade;
		float v1 = 10 , v2 = 15 , v3 = 18 , v4 = 12 , v5 = 8 , v6 = 06 ;
		
		// pra dar espaço criar tabela: \t
		System.out.println("Código do Produto\t Produto \t Preço Unitário");
        System.out.println("1\t\t\t Hot dog \t R$" + v1);
        System.out.println("2\t\t\t X-salada \t R$" + v2);
        System.out.println("3\t\t\t X-bacon \t R$" + v3);
        System.out.println("4\t\t\t Bauru \t\t R$" + v4);
        System.out.println("5\t\t\t Refrigerante \t R$" + v5);
        System.out.println("6\t\t\t Suco \t\t R$" + v6);

       System.out.println("\nDigite o código do produto: ");
       codigoProduto = leia.nextInt();
       
       if(codigoProduto > 6 ) {
       System.out.println("Código inválido");
       System.exit(0);
       } 
       
       System.out.println("\nDigite o código a quantidade: ");
       quantidade = leia.nextInt();
       
    switch(codigoProduto) {
    case 1:
        System.out.println("Produto Hot Dog \nValor Total:R$ " + v1* quantidade);
    break;
    case 2:
        System.out.println("Produto X-Salada: \nValor Total:R$ " + v2* quantidade);
    break;
    case 3:
        System.out.println("Produto X-Bacon: \nValor Total:R$ " + v3* quantidade);
    break;
    case 4:
        System.out.println("Produto Bauru: \nValor Total:R$ " + v4* quantidade);
    break;
    case 5:
        System.out.println("Produto Refrigente : \nValor Total:R$ " + v5* quantidade);
    break;
    case 6:
        System.out.println("Produto Suco de laranja : \nValor Total:R$ " + v6* quantidade);
    break;
      
       
       }
    
    leia.close();
 }
}