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

        int moedas = (int) (valor % 1 * 100);
        int notas = (int) (valor / 1);

        int notas100 = notas / 100;

        int restanteNotas = notas % 100;
        int notas50 = restanteNotas / 50;

        restanteNotas = restanteNotas % 50;
        int notas20 = restanteNotas / 20;

        restanteNotas = restanteNotas % 20;
        int notas10 = restanteNotas / 10;

        restanteNotas = restanteNotas % 10;
        int notas5 = restanteNotas / 5;

        restanteNotas = restanteNotas % 5;
        int notas2 = restanteNotas / 2;

        restanteNotas = restanteNotas % 2;
        int moedas1r = restanteNotas;

        int moedas50 = moedas / 50;

        int restanteMoedas = moedas % 50;
        int moedas25 = restanteMoedas / 25;

        restanteMoedas = restanteMoedas % 25;
        int moedas10 = restanteMoedas / 10;

        restanteMoedas = restanteMoedas % 10;
        int moedas5 = restanteMoedas / 5;

        restanteMoedas = restanteMoedas % 5;
        int moedas1 = restanteMoedas;

        System.out.printf("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50.00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20.00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10.00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5.00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2.00\n", notas2);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas1r);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moedas50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moedas25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moedas10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moedas5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moedas1);
    }  
}