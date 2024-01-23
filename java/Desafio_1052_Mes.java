/*
 Leia um valor inteiro entre 1 e 12, inclusive. 
 Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.

ENTRADA
 A entrada contém um único valor inteiro.

SAíDA
 Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1052_Mes {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int mes = scan.nextInt();

        scan.close();

        switch (mes) {
            case 1:
                System.out.printf("January\n");
                break;
            case 2:
                System.out.printf("February\n");
                break;
            case 3:
                System.out.printf("March\n");
                break;
            case 4:
                System.out.printf("April\n");
                break;
            case 5:
                System.out.printf("May\n");
                break;
            case 6:
                System.out.printf("June\n");
                break;
            case 7:
                System.out.printf("July\n");
                break;
            case 8:
                System.out.printf("August\n");
                break;
            case 9:
                System.out.printf("September\n");
                break;
            case 10:
                System.out.printf("October\n");
                break;
            case 11:
                System.out.printf("November\n");
                break;
            case 12:
                System.out.printf("December\n");
                break;
        }
    }
 }