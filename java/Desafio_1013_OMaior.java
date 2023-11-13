/*
 Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. 
 Utilize a fórmula:

 MaiorAB = (a+b+abs(a-b))/2

 Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
 Um segundo passo, portanto é necessário para chegar no resultado esperado.

ENTRADA
 O arquivo de entrada contém três valores inteiros.

SAíDA
 Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1013_OMaior {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        
        int valueA = scan.nextInt();
        int valueB = scan.nextInt();
        int valueC = scan.nextInt();

        int maior = (valueA + valueB + Math.abs(valueA - valueB)) / 2;

        if(maior > valueC) {
            System.out.printf("%d eh o maior\n", maior);
        } else {
            System.out.printf("%d eh o maior\n", valueC);
        }

        scan.close();
    }
 }