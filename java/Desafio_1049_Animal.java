/*
 Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  
 Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.


                Vertebrado
        Ave                 Mamifero
Carnivoro Onivoro       Onivoro Herbivoro
Aguia     Pomba         Homem    Vaca


                Invertebrado
        Inseto                     Anelideo
Hematofogo Herbivoro         Hematofogo     Onivoro
  Pulga     Lagarta          Sangessuga    Minhooca


ENTRADA
 A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

SAíDa
 Imprima o nome do animal correspondente à entrada fornecida.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1049_Animal {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String grupoAnimal = scan.next();
        String classeAnimal = scan.next();
        String alimentacaoAnimal = scan.next();

        scan.close();

        if (grupoAnimal.equalsIgnoreCase("vertebrado")){
            if(classeAnimal.equalsIgnoreCase("ave")){
                if (alimentacaoAnimal.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }               
            } else if (classeAnimal.equalsIgnoreCase("mamifero")){
                if (alimentacaoAnimal.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            } 
        } else {
            if (classeAnimal.equalsIgnoreCase("inseto")){
                if (alimentacaoAnimal.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else if (classeAnimal.equalsIgnoreCase("anelideo")){
                if (alimentacaoAnimal.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
