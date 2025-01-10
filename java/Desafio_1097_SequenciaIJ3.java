/*
 Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    I=1 J=7
    I=1 J=6
    I=1 J=5
    I=3 J=9
    I=3 J=8
    I=3 J=7
    ...
    I=9 J=15
    I=9 J=14
    I=9 J=13

ENTRADA
 Não há nenhuma entrada neste problema.

SAíDA
 Imprima a sequencia conforme exemplo abaixo.
 */

import java.io.IOException;

public class Desafio_1097_SequenciaIJ3 {
    public static void main(String[] args) throws IOException {
        
        int n = 7;

        for(int i = 1; i <= 9; i += 2) {
            for (int j = n; j >= (n-2); j--) {
                System.out.printf("I=%d J=%d\n", i, j);
            }
            n += 2; 
         }
    }
}