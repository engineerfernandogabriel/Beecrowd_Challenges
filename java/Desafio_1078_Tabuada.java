/*
 Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
    1 x N = N      2 x N = 2N        ...       10 x N = 10N

ENTRADA
 A entrada contém um valor inteiro N (2 < N < 1000).

SAíDA
 Imprima a tabuada de N, conforme o exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1078_Tabuada {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.close();

        for (int i = 1; i <= 10; i++) {
            int value = n * i;
            System.out.printf("%d x %d = %d\n", i, n, value);
        }
        
    }
}