/*
 Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. 
 Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.

ENTRADA
 A entrada contém vários casos de teste. 
 Cada caso contém dois valores inteiros X e Y. 
 A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

SAíDA
 Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1113_CrescenteEDecrescente {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        boolean numbersDifferent = true;

        while(numbersDifferent){
            int x = scan.nextInt();
            int y = scan.nextInt();

            if ( x != y) {
                System.out.println((x < y) ? "Crescente" : "Decrescente");
            } else {
                numbersDifferent = false;
            }
        }

        scan.close();
    }
}
