/*
 Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

 Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
 Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
 Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

ENTRADA
 O arquivo de entrada contém um valor inteiro.

SAíDA
 Imprima a saída conforme exemplo fornecido.
*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1020_IdadeEmDias {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int idadeDias = scan.nextInt();

        scan.close();

        int ano = idadeDias / 365;

        int diasRestantes = idadeDias % 365;
        int mes = diasRestantes / 30;

        diasRestantes = diasRestantes % 30;
        int dia = diasRestantes;

        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);
    }
}
