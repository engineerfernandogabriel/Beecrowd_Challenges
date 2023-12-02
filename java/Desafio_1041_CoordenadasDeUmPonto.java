/*
 Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
 A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem 
(x = y = 0).

    Q2   |   Q1
   ----  |  -----
    Q3   |   Q4

 Se o ponto estiver na origem, escreva a mensagem “Origem”.

 Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

ENTRADA
 A entrada contem as coordenadas de um ponto.

SAíDA
 A saída deve apresentar o quadrante em que o ponto se encontra.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1041_CoordenadasDeUmPonto {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        float valueX = scan.nextFloat();
        float valueY = scan.nextFloat();

        scan.close();

        if (valueX > 0 & valueY > 0) {
            System.out.printf("Q1\n");
        } else if (valueX > 0 & valueY < 0) {
            System.out.printf("Q4\n");
        } else if (valueX < 0 & valueY > 0) {
            System.out.printf("Q2\n");
        } else if (valueX < 0 & valueY < 0) {
            System.out.printf("Q3\n");
        } else if (valueX == 0 & valueY == 0) {
            System.out.printf("Origem\n");
        } else if (valueX != 0 & valueY == 0) {
            System.out.printf("Eixo X\n");
        } else if (valueX == 0 & valueY != 0) {
            System.out.printf("Eixo Y\n");
        } 
    }
}
