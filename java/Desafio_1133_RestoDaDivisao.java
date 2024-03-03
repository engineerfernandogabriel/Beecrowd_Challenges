/*
 Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.

ENTRADA
 O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.

SAíDA
 Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1133_RestoDaDivisao {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int valueX = scan.nextInt();
        int valueY = scan.nextInt();

        scan.close();

        if(valueX > valueY){
            int aux = valueX;
            valueX = valueY;
            valueY = aux;
        }

        for(int i = valueX + 1; i < valueY; i++) {
            if(i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
 }