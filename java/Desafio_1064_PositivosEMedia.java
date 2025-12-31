/*
 Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
 Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

ENTRADA
 A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. 
 Pelo menos um destes números será positivo.

SAíDA
 O primeiro valor de saída é a quantidade de valores positivos. 
 A próxima linha deve mostrar a média dos valores positivos digitados.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1064_PositivosEMedia {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double value[] = new double[6];

        for (int i = 0; i < 6; i++) {
            value[i] = scan.nextDouble();
        }

        scan.close();

        int count = 0;
        double sum = 0;

        for(int i = 0; i <6; i++) {
            if (value[i] > 0) {
                count ++;
                sum += value[i];
            }
        }

        double media = sum / count;

        System.out.printf("%d valores positivos\n", count);
        System.out.printf("%.1f\n", media);
    }
}