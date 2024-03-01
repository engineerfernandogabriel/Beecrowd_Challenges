/*
 A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. 
 Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. 
 Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. 
 Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:

    - Quantos GRENAIS fizeram parte da estatística.
    - O número de vitórias do Inter.
    - O número de vitórias do Grêmio.
    - O número de Empates.
    - Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

ENTRADA
 O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente. 
 Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

SAíDA
 Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". 
 Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima. 
 
 Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1131_Grenais {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        boolean condition = true;
        int totalGames = 0;
        int inter = 0;
        int gremio = 0;
        int draws = 0;
        String winner; 
        
        while(condition){
            int interGoals = scan.nextInt();
            int gremioGoals = scan.nextInt();
            
            if(interGoals == gremioGoals){
                draws ++;
            } else if (interGoals > gremioGoals){
                inter ++;
            } else {
                gremio ++;
            }

            totalGames ++;

            int n = 0;

            while(n < 1 || n > 2) {
                System.out.printf("Novo grenal (1-sim 2-nao)\n");
                n = scan.nextInt();
                
                if(n == 2){
                    condition = false;
                }
            }
        }

        if(inter > gremio){
            winner = "Inter venceu mais";
        } else if(inter < gremio){
            winner = "Gremio venceu mais";
        } else {
            winner = "Nao houve vencedor";
        }

        System.out.printf("%d grenais\n", totalGames);
        System.out.printf("Inter:%d\n", inter);
        System.out.printf("Gremio:%d\n", gremio);
        System.out.printf("Empates:%d\n", draws);
        System.out.printf("%s\n", winner);

        scan.close();
    }
    
}
