/*
 Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos 
de um laboratório o qual ela é responsável. 
 
 Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

 Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
 
 Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a 
quantidade de cobaias utilizadas em cada experimento.

ENTRADA
 A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
 
 Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere 
Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

SAíDA
 Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total 
de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1094_Experiencias {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int total = 0;
        int totalC = 0;
        int totalR = 0;
        int totalS = 0;

        for(int i = 0; i < n; i++) {
            int quantia = scan.nextInt();
            String tipo = scan.next();

            total += quantia;

            if (tipo.equalsIgnoreCase("C")) {
                totalC += quantia;
            } else if (tipo.equalsIgnoreCase("R")) {
                totalR += quantia;
            } else {
                totalS += quantia;
            }
        }
        
        scan.close();

        double percentC = ((double) totalC / total) * 100;
        double percentR = ((double) totalR / total) * 100;
        double percentS = ((double) totalS / total) * 100;

        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", totalC);
        System.out.printf("Total de ratos: %d\n", totalR);
        System.out.printf("Total de sapos: %d\n", totalS);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentC);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentR);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentS);
    }    
}
