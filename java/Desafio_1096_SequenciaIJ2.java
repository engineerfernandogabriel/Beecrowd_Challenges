/*
  Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    I=1 J=7
    I=1 J=6
    I=1 J=5
    I=3 J=7
    I=3 J=6
    I=3 J=5
    ...
    I=9 J=7
    I=9 J=6
    I=9 J=5

ENTRADA
 Não há nenhuma entrada neste problema.

SAíDA
 Imprima a sequencia conforme exemplo abaixo
 */

import java.io.IOException;

public class Desafio_1096_SequenciaIJ2 {
    public static void main(String[] args) throws IOException {

        for(int i = 1; i <= 9; i += 2) {
            for(int j = 7; j >=5; j--) {
                System.out.printf("I=%d J=%d\n", i, j);
            }
        }
    }
}