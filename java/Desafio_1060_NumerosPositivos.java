/*
 Faça um programa que leia 6 valores. 
 Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
 A seguir, mostre a quantidade de valores positivos digitados.

ENTRADA
 Seis valores, negativos e/ou positivos.

SAíDA
 Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1060_NumerosPositivos {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double values[] = new double[6];
        
        for(int i=0; i < 6; i++) {
            values[i] = scan.nextDouble();
        }
        
        scan.close();

        int count = 0;
        
        for(int i = 0; i < 6; i++) {
            if(values[i] > 0) {
                count++;
            }
        }

        System.out.printf("%s valores positivos\n", count);
    }
 }