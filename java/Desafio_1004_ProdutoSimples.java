/*
 Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
 A seguir mostre a variável PROD com mensagem correspondente.   

ENTRADA
 O arquivo de entrada contém 2 valores inteiros.

SAíDA
 Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. 
 Não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1004_ProdutoSimples {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int valueA = scan.nextInt();
        int valueB = scan.nextInt();

        int produto = valueA * valueB;
        
        scan.close();
        
        System.out.printf("PROD = %d\n", produto);
    }
 }