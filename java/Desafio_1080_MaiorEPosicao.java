/*
 Leia 100 valores inteiros. 
 Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

ENTRADA
 O arquivo de entrada contém 100 números inteiros, positivos e distintos.

SAíDA
 Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public abstract class Desafio_1080_MaiorEPosicao {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int max = 0;
        int position = 0;

        for (int i = 1; i <= 100; i++) {
            int value = scan.nextInt();

            if (value > max) {
                max = value;
                position = i;
            }
        }

        scan.close();

        System.out.println(max);
        System.out.println(position);
    }    
}