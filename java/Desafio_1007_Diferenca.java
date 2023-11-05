/*
 Leia quatro valores inteiros A, B, C e D. 
 A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
 
 DIFERENCA = (A * B - C * D).

ENTRADA
 O arquivo de entrada contém 4 valores inteiros.
SAíDA
 Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço 
em branco antes e depois da igualdade.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1007_Diferenca {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        
        int diferenca = (A * B - C * D);

        scan.close();

        System.out.printf("DIFERENCA = %d\n", diferenca);
    }    
}
