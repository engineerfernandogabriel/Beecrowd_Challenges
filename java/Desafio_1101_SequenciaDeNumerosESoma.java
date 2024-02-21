/*
 Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). 
 Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

ENTRADA
 O arquivo de entrada contém um número não determinado de valores M e N. 
 A última linha de entrada vai conter um número nulo ou negativo.

SAíDA
 Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1101_SequenciaDeNumerosESoma {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

       boolean condition = true;

        while(condition) {
            
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (x <= 0 || y <= 0 ){
                condition = false;
            } else {
                int sum  = 0;

                if (x > y){
                    int aux = x;
                    x = y;
                    y = aux;
                }
            
                for(int i = x; i <= y; i++) {
                    sum += i;
                    System.out.printf("%d ", i);
                }

                System.out.printf("Sum=%d\n", sum);
            }
        }

        scan.close();        

    }
 }