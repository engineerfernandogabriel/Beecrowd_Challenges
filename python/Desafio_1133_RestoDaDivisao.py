'''
 Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.

ENTRADA
 O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.

SAíDA
 Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
'''

valueX = int(input())
valueY = int(input())

if(valueX > valueY):
    aux = valueX
    valueX = valueY
    valueY = aux

for i in range (valueX + 1, valueY):
    if(i % 5 == 2 or i % 5 == 3):
        print(i)