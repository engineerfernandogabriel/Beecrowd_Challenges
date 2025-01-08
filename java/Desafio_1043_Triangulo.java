/*
 Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
 Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

    Perimetro = XX.X

 Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

    Area = XX.X

ENTRADA
 A entrada contém três valores reais.

SAíDA
 O resultado deve ser apresentado com uma casa decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1043_Triangulo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        float valueA = scan.nextFloat();
        float valueB = scan.nextFloat();
        float valueC = scan.nextFloat();

        scan.close();

        if ( valueA < valueB + valueC
            & valueB < valueA + valueC
            & valueC < valueA + valueB) {
            
            float perimetro = valueA + valueB + valueC;

            System.out.printf("Perimetro = %.1f\n", perimetro); 
        } else {
            float area = (valueA + valueB) * valueC / 2;

            System.out.printf("Area = %.1f\n", area);
        }
    }
}