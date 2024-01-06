/*
 A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

           SALARIO          PERCENTUAL DE AJUSTE
        0 - 400                     15%
        400,01 - 800                12%
        800,01 - 1200               10%
        1200,01 - 2000               7%
        Acima de 2000                4%

 Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, 
em percentual.

ENTRADA
 A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

SAíDa
 Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o
percentual de reajuste ganho, conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1048_AumentoDeSalario {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double salario = scan.nextDouble();

        scan.close();

        double novoSalario = 0;
        int percentual = 0;

        if (salario <= 400) {
            novoSalario = salario * 1.15;
            percentual = 15;                
        } else if (salario > 400 && salario <= 800) {
            novoSalario = salario * 1.12;
            percentual = 12;
        } else if (salario > 800 && salario <= 1200) {
            novoSalario = salario * 1.10;
            percentual = 10;
        } else if (salario > 1200 && salario <= 2000) {
            novoSalario = salario * 1.07;
            percentual = 7;
        } else {
            novoSalario = salario * 1.04;
            percentual = 4;
        }

        double reajuste = novoSalario - salario;

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);
    }
}
