/*
 Leia 5 valores Inteiros. 
 A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram 
positivos e quantos valores digitados foram negativos.

ENTRADA
 O arquivo de entrada contém 5 valores inteiros quaisquer.

SAíDA
 Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
 */

import java.io.IOException;
import java.util.Scanner;

 public class Desafio_1066_ParesImparesPositivosENegativos {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for(int i = 0; i < 5; i++) {
            int value = scan.nextInt();

            if(value % 2 == 0) {
                par ++;
            } else {
                impar ++;
            }

            if(value > 0) {
                positivo ++;
            } else if (value < 0) {
                negativo ++;
            }
        }

        scan.close();

        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);
    }
 }