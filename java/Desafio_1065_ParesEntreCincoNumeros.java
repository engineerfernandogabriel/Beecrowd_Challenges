/*
 Faça um programa que leia 5 valores inteiros. 
 Conte quantos destes valores digitados são pares e mostre esta informação.

ENTRADA
 O arquivo de entrada contém 5 valores inteiros quaisquer.

SAíDA
 Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1065_ParesEntreCincoNumeros {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int count = 0;

        for(int i = 0; i < 5; i++) {
            int value = scan.nextInt();
            if(value % 2 == 0) {
                count ++;
            }
        }

        scan.close();

        System.out.printf("%d valores pares\n", count);
    }
 }