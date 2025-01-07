/*
 Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
 Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas 
casas decimais.

ENTRADA
 O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, 
representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

SAíDA
 Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1009_SalarioComBonus {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String nome = scan.next();
        double salarioFixo = scan.nextDouble();
        double vendasTotal = scan.nextDouble();

        double salarioComBonus = salarioFixo + (vendasTotal * 0.15); 

        scan.close();

        System.out.printf("TOTAL = R$ %.2f\n", salarioComBonus);
    }
}