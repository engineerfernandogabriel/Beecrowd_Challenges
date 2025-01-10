/*
 Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. 
 Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

ENTRADA
 A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.

SAíDA
 Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.

 Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1116_DividindoXPorY {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();

            if ( y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double result = x / y;

                System.out.printf("%.1f\n", result);
            }
        }
        scan.close();
    }    
}