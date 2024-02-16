/*
 Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

    I=1 J=60
    I=4 J=55
    I=7 J=50
    ...
    I=? J=0

ENTRADA
 Não há nenhuma entrada neste problema.

SAíDA
 Imprima a sequencia conforme exemplo abaixo
 */

import java.io.IOException;

public class Desafio_1095_SequenciaIJ1 {
    public static void main(String[] args) throws IOException {
        int i = 1;
        int j = 60;

        while(j >=0) {
            System.out.printf("I=%d J=%d\n", i,j);

            i += 3;
            j -= 5;
        }
    }
 }