/*
 Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. 
 
 Calcule e imprima a média semestral. O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). 
 
 Cada nota deve ser validada separadamente.

 No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um código (1 ou 2) indicando 
se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). 

 Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

ENTRADA
 O arquivo de entrada contém vários valores reais, positivos ou negativos. 
 
 Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X . 
 
 O programa deve parar quando o valor lido para este X for igual a 2.

SAíDA
 Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. 
 
 Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.

 Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve ser apresentada 
novamente se o valor da entrada padrão para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.

 A média deve ser impressa com dois dígitos após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1118_VariasNotasComValidacao {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int calculate = 1;

        while(calculate == 1){
            double sum = 0;
            int count = 0;

            while(count < 2) {
                double value = scan.nextDouble();

                if (value >= 0 && value <= 10) {
                    sum += value;
                    count ++;
                } else {
                    System.out.println("nota invalida");
                }

            }

            double media = sum / 2;

            System.out.printf("media = %.2f\n", media);

            int n = 0;

            while(n < 1 || n > 2){
                System.out.println("novo calculo (1-sim 2-nao)");

                n = scan.nextInt();

                if (n == 2) {
                    calculate = 2;
                }
            }
        }

        scan.close();
    }
 }