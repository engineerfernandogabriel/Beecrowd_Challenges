/*
 Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato 
horas:minutos:segundos.

ENTRADA
 O arquivo de entrada contém um valor inteiro N.

SAíDA
 Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1019_ConversaoDeTempo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int valorTempo = scan.nextInt();

        scan.close();

        int horas = valorTempo / 3600;

        int segundosRestantes = valorTempo % 3600;
        int minutos = segundosRestantes / 60;
        
        segundosRestantes = segundosRestantes % 60;
        int segundos = segundosRestantes;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}