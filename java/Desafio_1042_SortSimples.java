/* 
 Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em 
branco e em seguida, os valores na sequência como foram lidos.

ENTRADA
 A entrada contem três números inteiros.

SAíDA
 Imprima a saída conforme foi especificado.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1042_SortSimples {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int valueA = scan.nextInt();
        int valueB = scan.nextInt();
        int valueC = scan.nextInt();

        scan.close();

        int maior = 0;
        int meio = 0;
        int menor = 0;

        if (valueA < valueB & valueA < valueC) { 
            menor = valueA;
            
            if (valueB < valueC) {
                meio = valueB;
                maior = valueC;
            } else {
                meio = valueC;
                maior = valueB;
            }
        } else if (valueB < valueC) {
            menor = valueB;

            if (valueA < valueC) {
                meio = valueA;
                maior = valueC;
            } else {
                meio = valueC;
                maior = valueA;
            }
        } else {
            menor = valueC;

            if (valueA < valueB) {
                meio = valueA;
                maior = valueB;
            } else {
                meio = valueB;
                maior = valueA;
            }
        }
        

        System.out.printf("%d\n", menor);
        System.out.printf("%d\n", meio);
        System.out.printf("%d\n", maior);
        System.out.printf("\n");
        System.out.printf("%d\n", valueA);
        System.out.printf("%d\n", valueB);
        System.out.printf("%d\n", valueC);
    }    
}