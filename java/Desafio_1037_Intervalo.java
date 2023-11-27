/*
 Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos 
([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
 Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

 O símbolo ( representa "maior que". Por exemplo:
   [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
   (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

ENTRADA
 O arquivo de entrada contém um número com ponto flutuante qualquer.

SAíDa
 A saída deve ser uma mensagem conforme exemplo abaixo.
*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1037_Intervalo {
   public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);

    double value = scan.nextDouble();

    scan.close();

    if (value >= 0 & value <= 25) {
        System.out.printf("Intervalo [0,25]\n");
    } else if (value  > 25 & value <= 50) {
        System.out.printf("Intervalo (25,50]");
    } else if (value > 50 & value <= 75) {
        System.out.printf("Intervalo (50,75]");
    } else if (value > 75 & value <=100) {
        System.out.printf("Intervalo (75,100]");
    } else {
        System.out.printf("Fora de intervalo");
    }
   } 
}
