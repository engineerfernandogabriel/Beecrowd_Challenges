/*
 Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
 Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
 Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
 O programa será encerrado quando o código informado for o número 4.

ENTRADA
 A entrada contém apenas valores inteiros e positivos.

SAíDA
 Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
 */

import java.io.IOException;
import java.util.Scanner;

public class Desafio_1134_TipoDeCombustivel {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        boolean condition = true;
        int countAlcool = 0;
        int countGas  = 0;
        int countDiesel  = 0;

        while(condition){
            int fuelType = scan.nextInt();

            if (fuelType == 4){
               condition = false;
            } else if(fuelType == 1){
               countAlcool ++;
            } else if(fuelType == 2){
               countGas ++;
            } else if (fuelType == 3){
               countDiesel ++;
            }
        }

        scan.close();

        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\n", countAlcool);
        System.out.printf("Gasolina: %d\n", countGas);
        System.out.printf("Diesel: %d\n", countDiesel);            
    }    
}
