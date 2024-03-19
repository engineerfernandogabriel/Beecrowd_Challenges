/*
 Escreva um programa que leia um valor inteiro N (1 < N < 1000). 
 Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

ENTRADA
 O arquivo de entrada contém um número inteiro positivo N.

SAíDA
 Imprima a saída conforme o exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1143_QuadradoEAoCubo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <= n; i++){
            int value2 = i * i;
            int value3 = i * value2;

            System.out.printf("%d %d %d\n", i, value2, value3);
        }

        scan.close();

    }
 }