/*
 Leia um valor de ponto flutuante com duas casas decimais. 
 Este valor representa um valor monetário. 
 A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
 As notas consideradas são de 100, 50, 20, 10, 5, 2. 
 As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
 A seguir mostre a relação de notas necessárias.

ENTRADA
 O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

SAíDA
 Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

 Obs: Utilize ponto (.) para separar a parte decimal.
*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1021_NotasEMoedas {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double valor = scan.nextDouble();

        scan.close();

        double moedas = valor    

        System.out.printf("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", notas100);
        System.out.printf("%d nota(s) de R$ 100.00\n", notas50);
        System.out.printf("%d nota(s) de R$ 100.00\n", notas20);
        System.out.printf("%d nota(s) de R$ 100.00\n", notas10);
        System.out.printf("%d nota(s) de R$ 100.00\n", notas5);
        System.out.printf("%d nota(s) de R$ 100.00\n", notas2);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas1r);
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas50);
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas25);
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas10);
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas5);
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas1);
    }  
}
