/*
 Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. 
 Cada caso de teste consiste de dois inteiros X e Y. 
 Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

ENTRADA
 A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
 Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

SAíDA
 Imprima a soma de todos valores ímpares entre X e Y.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1099_SomaDeImparesConsecutivosII {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i =0; i < n; i++) {

            int x = scan.nextInt();
            int y = scan.nextInt();

            if (x > y) {
                int aux = x;
                x = y;
                y = aux;
            }
            
            int sum = 0;

            for(int j = x + 1; j < y; j++) {
                if ( j % 2 != 0) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }

        scan.close();

    }
}