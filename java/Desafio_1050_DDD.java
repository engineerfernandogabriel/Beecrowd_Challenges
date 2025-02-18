/*
 Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, 
considerando a tabela abaixo:

    DDD         Cidade
     61          Brasilia
     71          Salvador
     11          Sao Paulo
     21          Rio de Janeiro
     32          Juiz de Fora
     19          Campinas
     27          Vitoria
     31          Belo Horizonte

 Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar: DDD nao cadastrado

ENTRADA
 A entrada consiste de um único valor inteiro.

SAíDA
 Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente 
ao número digitado.
*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1050_DDD {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int ddd = scan.nextInt();

        scan.close();

        switch(ddd) {
            case 61:
                System.out.printf("Brasilia\n");
                break;
            case 71:
                System.out.printf("Salvador\n");
                break;
            case 11:
                System.out.printf("Sao Paulo\n");
                break;
            case 21:
                System.out.printf("Rio de Janeiro\n");
                break;
            case 32:
                System.out.printf("Juiz de Fora\n");
                break;
            case 19:
                System.out.printf("Campinas\n");
                break;
            case 27:
                System.out.printf("Vitoria\n");
                break;
            case 31:
                System.out.printf("Belo Horionte\n");
                break;
            default:
                System.out.printf("DDD nao cadastrado\n");
                break;
        }
    }
}