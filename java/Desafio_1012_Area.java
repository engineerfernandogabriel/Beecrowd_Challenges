/*
 Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
   a) a área do triângulo retângulo que tem A por base e C por altura.
   b) a área do círculo de raio C. (pi = 3.14159)
   c) a área do trapézio que tem A e B por bases e C por altura.
   d) a área do quadrado que tem lado B.
   e) a área do retângulo que tem lados A e B.

ENTRADA
 O arquivo de entrada contém três valores com um dígito após o ponto decimal.

SAíDA
 O arquivo de saída deverá conter 5 linhas de dados. 
 Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o 
valor. 
 O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1012_Area {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double valueA = scan.nextDouble();
        double valueB = scan.nextDouble();
        double valueC = scan.nextDouble();

        double areaTriangulo = (valueA * valueC) / 2;
        double areaCirculo = 3.14159 * Math.pow(valueC, 2);
        double areaTrapezio = ((valueA + valueB) / 2) * valueC;
        double areaQuadrado = Math.pow(valueB, 2);
        double areaRetangulo = valueA * valueB;

        scan.close();

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    }
 }