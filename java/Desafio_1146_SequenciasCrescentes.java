/*
 Este programa deve ler uma variável inteira X inúmeras vezes (deve parar quando o valor no arquivo de entrada for igual a zero).
 Para cada valor lido imprima a sequência de 1 até X, com um espaço entre cada número e seu sucessor.

 Obs: cuide para não deixar espaço em branco após o último valor apresentado na linha ou você receberá Presentation Error.

ENTRADA
 O arquivo de entrada contém vários números inteiros. O último número no arquivo de entrada é 0.

SAíDA
 Para cada número N do arquivo de entrada deve ser impressa uma linha de 1 até N, conforme o exemplo abaixo.
 Não deve haver espaço em branco após o último valor da linha.
*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1146_SequenciasCrescentes {
    public static void main(String[] args) throws IOException{
        var scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();

            if (n == 0) break;

            var result = new StringBuilder();
            
            for (int i = 1; i <= n; i++) {
                result.append(i).append(" ");
            }

            System.out.println(result.toString().trim());
        }

        scan.close();
    }
}
