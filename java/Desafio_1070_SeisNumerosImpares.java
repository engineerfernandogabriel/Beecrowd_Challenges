/*
 Leia um valor inteiro X. 
 Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

ENTRADA
 A entrada será um valor inteiro positivo.

SAíDA
 A saída será uma sequência de seis números ímpares.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1070_SeisNumerosImpares {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        int value = scan.nextInt();

        scan.close();

        value = (value %2 !=0) ? value : value + 1;

        for(int i = 0; i < 6; i++) {
            System.out.printf("%d\n", value);
            value += 2;
        }
    }    
}