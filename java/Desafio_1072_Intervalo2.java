/*
 Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

ENTRADA
 A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
 Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 
SAíDA
 Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1072_Intervalo2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int in = 0;
        int out = 0;

        for(int i = 0; i < n; i++) {
            int value = scan.nextInt();

            if(value >= 10 && value <= 20){
                in ++;
            } else {
                out ++;
            }
        }

        scan.close();

        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
 }