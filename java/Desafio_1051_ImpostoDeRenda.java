/*
 Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem 
políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. 
 A moeda deste país é o Rombus, cujo símbolo é o R$.

 Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
 Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

            RENDA                        IMPOSTO DE RENDA
    R$     0,00 a R$ 2.000,00                  Isento
    R$ 2.000,01 a R$ 3.000,00                    8%
    R$ 3.000,01 a R$ 4.500,00                   18%
    acima de R$ 4.500,00                        28%

 Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de 
R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. 
 No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. 
 O valor deve ser impresso com duas casas decimais.

ENTRADA
 A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

SAíDA
 Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. 
 Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".
*/

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1051_ImpostoDeRenda {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double renda = scan.nextDouble();

        scan.close();

        if (renda <= 2000) {
            System.out.printf("Isento\n");
        } else if (renda > 2000 && renda < 3000) {
            double imposto = (renda - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (renda > 3000 && renda < 4500) {
            double imposto  = ((renda - 3000) * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            double imposto = ((renda - 4500) * 0.28) + (1000 * 0.08) + (1500 * 0.18);
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}