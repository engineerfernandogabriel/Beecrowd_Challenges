/*
 Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, 
o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

ENTRADA
 O arquivo de entrada contém duas linhas de dados. 
 Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

SAíDA
 A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço
após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1010_CalculoSimples {
    public static void maind(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int codigoPc1 = scan.nextInt();
        int quantidadePc1 = scan.nextInt();
        double valorPc1 = scan.nextDouble();

        int codigoPc2 = scan.nextInt();
        int quantidadePc2 = scan.nextInt();
        double valorPc2 = scan.nextDouble();

        double valorPagar = (quantidadePc1 * valorPc1) + (quantidadePc2 * valorPc2);

        scan.close();
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);
    }
 }