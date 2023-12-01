/*
 Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. 
 Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem 
"Media: ". 
 Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". 
 Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". 
 Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

 No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. 
 Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. 
 Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem 
"Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). 
 Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido 
da média final para esse aluno.

ENTRADA
 A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

SAíDA
 Todas as respostas devem ser apresentadas com uma casa decimal. 
 As mensagens devem ser impressas conforme a descrição do problema. 
 Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1040_Media3 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();
        
        double media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0)) / 10.0;

        if (media >= 7){
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno aprovado.\n");
        }else if (media < 5) {
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno reprovado.\n");
        }else {
            double notaExame = scan.nextDouble();
            double mediaFinal = (media + notaExame) / 2;

            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno em exame.\n");
            System.out.printf("Nota do exame: %.1f\n", notaExame);

            if (mediaFinal >= 5) {
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }else {
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: %.1f\n", mediaFinal); 
            }
        }

        scan.close();
    }
}
