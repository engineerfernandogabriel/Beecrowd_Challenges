/*
 Leia 4 valores inteiros A, B, C e D. 
 A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, 
ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

ENTRADA
 Quatro números inteiros A, B, C e D.

SAíDA
 Mostre a respectiva mensagem após a validação dos valores. 
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1035_TesteDeSelecao {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int valueA = scan.nextInt();
        int valueB = scan.nextInt();
        int valueC = scan.nextInt();
        int valueD = scan.nextInt();

        scan.close();
        if((valueB > valueC) 
            & (valueD > valueA) 
            & ((valueC + valueD) > (valueA + valueB)) 
            & (valueC > 0) 
            & (valueD > 0) 
            & (valueA % 2 == 0)){
            System.out.printf("Valores aceitos\n");
        } else {
            System.out.printf("Valores nao aceitos\n");
        }      
    }
 }