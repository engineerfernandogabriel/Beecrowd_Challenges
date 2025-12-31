/*
 Escreva um programa que leia um valor inteiro N. 
 N * 2 linhas de saída serão apresentadas na execução do programa, seguindo a lógica do exemplo abaixo. 
 Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.

ENTRADA
 O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

SAíDA
 Imprima a saída conforme o exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1144_SequenciaLogica {
    public static void main(String[] args) throws IOException {
        var scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <= n; i++){
            int value2 = i * i;
            int value3 = value2 * i;

            System.out.printf("%d %d %d\n", i, value2, value3);

            value2 += 1;
            value3 += 1;

            System.out.printf("%d %d %d\n", i, value2, value3);
        }

        scan.close();
    }    
}