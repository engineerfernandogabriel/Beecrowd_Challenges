/*
 Pedrinho está organizando um evento em sua Universidade. 
 O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. 
 O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.
 Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.

ENTRADA
 Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. 
 Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. 
 Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

SAíDA
 Na saída, deve ser apresentada a duração do evento, no seguinte formato:

    W dia(s)
    X hora(s)
    Y minuto(s)
    Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1061_TempoDeUmEvento {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String nomeDiaInicial = scan.next();
        int diaInicial = scan.nextInt();
        int horaInicial = scan.nextInt();
        String dots = scan.next();
        int minutoInicial = scan.nextInt();
        dots = scan.next();
        int segundoInicial = scan.nextInt();

        String nomeDiaFinal = scan.next();
        int diaFinal = scan.nextInt();
        int horaFinal = scan.nextInt();
        dots = scan.next();
        int minutoFinal = scan.nextInt();
        dots = scan.next();
        int segundoFinal = scan.nextInt();

        scan.close();

        int diaInicialTotal = (diaInicial * 86400) + (horaInicial * 3600) + (minutoInicial * 60) + segundoInicial;
        int diaFinalTotal = (diaFinal * 86400) + (horaFinal * 3600) + (minutoFinal * 60) + segundoFinal;

        int duracaoTotal = diaFinalTotal - diaInicialTotal;

        if(duracaoTotal <= 0) {
            duracaoTotal = duracaoTotal + 86400;
        }

        int dia = duracaoTotal / 86400;

        int tempoRestante = duracaoTotal % 86400;
        int hora = tempoRestante / 3600;

        tempoRestante = tempoRestante % 3600;
        int minuto = tempoRestante / 60;
        
        int segundo = tempoRestante % 60;

        System.out.printf("%d dia(s)\n", dia);
        System.out.printf("%d hora(s)\n", hora);
        System.out.printf("%d minuto(s)\n", minuto);
        System.out.printf("%d segundo(s)\n", segundo);
    }
}