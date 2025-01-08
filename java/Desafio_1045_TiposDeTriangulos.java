/*
 Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. 
 A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem
adequada:
    se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
    se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
    se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
    se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
    se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
    se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

ENTRADA
 A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

SAíDA
 Imprima todas as classificações do triângulo especificado na entrada.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1045_TiposDeTriangulos {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        float valueA = scan.nextFloat();
        float valueB = scan.nextFloat();
        float valueC = scan.nextFloat();

        scan.close();
        
        float maior = 0;
        float meio = 0;
        float menor = 0;


        if (valueA > valueB && valueA > valueC) {
            maior = valueA;

            if (valueB > valueC) {
                meio = valueB;
                menor = valueC;
            } else {
                meio = valueC;
                menor = valueB;
            }
        } else if (valueB > valueA && valueB > valueC) {
            maior = valueB;

            if (valueA > valueC) {
                meio = valueA;
                menor = valueC;
            } else {
                meio = valueC;
                menor = valueA;
            }
        } else {
            maior = valueC;
            
            if (valueA > valueB) {
                meio = valueA;
                menor = valueB;
            } else {
                meio = valueB;
                menor = valueA;
            }
        }

        if (maior >= (meio + menor)) {
            System.out.printf("NAO FORMA TRIANGULO\n");
        } else {
            if (Math.pow(maior, 2) == Math.pow(meio, 2) + Math.pow(menor, 2)) {
                System.out.printf("TRIANGULO RETANGULO\n");
            } 
            
            if (Math.pow(maior, 2) > Math.pow(meio, 2) + Math.pow(menor, 2)) {
                System.out.printf("TRIANGULO OBTUSANGULO\n");
            } 
            
            if (Math.pow(maior, 2) < Math.pow(meio, 2) + Math.pow(menor, 2)) {
                System.out.printf("TRIANGULO ACUTANGULO\n");
            } 
            
            if (maior == meio && maior == menor) {
                System.out.printf("TRIANGULO EQUILATERO\n");
            } else if (maior == meio || maior == menor || meio == menor) {
                System.out.printf("TRIANGULO ISOSCELES\n");
            }
        }
    }    
}