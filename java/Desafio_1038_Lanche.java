/*
 Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
 A seguir, calcule e mostre o valor da conta a pagar.

 CODIGO       ESPECIFICACAO         PREÇO
   01         Cachorro-Quente       R$4,00
   02         X-salada              R$4,50
   03         X-bacon               R$5,00
   04         Torrada simples       R$2,00
   05         Refrigerante          R$1,50

ENTRADA
 O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

SAíDa
 O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1038_Lanche {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int code = scan.nextInt();
        int quantity = scan.nextInt();

        scan.close();

        switch (code){
            case 1:
                float total = (float) 4.00 * quantity;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 2:
                total = (float) 4.50 * quantity;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 3:
                total = (float) 5.00 * quantity;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 4:
                total = (float) 2.00 * quantity;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 5:
                total = (float) 1.50 * quantity;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            default:
                System.out.println("codigo invalido");
                break;
        }
   }    
}