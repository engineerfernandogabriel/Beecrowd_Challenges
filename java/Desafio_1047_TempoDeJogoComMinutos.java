/*
 Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

 Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

ENTRADA
 Quatro números inteiros representando a hora de início e fim do jogo.

SAíDA
 Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1047_TempoDeJogoComMinutos {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();

        scan.close();

        int duracaoHoras = 24;
        int duracaoMinutos = 0;

        if(horaInicial != horaFinal && minutoInicial != minutoFinal){
           
            if (horaInicial <= horaFinal) {
                duracaoHoras = horaFinal - horaInicial;
            } else {
                duracaoHoras = (24 - horaInicial) + horaFinal;
            }

            if (minutoInicial <= minutoFinal) {
                duracaoMinutos = minutoFinal - minutoInicial;
            } else {
                duracaoMinutos = (60 - minutoInicial) + minutoFinal;

                if(duracaoHoras > 0) {
                    duracaoHoras -= 1;
                }
            }
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);
    }
 }