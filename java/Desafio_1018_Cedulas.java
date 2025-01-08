/*
 Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 
 As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

ENTRADA
 O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

SAíDA
 Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. 
 Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1018_Cedulas {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int valor = scan.nextInt();

        scan.close();

        int notas100 = valor / 100;

        int restante = valor - (notas100 * 100);
        int notas50 = restante / 50;

        restante = restante - (notas50 * 50);
        int notas20 = restante / 20;

        restante = restante - (notas20 * 20);
        int notas10 = restante / 10;

        restante = restante - (notas10 * 10);
        int notas5 = restante / 5;

        restante = restante - (notas5 * 5);
        int notas2 = restante / 2;

        restante = restante - (notas2 * 2);
        int notas1 = restante;

        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);
    }    
}