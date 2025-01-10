/*
 Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
 Para cada ponto escrever o quadrante a que ele pertence. 
 O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

ENTRADA
 A entrada contém vários casos de teste. 
 Cada caso de teste contém 2 valores inteiros.

SAíDA
 Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1115_Quadrante {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        boolean condition = true;

        do{
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (x == 0 || y == 0){
                condition = false;
            } else if (x > 0 && y > 0) {
               System.out.println("primeiro"); 
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else {
                System.out.println("terceiro");
            }
        }while(condition);

        scan.close();
    }    
}