/*
  Faça um programa que mostre os números pares entre 1 e 100, inclusive.

ENTRADA
 Neste problema extremamente simples de repetição não há entrada.

SAíDA
 Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha. 
 */

import java.io.IOException;

public class Desafio_1059_NumerosPares {
    public static void main(String[] args) throws IOException {
        
        for(int i = 2; i <= 100; i +=2) {
            System.out.println(i);
        }
    }
}