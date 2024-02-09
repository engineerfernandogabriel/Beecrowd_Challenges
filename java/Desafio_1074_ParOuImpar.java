/*
 Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. 
 Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), 
poYsitivo (POSITIVE) ou negativo (NEGATIVE). 
 No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, 
seu programa deverá imprimir apenas NULL.

ENTRADA
 A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. 
 Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

SAíDA
 Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. 
 Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1074_ParOuImpar {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();

            if (value == 0) {
                System.out.printf("NULL\n");
            } else if (value % 2 == 0 && value > 0) {
                System.out.printf("EVEN POSITIVE\n");
            } else if (value % 2 == 0 && value < 0) {
                System.out.printf("EVEN NEGATIVE\n");
            } else if (value > 0) {
                System.out.printf("ODD POSITIVE\n");
            } else {
                System.out.printf("ODD NEGATIVE\n");
            }
        }
        
        scan.close();
    }
 }