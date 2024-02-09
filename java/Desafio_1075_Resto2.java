/*
 Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

ENTRADA
 A entrada contém um valor inteiro N (N < 10000).

SAíDA
 Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1075_Resto2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.close();

        for (int i = 0; i < 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }
    }
}
