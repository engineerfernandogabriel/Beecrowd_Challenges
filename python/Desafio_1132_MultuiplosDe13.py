'''
 Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.

ENTRADA
 O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

SAíDA
 Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.
'''

valueX = int(input())
valueY = int(input())

if(valueX > valueY):
    aux = valueX
    valueX = valueY
    valueY = aux

sum = 0

for i in range(valueX, valueY + 1):
    if(i % 13 != 0):
        sum += i

print(sum)