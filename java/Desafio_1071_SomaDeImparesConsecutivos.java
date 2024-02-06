/*
 Leia 2 valores inteiros X e Y. 
 A seguir, calcule e mostre a soma dos números impares entre eles.

ENTRADA
 O arquivo de entrada contém dois valores inteiros.

SAíDA
 O programa deve imprimir um valor inteiro. 
 Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1071_SomaDeImparesConsecutivos {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int valueA = scan.nextInt();
        int valueB = scan.nextInt();

        scan.close();

        int soma = 0;

        if (valueA != valueB) {
            if (valueA > valueB) {
                int aux = valueA;
                valueA = valueB;
                valueB = aux;
            }

            int value = (valueA % 2 == 0) ? valueA + 2 : valueA + 1;

            for (int i = value; i < valueB; i += 2){
                soma += i;
            }

            System.out.printf("%d\n", soma);
        } else {
            System.out.printf("%d\n", soma);
        }
    }
 }