/*
 Leia 2 valores inteiros (A e B). 
 Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

ENTRADA
 A entrada contém valores inteiros.

SAíDA
 A saída deve conter uma das mensagens conforme descrito acima. 
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1044_Multiplos {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int valueA = scan.nextInt();
        int valueB = scan.nextInt();

        scan.close();
        
        if (valueA % valueB == 0 || valueB % valueA == 0) {
            System.out.printf("Sao Multiplos\n");
        } else {
            System.out.printf("Nao sao Multiplos\n");
        }
    }
}