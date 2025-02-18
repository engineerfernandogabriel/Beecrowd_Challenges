/*
 Escreva um programa que leia dois valores X e Y. 
 A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.

ENTRADA
 O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

SAíDA
 Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo. 
 Não deve haver espaço em branco após o último valor da linha.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1145_SequenciaLogica2 {
    public static void main(String[] args) throws IOException {
        var scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int count = 0;

        var result = new StringBuilder();

        for(int i = 1; i <= y; i++){

            result.append(i).append(" ");
            count++;

            if (count == x || i == y) {
                System.out.println(result.toString().trim());
                result.setLength(0);
                count = 0;
            }
             
        }
        scan.close();
    }
}