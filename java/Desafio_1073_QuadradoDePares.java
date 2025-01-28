/*
 Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.

ENTRADA
 A entrada contém um valor inteiro N (5 < N < 2000).

SAíDA
 Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

 Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará 
resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1073_QuadradoDePares {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.close();

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                int value = (int) Math.pow(i, 2);
                System.out.printf("%d^2 = %d\n", i, value);
            }
        }
    }
}