/*
 Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

 	
    I=0 J=1
    I=0 J=2
    I=0 J=3
    I=0.2 J=1.2
    I=0.2 J=2.2
    I=0.2 J=3.2
    .....
    I=2 J=?
    I=2 J=?
    I=2 J=?

ENTRADA
 Não há nenhuma entrada neste problema.

SAíDA
 Imprima a sequencia conforme exemplo abaixo.
 */

import java.io.IOException;

public class Desafio_1098_SequenciaIJ4 {
    public static void main(String[] args) throws IOException {
        double i = 0; 
        double j = 1;
		
		while (i <= 2.0){
			if (i == 0.0 || i == 1.0 || i > 1.8){
				System.out.printf("I=%.0f J=%.0f\n",i,j);
				System.out.printf("I=%.0f J=%.0f\n",i,j+1);
				System.out.printf("I=%.0f J=%.0f\n",i,j+2);
			} else {
				System.out.printf("I=%.1f J=%.1f\n",i,j);
				System.out.printf("I=%.1f J=%.1f\n",i,j+1);
				System.out.printf("I=%.1f J=%.1f\n",i,j+2);
			}

			i = (i + 0.2);
			j = (j + 0.2);
		}
     }
 }