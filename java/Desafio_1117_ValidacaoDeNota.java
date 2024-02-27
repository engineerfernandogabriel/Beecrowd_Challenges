/*
 Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
 Calcule e imprima a média semestral. 
 Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). 
 Cada nota deve ser validada separadamente.

ENTRADA
 A entrada contém vários valores reais, positivos ou negativos. 
 O programa deve ser encerrado quando forem lidas duas notas válidas.

SAíDA
 Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
 Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. 
 O valor deve ser apresentado com duas casas após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1117_ValidacaoDeNota {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        do{
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                sum += nota;
                count ++;
            } else {
                System.out.println("nota invalida");
            }
        }while(count < 2);

        double media = sum / 2;

        scan.close();

        System.out.printf("media = %.2f\n", media);

    }
}
