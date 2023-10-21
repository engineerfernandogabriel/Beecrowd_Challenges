/*
 A fórmula para calcular a área de uma circunferência é: area = π . raio^2.
 Considerando para este problema que π = 3.14159:

 - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

ENTRADA
 A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

SAíDA
 Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal.
 Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o
 resultado, caso contrário, você receberá "Presentation Error".
*/

import java.util.Scanner;
import java.io.IOException;

public class Desafio_1002_AreaDoCirculo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();

        double area = Math.pow(raio, 2) * 3.14159;

        scan.close();

        System.out.printf("A=%.4f", area);
    }
}