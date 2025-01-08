/*
 Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
 Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 
ou raiz de numero negativo.

ENTRADA
 Leia três valores de ponto flutuante (double) A, B e C.

SAíDA
 Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
 Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo 
abaixo. Imprima sempre o final de linha após cada mensagem.
*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1036_FormulaDeBhaskara {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double valueA = scan.nextDouble();
        double valueB = scan.nextDouble();
        double valueC = scan.nextDouble();

        scan.close();

        double delta = Math.pow(valueB, 2) - ( 4 * valueA * valueC);   

        if ( valueA <= 0 || delta < 0 ) {
            System.out.printf("Impossivel calcular\n");
        } else{
            double raiz1 = (- valueB + Math.sqrt(delta)) / (2 * valueA); 
            double raiz2 = (- valueB - Math.sqrt(delta)) / (2 * valueA);
            System.out.printf("R1 = %.5f\n", raiz1);
            System.out.printf("R2 = %.5f\n", raiz2);
        }
    }
}