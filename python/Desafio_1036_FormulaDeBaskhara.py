'''
 Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
 Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 
ou raiz de numero negativo.

ENTRADA
 Leia três valores de ponto flutuante (double) A, B e C.

SAíDA
 Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
 Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo 
abaixo. Imprima sempre o final de linha após cada mensagem.
'''

import math

valores = list(map(float, input().split()))

valueA, valueB, valueC = valores

delta = (valueB**2) - (4 * valueA * valueC)

if (valueA <= 0 or delta < 0) :
    print('Impossivel calcular')
else :
    raiz1 = (- valueB + math.sqrt(delta)) / (2 * valueA) 
    raiz2 = (- valueB + math.sqrt(delta)) / (2 * valueA)
    print(f'R1 = {raiz1:.5f}')
    #print('R1 = %.5f' %raiz1)
    print(f'R2 = {raiz2:.5f}')
    #print('R2 = %.5f' %raiz2)